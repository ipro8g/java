import java.io.*;

public class Read_keyboard{

    public static void main(String[] args){

        InputStreamReader converter;
        BufferedReader keyboard;
        String line;

        converter = new InputStreamReader(System.in);
        keyboard = new BufferedReader(converter);

        System.out.print("Enter a byte: ");
        line = keyboard.readLine();
        byte b = Byte.parseByte(line);
        System.out.println("The value is: " + b);

        System.out.print("Enter a integer: ");
        line = keyboard.readLine();
        int i = Integer.parseInt(line);
        System.out.println("The read value is: " + i);   

        System.out.print("Enter a double: ");
        line = keyboard.readLine();
        double d = Double.parseDouble(line);
        System.out.println("The value is: " + d);

        boolean readed;

        do{

            try{

                System.out.print("Enter a integer: ");
                line = keyboard.readLine();
                i = Integer.parseInt(line);
                readed = true;
            }catch(NumberFormatException e){

                System.out.println("Not valid number, try again");
                readed = false;
            }

        }while(!readed);

        System.out.println("The value is: " + i);
    }
}
