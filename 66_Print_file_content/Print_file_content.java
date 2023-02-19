import java.io.*;
import java.util.*;

public class Print_file_content{

    public void print_content(String file_name)throws IOException{

        BufferedReader read_stream = new BufferedReader(new FileReader(file_name));

        String read = null;

        while((read = read_stream.readLine()) != null){

            System.out.println(read);
        }

        read_stream.close();
    }
    
    public static void main(String[] args){

        Print_file_content obj = new Print_file_content();
        
        String file_name = "the_file";

        try{

            obj.print_content(file_name);
        }catch(IOException e){

            System.out.println("Error, could not open file");
        }       
    }
}
