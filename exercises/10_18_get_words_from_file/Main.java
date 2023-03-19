import java.io.*;
import java.util.*;

public class Main{

    public static String[][] get_words_from_file(String file_name)throws IOException{

        BufferedReader read_stream = new BufferedReader(new FileReader(file_name));

        String read = null;

        String[][] result = new String[100][];
        
        int count = 0;

        while((read = read_stream.readLine()) != null){

            result[count++] = read.split(" ");
        }

        read_stream.close();

        return result;
    }

    public static void main(String[] args){

        String[][] result = new String[100][];

        try{

            result = get_words_from_file("../linux notes/mongodb");

        }catch(IOException e){

            System.out.println("Error, could not open file");
        }

        for(String[] line: result){
            
            for(String w: line){
            
                System.out.print(w + " ");
            }
            
            System.out.println();
        }
    }
}
