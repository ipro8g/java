import java.io.*;
import java.util.*;

public class Ask_validation{

    public boolean validate(String question){

        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in),1);

        String answer = null;

        boolean is_right = true;

        do{
            System.out.println(question);

            try{

                answer = keyboard.readLine().toUpperCase();

                if(!answer.equals("Y")&&!answer.equals("N")){

                    throw new Exception("answer must be Y N or y n");
                }

                is_right = true;
            }catch(IOException ioE){

                System.out.println("i/o error");
                System.out.println(ioE.toString());
                is_right = false;
            }catch(Exception confE){

                System.out.println("answer error");
                System.out.println(confE.toString());
                is_right = false;
            }

        }while(!is_right);

        return(answer.equals("Y")?true:false);
    }

    public static void main(String[] args){

        String question = "is virus vaccine mandatory in your country?";

        Ask_validation obj = new Ask_validation();

        if(obj.validate(question)){

            System.out.println("yes it is!");
        }else{

            System.out.println("Not is!");    
        }
    }
}
