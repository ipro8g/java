//this ask for a number between 1 and 100 and compares it if is guessed

import java.util.*;
import java.io.*;

public class Generic_exception{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        int unknow_number = 0, number = 0, attempts = 0;
        boolean flag1 = false;

        do{
        
        //this method generates from 0 to 99, so is neccesary to add 1
        unknow_number  = (int)(Math.random()*100)+1;

        }while(unknow_number < 1 || unknow_number > 100);
        
        do{

        try{

            attempts++;

            System.out.println("Try to guess the number from 1 to 100, enter your option here: ");

            number = input.nextInt();

            if(number > unknow_number){

                System.out.println("\nThe searched number is minor, try again\n");
            }else if(number < unknow_number){

                System.out.println("\nThe searched number is major, try again\n");
            }

        }catch(Exception e){

            System.out.println(e.getMessage());
            
            number = 0;

            flag1 = true;

            break;
        }

        }while(number != unknow_number);
        
        if(flag1){

            System.out.println("You lost, try again");
        }else{

            System.out.println("You guess in " + attempts + " attempts");
        }
    }
}
