public class Main{

    public static void main(String[] args){
    
        String str = "xxxabcxxxx";
        String[] str_arr = str.split("abc");
        
        
        for(String s: str_arr){
        
            System.out.println(s);
        }
    }
}
