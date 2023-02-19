import java.util.*;
import java.io.*;

public class Update_file_prices{

    public void update_file_prices(String file_name){

        int reference;
        double price;
        boolean eof = false;
        RandomAccessFile file = null;

        try{
            file = new RandomAccessFile(file_name, "rw");
            do{
                try{

                    reference = file.readInt();
                    price = file.readDouble();

                    if(price >= 100.00){

                        price = price*1.5;
                    }else{

                        price = price*0.5;
                    }

                    file.seek(file.getFilePointer()-8);
                    file.writeDouble(price);                
                }catch(EOFException e){

                    eof = true;
                    file.close();
                }
            }while(!eof);
        }catch(FileNotFoundException e){

            System.out.println("Not found file");
        }catch(IOException e){

            System.out.println("Read/Write Error");
        }
    }

    public static void main(String[] args){

        Update_file_prices obj = new Update_file_prices();
        String file_name = "the_file";

        try{

            obj.update_file_prices(file_name);
        }catch(Exception e){

            System.out.println("An error has occurred, try again");
        }
    }
}
