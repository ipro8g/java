import java.io.*;
import java.util.*;

//this program write string into a text file

public class Write_strs_to_file{

    public void write(String[] strings, String file_name)throws IOException{

        PrintWriter write_stream = new PrintWriter(
                                    new BufferedWriter(
                                        new FileWriter(file_name)));

        for(String str: strings){

            if(str != null){
                write_stream.println(str);
            }
        }

        write_stream.close();
    }

    public String[] read(String file_name)throws IOException{

        BufferedReader read_stream = new BufferedReader(
                                        new FileReader(file_name));

        String read = null;
        ArrayList<String> all = new ArrayList<String>();

        while((read = read_stream.readLine()) != null){

            all.add(read);
        } 

        read_stream.close();

        return((String[])all.toArray(new String[all.size()]));
    }
    
    public static void main(String[] args){

        Write_strs_to_file obj = new Write_strs_to_file();

        String file_name = "the_file";

        String[] strings_back = new String[3];

        String[] strings = {"Lemon","Apple","Orange"};

        try{

            obj.write(strings, file_name);
        }catch(IOException e) {

            e.printStackTrace();
        }

        try{

            strings_back = obj.read(file_name);
        }catch(IOException e) {

            e.printStackTrace();
        }

        for(String str: strings_back){

            System.out.println(str);
        }
    }
}
