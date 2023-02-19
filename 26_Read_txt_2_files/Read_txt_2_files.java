//this reads data from  2 .txt files

import java.io.*;
import java.util.*;

public class Read_txt_2_files{
    public static void main(String[] args){

        //note the .txt extension avoid
        String op1 = "/home/mate/Desktop/java/26_Read_txt_2_files/the_file";
        String op2 = "/home/mate/Desktop/java/26_Read_txt_2_files/the_file2";
      
        Read_txt_2_files read_txt = new Read_txt_2_files();

        System.out.println("First character on 1st file: " + read_txt.read_file(op1));
        System.out.println("First character on 2nd file: " + read_txt.read_file(op2));
    }

    char read_file(String op){
        FileReader read;

        try{
            
            read = new FileReader(op);
            char pcar = (char)read.read();
            read.close();

           return(pcar);

            
        }catch(FileNotFoundException fnfE){

            System.out.println("The file cannot be opened");
        }catch(IOException ioE){

            System.out.println("Read Error");
        }

        return '\0';
    }
}
