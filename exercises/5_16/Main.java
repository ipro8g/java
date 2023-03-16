import java.util.Arrays;

public class Main{

    public static void main(String[] args){
    
        String str = "this is a string";
        byte[] b = str.getBytes();
        
        System.out.println(Arrays.toString(b));
        
        String new_str = new String(b);
        
        System.out.println(new_str);
    }
}
