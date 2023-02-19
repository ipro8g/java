import java.io.*;
import java.util.*;

public class Array_to_upper{

    public char[] converter(char[] str){

        CharArrayReader read = new CharArrayReader(str);
        CharArrayWriter write = new CharArrayWriter();

        int c;
        
        try{
        while((c = read.read()) != -1){

            if(Character.isLetter(c)){

                c = Character.toUpperCase(c);
            }
        write.write(c);
        }

        read.close();
        write.close();
        return write.toCharArray();
        }catch(Exception e){
            return str;
        }
    }

    public static void main(String[] args){

        Array_to_upper ob = new Array_to_upper();

        char[] str = {'a','b','c','d','e','f','g','h','i','j'};

        char[] str2 = ob.converter(str);
        
        for(char item: str2){

            System.out.println(item);
        }
    }
}
