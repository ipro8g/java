import java.io.*;

public class Main{
    public static void main(String args[]){
    
  
        // try-catch block to handle exceptions
        try {
  
            // Create a file object
            File f = new File("../fantasy_directory");
  
            System.out.println(f.isDirectory());
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}


