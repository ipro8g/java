import java.util.*;
import java.io.*;

public class Write_array{
    public static void main(String[] args){

        byte[] byte_arr1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        ByteArrayInputStream stream_arr_byte1 = new ByteArrayInputStream(byte_arr1);

        while(stream_arr_byte1.available() != 0){

            byte readed = (byte)stream_arr_byte1.read();
            System.out.println(readed);
        }
        
        try{

            stream_arr_byte1.close();
        }catch(Exception e){

            System.out.println("an error has occured");
        }
    }
}
