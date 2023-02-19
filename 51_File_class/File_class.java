import java.io.*;
import java.util.*;

public class File_class{

    public static void main(String arg[]){

        String directory = "";

        if(arg.length > 0){

            directory = arg[0];
        }else{

            directory = ".";
        }

        //directory = "/";

        File current = new File(directory);
        System.out.println("The directory is: ");
    
        try{

            System.out.println(current.getCanonicalPath());
        }catch(IOException e){}

    
    System.out.println("Their content is:");

    File[] files = current.listFiles();

    for(File file : files){

        System.out.printf("%-15s", file.getName());

        if(file.isFile()){

            System.out.printf("%6d",file.length());
            System.out.printf("%1$tD %1$tT", new Date(file.lastModified()));
        }

        System.out.println();
    }

    }
}
