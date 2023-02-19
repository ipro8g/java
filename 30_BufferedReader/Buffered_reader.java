//this reads a first line on a file

import java.io.*;
import java.util.*;

public class Buffered_reader{

    String read_first_line(String the_file){

        try{

        BufferedReader reader = new BufferedReader(
                                    new FileReader(the_file));
        
        String f_line = reader.readLine();
        reader.close();
        return f_line;

        }catch(FileNotFoundException fnfE){

            System.out.println("The file cannot be opened");
        }catch(IOException ioE){

            System.out.println("Read Error");
        }
        
        
        return the_file;
    }

    public static void main(String[] args){

         Buffered_reader b_reader = new Buffered_reader();
         String the_file = "/home/mate/Desktop/java/30_BufferedReader/the_file";
         System.out.println(b_reader.read_first_line(the_file));
    }
}
