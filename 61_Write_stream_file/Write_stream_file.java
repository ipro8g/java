import java.io.*;
import java.util.*;

public class Write_stream_file{

    String[] read_stream_file(String file_name) throws IOException{
        
        FileReader file = new FileReader(file_name);
        
        ArrayList<String> all = new ArrayList<String>();

        int reading;

        CharArrayWriter str = new CharArrayWriter();

        while((reading = file.read()) != -1){
            
            char ch = (char)reading;

            if(ch == '*'){

                str.close();
                all.add(str.toString());
                str.reset();
            }else{

                str.write(ch);
            }
        }
        
        return((String[])all.toArray(new String[all.size()]));
    }
    
    void write_stream_file(String file_name, String[] streams) throws IOException{
        
        FileWriter writer = new FileWriter(file_name);

        for(String str: streams){

            for(int i = 0; i < str.length(); i++){

                writer.write(str.charAt(i)); // method toCharArray() works fine too
            }
            
            writer.write('*');
        }
        writer.close();                
    }


    public static void main(String[] args){
        Write_stream_file obj = new Write_stream_file();

        String file_name = "first_file";

        String[] streams = {"String One","String Two","String Three"};
        String[] streams_back = new String[3];

        try{

            obj.write_stream_file(file_name, streams);
        }catch(IOException e) {

            e.printStackTrace();
        }

        try{

            streams_back = obj.read_stream_file(file_name);
        }catch(IOException e) {

            e.printStackTrace();
        }

        System.out.println("The content saved is: ");

        for(String str: streams_back){

            System.out.println(str);
        }

        
    }
}
