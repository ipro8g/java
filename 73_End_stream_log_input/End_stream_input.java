import java.util.*;
import java.io.*;

public class End_stream_input{

    public static void main(String[] args){
        Scanner key_reader = new Scanner(System.in);
        PrintWriter log = null;

        try{

            log = new PrintWriter(new BufferedWriter(new FileWriter("log.txt")));
            String read = null;

            while(!(read = key_reader.nextLine()).toLowerCase().equals("end")){

                System.out.println("you have entered: " + read);
                log.println(read);
            }
            
            log.close();
        }catch(IOException ioE){

            System.out.println(ioE.toString());
        }
    }
}
