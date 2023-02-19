import java.io.*;
import java.util.*;

public class Get_file_prices{
    public void get_file_prices(int[] references, double[] prices, String file_name) throws IOException{
        RandomAccessFile file = new RandomAccessFile(file_name, "rw");

        for(int i = 0; i < references.length && i < prices.length; i++){
            file.writeInt(references[i]);
            file.writeDouble(prices[i]);
        }

        file.close();
    }

    public static void main(String[] args){

        Get_file_prices obj = new Get_file_prices();

        int[] references = {12,14,16,18,20};
        double[] prices = {123.44,180.66,190.00,310.50,80.77};

        String file_name = "the_file";

        try{

            obj.get_file_prices(references, prices, file_name);
        }catch(Exception e){

            System.out.println("An error has occurred, try again");
        }
    }
}
