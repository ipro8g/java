import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
 
        String regex = ".*g.*|.*G.*", str1 = "again porq yes", str2 = "asasaperroG", str3 = "Porquq", str4 = "aain porq";
        Pattern pattern = Pattern.compile(regex);
    
        Matcher matcher1 = pattern.matcher(str1);
        System.out.println(matcher1.matches());
        
        Matcher matcher2 = pattern.matcher(str2);
        System.out.println(matcher2.matches());
        
        Matcher matcher3 = pattern.matcher(str3);
        System.out.println(matcher3.matches());
        
        Matcher matcher4 = pattern.matcher(str4);
        System.out.println(matcher4.matches());
    }
}

// contains the character 'g' in a given string.
