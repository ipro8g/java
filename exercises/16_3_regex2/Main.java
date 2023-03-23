import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
 
        String regex = ".+[a-z]+_[a-z]+.+", str1 = "A_d", str2 = "#Aasdt_cssZ#", str3 = "AN_AN_AN";
        Pattern pattern = Pattern.compile(regex);
    
        Matcher matcher1 = pattern.matcher(str1);
        System.out.println(matcher1.matches());
        
        Matcher matcher2 = pattern.matcher(str2);
        System.out.println(matcher2.matches());
        
        Matcher matcher3 = pattern.matcher(str3);
        System.out.println(matcher3.matches());
    }
}

//matches a sequences of lowercase letters joined with a underscore
