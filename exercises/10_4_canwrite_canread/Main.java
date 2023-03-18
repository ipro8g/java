import java.io.*;

public class Main{
    public static void main(String args[]){
    
  
        // try-catch block to handle exceptions
        try {
  
            // Create a file object
            File f = new File("../linux notes");
  
            System.out.println("can write? " + f.canWrite());
            System.out.println("can read? " + f.canRead());
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}


