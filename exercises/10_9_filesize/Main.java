import java.io.*;
import java.text.SimpleDateFormat;  
import java.util.Date;  

public class Main{
    public static void main(String args[]){
    
  
        // try-catch block to handle exceptions
        try {
  
            // Create a file object
            File f = new File("../linux notes/mongodb");
  
            System.out.printf("%6d bytes",f.length());
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}


