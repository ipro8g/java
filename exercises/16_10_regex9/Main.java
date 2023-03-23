import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        System.out.println(validate("192.108.0.01"));
        System.out.println(validate("216.08.094.196"));
		System.out.println(validate("08.008.0008.00008"));
		System.out.println(validate("01.102.103.104"));
		
		System.out.println("now my way");
		
		System.out.println(myvalidate("192.108.0.01"));
		System.out.println(myvalidate("216.08.094.196"));
		System.out.println(myvalidate("08.008.0008.00008"));
		System.out.println(myvalidate("01.102.103.104"));
   }

   public static String myvalidate(String ip) {
   
          String[] arr = ip.split("");
          String result = "";
        
        for(int a = 0; a < arr.length; a++){
            
            if(a > 0 && a < arr.length-1){
        
            String regex = "[1-9]";
            Pattern pattern = Pattern.compile(regex);
    
            Matcher matcher1 = pattern.matcher(arr[a]);
            
            Matcher matcherp = pattern.matcher(arr[a-1]);
            Matcher matchern = pattern.matcher(arr[a+1]);
            
            if((arr[a].equals("0") && arr[a+1].equals(".") && arr[a-1].equals(".")) || (arr[a].equals("0") && matchern.matches() && matcherp.matches()) || arr[a].equals(".") || matcher1.matches()){
            
                result += arr[a];
                
            }
            
            }else if(a == 0){
            
                if(!arr[a].equals("0")){
                
                    result += arr[a];
                }
            }else if(a == arr.length-1){
            
                String regex = "[1-9]";
                Pattern pattern = Pattern.compile(regex);
    
                Matcher matcher1 = pattern.matcher(arr[a]);
            
                if(matcher1.matches()){
                
                    result += arr[a];
                }
            }
        }
        
        return result;
   }

   public static String validate(String ip) {
   
          return ip.replaceAll("(?<=^|\\.)0+(?!\\.|$)","");
   }
}

// Write a Java program to remove leading zeros from a given IP address.
