import java.io.*;
import java.util.*;

public class Main{

    public static String get_lines_from_file(String file_name)throws IOException{

        BufferedReader read_stream = new BufferedReader(new FileReader(file_name));

        String read = null;
        String result = "";
        
        while((read = read_stream.readLine()) != null){

            result += read + "\n";
        }

        read_stream.close();

        return(result);
    }

    public static void main(String[] args){

        String result = "";
        
        try{

            result = get_lines_from_file("../linux notes/mongodb");

        }catch(IOException e){

            System.out.println("Error, could not open file");
        }
        
        System.out.println(result);
    }
}
