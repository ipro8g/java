import java.io.*;
import java.util.*;

public class Read_from_file_as_string_array{

    public String[] get_lines_from_file(String file_name)throws IOException{

        BufferedReader read_stream = new BufferedReader(new FileReader(file_name));

        String read = null;

        ArrayList<String> all = new ArrayList<String>();

        while((read = read_stream.readLine()) != null){

            all.add(read);
        }

        read_stream.close();

        return((String[])all.toArray(new String[all.size()]));
    }

    public static void main(String[] args){

        Read_from_file_as_string_array obj = new Read_from_file_as_string_array();

        String[] result = new String[20];
    
        String str = "";

        for(int i = 1; i <= 100; i++){

            str += i + " ";

            if(i%10 == 0){

                str += '\n';
            }
        }    

        String file_name = "natural_numbers.txt";

        FileWriter write;

        try{
            write = new FileWriter(file_name);

            write.write(str);

            write.close();
        }catch(IOException e){

            System.out.println("Error, could not open file");
        }

        try{

            result = obj.get_lines_from_file("natural_numbers.txt");

        }catch(IOException e){

            System.out.println("Error, could not open file");
        }

        for(String str2: result){
            
            System.out.println(str2);
        }
    }
}
