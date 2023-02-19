//this creates and save two arrays of 5 odds and 5 pairs

import java.util.*;

public class Odds_Pairs_arrays{
    public static void main(String args[]){
        int odds[] = new int[5];
        int pairs[] = new int[5];
        int count_odds = 0, count_pairs = 0, result = 0;

        while(count_odds <= 5 && count_pairs <= 5){
            result = (int)(Math.random()*100) + 1;
            
            if(count_pairs == 5 && count_odds == 5){

                break;
            }else if((result % 2 == 0) && count_pairs < 5){

                pairs[count_pairs] = result;
                count_pairs++;
            }else if((result % 2 != 0) && count_odds < 5){

                odds[count_odds] = result;
                count_odds++;
            }

        }

        System.out.println("The odd values array as follow");
        for(int value: odds){
            System.out.println(value);
        }

        System.out.println("\n");

        System.out.println("The pair values array as follow");
        for(int value: pairs){
            System.out.println(value);
        }
    }
}
