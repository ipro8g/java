import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        String regex1 = "[0-9]{8}", regex2 = "[0-9]{11}", regex3 = "[a-zA-Z_.0-9]+[@]{1}[a-zA-Z0-9]+[.]{1}[a-zA-Z0-9]+", pin = "12345678", telephone = "00003331177", email = "email@email.e", pin2 = "jffgk3434", telephone2 = "0008877", email2 = "Af_Os.p@kfkf.123";

        
        Pattern pattern1 = Pattern.compile(regex1);
        Pattern pattern2 = Pattern.compile(regex2);
        Pattern pattern3 = Pattern.compile(regex3);
    
        Matcher matcher1 = pattern1.matcher(pin);
        Matcher matcher2 = pattern2.matcher(telephone);
        Matcher matcher3 = pattern3.matcher(email);
    
        Matcher matcher4 = pattern1.matcher(pin2);
        Matcher matcher5 = pattern2.matcher(telephone2);
        Matcher matcher6 = pattern3.matcher(email2);
        
        System.out.println("is a pin number?: " + matcher1.matches());
        System.out.println("is a telephone number?: " + matcher2.matches());
        System.out.println("is an email?: " + matcher3.matches());
        
        System.out.println("is a pin number?: " + matcher4.matches());
        System.out.println("is a telephone number?: " + matcher5.matches());
        System.out.println("is an email?: " + matcher6.matches());
   }
}

//validate PIN number 8 digits, email and telephone number 11 digits
