import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        String regex = "[a-z&&[^aeiou\\s]]||[A-Z&&[^AEIOU\\s]]", str = "this is a test string";
        Pattern pattern = Pattern.compile(regex);
        int vowel_count = 0;
        String[] arr = str.split("");
    
        for(String s: arr){
    
            Matcher matcher1 = pattern.matcher(s);
            if(matcher1.matches()){
            
                vowel_count++;
            }
        }
        
        System.out.println("number of vowels: " + vowel_count);
   }
}

// count number of vowels in a given string using regular expression
