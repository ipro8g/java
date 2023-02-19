import java.util.Scanner;

public class Email_validation{

    boolean validation(String email){

        int count1 = 0, c_add = 0;  
        boolean is_ok = false, flag1 = false, flag2 = false, flag_first = true; 

        int last_index = email.length();
        char[] c_arr = email.toCharArray();

        if(email.lastIndexOf('@') > email.lastIndexOf('.')){
            return false;
        }

        if(email.lastIndexOf('.') == last_index - 1 || email.lastIndexOf('@') == last_index - 1){
            return false;
        }

        for(char c: email.toCharArray()){

            if(c == '@'){

                c_add++;
            }
        }

        if(c_add > 1){

            return false;
        }

        for(char c: email.toCharArray()){

            if((c == '.' || c == '@') && flag_first){

                return false;
            }

            flag_first = false;
            
            if(c != '@' && flag1 == false){

                count1++;
            }

            if(c == '@'){
                
                flag1 = true;
                is_ok = true;
            }

        }

        if(count1 == 0 && is_ok == false){
            return false;
        }

        count1 = 0;
        is_ok = false;

        for(char c: email.toCharArray()){
            
            if(c == '.'){
                is_ok = true;
            }

            if(c != '.' && is_ok == true){
                count1++;
            }
        }

        if(is_ok && count1 != 0){
            return true;
        }else{
            return false;
        }

        
    }

    public static void main(String[] args){

        Email_validation e_val = new Email_validation();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your email here");
        String email = input.nextLine();

        if(!e_val.validation(email)){

            System.out.println(email + " is not a valid email direction");    
        }else{

            System.out.println("login with " + email);
        }
    }
}
