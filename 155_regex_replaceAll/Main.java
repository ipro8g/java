import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        String regex = "[^aeiou\\s]||[^AEIOU\\s]", str = "this is a test string", result = "";

        
        System.out.println(str.replaceAll(regex, "x"));
   }
}

// replace all vowels with x
