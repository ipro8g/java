import java.io.*;
import java.text.SimpleDateFormat;  
import java.util.Date;  

public class Main{
    public static void main(String args[]){
    
  
        // try-catch block to handle exceptions
        try {
  
            // Create a file object
            File f = new File("../linux notes/mongodb");
  
            Date d = new Date(f.lastModified());
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:MM:SS");  
            String strDate = formatter.format(d);  
            System.out.println(strDate);  
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}


