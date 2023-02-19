import java.util.*;
import java.io.*;

public class Combine_streams{
    public static void main(String[] args){

        byte[] byte_arr1 = {2,4,6,8,10,12,14,16,18,20};
        byte[] byte_arr2 = {1,3,5,7,9,11,13,15,17,19};

        ByteArrayInputStream stream_arr_byte1 = new ByteArrayInputStream(byte_arr1);
        ByteArrayInputStream stream_arr_byte2 = new ByteArrayInputStream(byte_arr2);
        SequenceInputStream stream_sec = new SequenceInputStream(stream_arr_byte1, stream_arr_byte2);

        try{

            byte b = 0;

            while((b = (byte)stream_sec.read()) != -1){
                System.out.println(b);            
            }

            stream_arr_byte1.close();
            stream_arr_byte2.close();
            stream_sec.close();

        }catch(IOException ioE){

            System.out.println(ioE.toString());
        }
    }
}
