import java.util.*;
import java.io.*;

public class Validate_int{

    public int ask_int(String msg)throws IOException{

        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        int integer = 0;
        boolean is_right = true;

        do{
            System.out.println(msg);

            try{

                integer = Integer.parseInt(keyboard.readLine());
                is_right = true;
            }catch(IOException ioE){

                System.out.println("an i/o error has occurred");
                System.out.println("error: " + ioE.toString());
                is_right = false;
            }catch(NumberFormatException numForE){

                System.out.println("casting error, must be an Integer value");
                System.out.println("error: " + numForE.toString());
                is_right = false;
            }
        }while(!is_right);

        return(integer);
    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        Validate_int obj = new Validate_int();

        System.out.println("Enter data: ");

        String msg = input.nextLine();

        try{

            obj.ask_int(msg);
        }catch(IOException e){

            System.out.println("an error has occurred, try again");
        }
    }
}
