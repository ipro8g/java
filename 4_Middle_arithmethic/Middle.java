import java.util.Scanner;

public class Middle{

    public static double middle_arith(double ... numbers){
        double acum = 0.0;

        for(double num: numbers){
            acum += num;        
        }

        return acum / numbers.length;
    }

    public static void main(String[] args){
        
        double result = middle_arith(2, 3, 5, 8, 14);
        System.out.println("the result is: " + result);
    }
}
