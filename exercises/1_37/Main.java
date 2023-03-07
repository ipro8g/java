public class Main{

    public static void main(String[] args){
    
        String str = "The quick brown fox ";
        char[] arr = str.toCharArray();
        
        String result = "";
        
        for(int u = str.length()-1; u >= 0; u--){
        
            result += String.valueOf(arr[u]);
        }
        
        System.out.println(result);
    }
}
