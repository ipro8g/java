import java.util.ArrayList;

public class Main{

    public static void main(String[] args){
    
        String str = "the quick brown fox jumps over the lazy dog.";
        String[] str_arr = str.split(" ");
        ArrayList<String> new_arr = new ArrayList<>();
        
        for(String s: str_arr){
        
            char[] char_arr = s.toCharArray();
            char_arr[0] = String.valueOf(char_arr[0]).toUpperCase().charAt(0);
            new_arr.add(String.valueOf(char_arr));
        }
        
        String result = "";
        
        for(String s: new_arr){
        
            result += s + " ";
        }
        
        System.out.println(result);
    }
}


