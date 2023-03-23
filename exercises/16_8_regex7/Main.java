import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
 
        String regex = "[a-zA-Z0-9_\\s]*", str1 = "gain porq yes", str2 = "asasa# perroG", str3 = "Por9Eg_quq", str4 = "aaiN porq22", str5 = "a_Gain porq99";
        Pattern pattern = Pattern.compile(regex);
    
        Matcher matcher1 = pattern.matcher(str1);
        System.out.println(matcher1.matches());
        
        Matcher matcher2 = pattern.matcher(str2);
        System.out.println(matcher2.matches());
        
        Matcher matcher3 = pattern.matcher(str3);
        System.out.println(matcher3.matches());
        
        Matcher matcher4 = pattern.matcher(str4);
        System.out.println(matcher4.matches());
        
        Matcher matcher5 = pattern.matcher(str5);
        System.out.println(matcher5.matches());
    }
}

// match a string that contains only upper and lowercase letters, numbers, whitespaces and underscores
