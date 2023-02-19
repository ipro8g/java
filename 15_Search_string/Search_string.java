import java.util.Scanner;

public class Search_string{

    //search and count string times
    int search_s(String comp, String searc){
        int pos = 0;
        int times = 0;
        
        while((pos = comp.indexOf(searc, pos)) >= 0){
            pos += searc.length();
            times++;
        }return times;
    }

    public static void main(String args[]){
        Search_string S_string = new Search_string();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the complete string here");
        String comp_str = input.nextLine();

        System.out.println("Enter string to search here");
        String sea_str = input.nextLine();

        System.out.println("The string: " + sea_str + " has appeared " + S_string.search_s(comp_str, sea_str) + " times");
    }
}
