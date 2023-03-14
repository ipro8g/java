public class Main{

    public static void main(String[] args){
    
        String str = "The quick brown fox";
        char[] str_arr = str.toCharArray();
        
        System.out.println(checksum(str_arr));
    }
    
    public static int checksum(char[] str_arr){
    
        int acum = 0;
        
        for(char c: str_arr){
        
            acum += (int)c;
        }
        
        return acum;
    }
}
