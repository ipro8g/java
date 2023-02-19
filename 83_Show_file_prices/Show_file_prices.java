import java.util.*;
import java.io.*;

public class Show_file_prices{

    public void show_file_prices(String file_name)throws IOException{

        int reference;
        double price;
        boolean eof = false;
        RandomAccessFile file = null;
        file = new RandomAccessFile(file_name, "rw");

        do{
            try{

                reference = file.readInt();
                System.out.println("Reference: " + reference);
                price = file.readDouble();
                System.out.println("Price: " + price);
            }catch(EOFException e){

                eof = true;
                file.close();
            }
        }while(!eof);
    }

    public static void main(String[] args){

        Show_file_prices obj = new Show_file_prices();
        String file_name = "the_file";

        try{

            obj.show_file_prices(file_name);
        }catch(Exception e){

            System.out.println("An error has occurred, try again");
        }
        
    }
}
