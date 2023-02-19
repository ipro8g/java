import java.util.Scanner;

public class Count_words{
    
    //return total number of words
    int count_w(String str){
        String[] words = str.trim().split(" +");
        
        return words.length;
    }

    public static void main(String args[]){
        Count_words C_words = new Count_words();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the complete string here");
        String comp_str = input.nextLine();

        System.out.println(comp_str + " has " + C_words.count_w(comp_str) + " words in total");
    }
}
