import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
 
        String regex = ".+[A-Z]?[a-z]+.+", str1 = "-Adas_r", str2 = "EAas555", str3 = "eANAN";
        Pattern pattern = Pattern.compile(regex);
    
        Matcher matcher1 = pattern.matcher(str1);
        System.out.println(matcher1.matches());
        
        Matcher matcher2 = pattern.matcher(str2);
        System.out.println(matcher2.matches());
        
        Matcher matcher3 = pattern.matcher(str3);
        System.out.println(matcher3.matches());
    }
}

//sequences of one upper case letter followed by lower case letters
