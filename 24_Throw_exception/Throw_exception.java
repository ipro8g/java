//this fill an 5 digits array with odd numbers

import java.util.*;

public class Throw_exception{
    public static void main(String[] args){
        int[] odds = new int[5];
        int t_attempts = 0, s_attempts = 0, result = 0;

        try{
            while(true){
                result = (int)(Math.random()*100) + 1;
                t_attempts++;

                if(s_attempts == 5){
                    throw new Exception("We generated the sequence in: " + t_attempts + " attempts");
                }

                if(result % 2 != 0 && result != 0){
                    
                    odds[s_attempts] = result;
                    s_attempts++;
                }
                
            }

            }catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println("The sequence generated is: " + odds[0] + " " + odds[1] + " " + odds[2] + " " + odds[3] + " " + odds[4]);
            }
    }
}
