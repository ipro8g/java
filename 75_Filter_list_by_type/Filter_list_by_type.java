import java.io.*;
import java.util.*;

public class Filter_list_by_type implements FilenameFilter{

    public boolean accept(File dir, String name){

        boolean r = true;

        if(new File(dir.getAbsolutePath() + "/" + name).isFile() && name.length() >= 4 && name.toLowerCase().lastIndexOf(".pdf") == name.length() - 4){

            return true;
        }

        return false;
    }

    public static void main(String[] args){
        
        File my_pdf_files = new File("/home/vndos/Desktop/java");

        String[] pdf_files = my_pdf_files.list(new Filter_list_by_type());

        for(String str: pdf_files){

            System.out.println("pdf: " + str);
        }
    }
}
