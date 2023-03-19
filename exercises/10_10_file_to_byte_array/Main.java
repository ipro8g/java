import java.io.*;
import java.nio.file.Files;

public class Main{
    public static void main(String args[]){
    
  
        // try-catch block to handle exceptions
        try {
  
            // Create a file object
            File f = new File("../linux notes/mongodb");
            byte[] fileContent = Files.readAllBytes(f.toPath());
            System.out.println(fileContent);
            
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
