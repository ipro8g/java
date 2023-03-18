import java.io.*;

public class Main{
    public static void main(String args[]){
    
  
        // try-catch block to handle exceptions
        try {
  
            // Create a file object
            File f = new File("../linux notes/mongodb");
  
            System.out.println("is file? " + f.isFile());
            System.out.println("is directory? " + f.isDirectory());
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}


