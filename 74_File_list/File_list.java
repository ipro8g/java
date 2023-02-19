import java.io.*;
import java.util.*;

public class File_list{

    public static void main(String[] args){

        File my_files = new File("/home/vndos/Desktop/java");
        String[] files = my_files.list();

        for(String str: files){

            System.out.println(str);
        }
    }
}
