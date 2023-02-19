//this reads data from .txt file 

import java.io.*;
import java.util.*;

public class Read_txt{
    public static void main(String[] args){
        FileReader read;

        try{
            //note the .txt extension avoid
            read = new FileReader("/home/mate/Desktop/java/25_Read_txt/the_file");
            char pcar = (char)read.read();

            System.out.println("First character: " + pcar);

            read.close();
        }catch(FileNotFoundException fnfE){

            System.out.println("The file cannot be opened");
        }catch(IOException ioE){

            System.out.println("Read Error");
        }
      
    }
}
