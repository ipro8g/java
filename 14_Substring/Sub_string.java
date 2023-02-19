import java.util.Scanner;

public class Sub_string{

        //strip string
        String sub_st(String str){
        int f_point = str.length();

        return str.substring(f_point/2, f_point);
        }

    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        Sub_string sub_str = new Sub_string();
        System.out.println(sub_str.sub_st(str));
    }
}   
