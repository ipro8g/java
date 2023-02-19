import java.util.*;
import java.io.*;

public class Serial_class{

    public static void main(String[] args){

        try{

            FileOutputStream file = new FileOutputStream("test.dat");
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject("today is: ");

            out.writeObject(new Date());

            out.close();

        }catch(IOException e){

            System.out.println("an error has occured");
        }

        try{

            FileInputStream file2 = new FileInputStream("test.dat");
            ObjectInputStream in = new ObjectInputStream(file2);

            String today = (String)in.readObject();
            Date date = (Date)in.readObject();

            in.close();

            System.out.println(today + date);

        }catch(FileNotFoundException e){

            System.out.println("file could not be opened");
        }catch(IOException e){

            System.out.println("an error has occured");
        }catch(Exception e){

            System.out.println("error reading the file");
        }
    }
}
