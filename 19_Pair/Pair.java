import java.util.Scanner;

public class Pair{
    boolean check(int number){
        return (number % 2 == 0 ? true : false);
    }
    
    public static void main(String[] args){
     Scanner input = new Scanner(System.in);   
     Pair pair = new Pair();
     System.out.println("Enter number here: ");

     int number = input.nextInt();

     System.out.println(number + (pair.check(number) == true ? " is a Pair number." : " is an Odd number."));        
    }
}
