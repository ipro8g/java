import java.util.Scanner;

//this script shows all numbers factors
public class Factors{
    int factors[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    int count;


    void desc(int number){
        for(int a = 2; a < number; a++){

            if(number % a == 0){

                this.factors[this.count] = a;
                this.count++;
            }
        }
    }

    void prints(){
        for(int a = 0; a < 18; a++){

            if(this.factors[a] != '\0'){

                System.out.println(this.factors[a]);            
            }
        }
    }

    public static void main(String[] args){
        Factors fact = new Factors();        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number here to analyse it: ");
        
        int number = input.nextInt();

        fact.desc(number);
        fact.prints();
    }
}
