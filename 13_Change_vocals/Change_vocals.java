import java.util.Scanner;

public class Change_vocals{

        //replace vocals with a
        String change(String str){

        str = str.replace('e', 'a');
        str = str.replace('i', 'a');
        str = str.replace('o', 'a');
        str = str.replace('u', 'a');

        return str;
        }

        String change_is_and_digits(String str){

        str = str.replaceAll("is", "adult");
        str = str.replaceAll("\\d+", "*");

        return str;
        }

    public static void main(String[] args){
        Change_vocals Str = new Change_vocals();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string to change all its vocals by \"a\"");
        String str = input.nextLine();

        System.out.println(Str.change(str));

        System.out.println("Enter another string to change all \"is\" by \"adult\" and every digits sequence by \"*\"");
        str = input.nextLine();

        System.out.println(Str.change_is_and_digits(str));
    }
}   
