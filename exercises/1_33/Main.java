public class Main{

    public static void main(String[] args){
    
        int n = 25;
        String num = String.valueOf(n);
        char[] digits = num.toCharArray();
        int sum = 0;
        
        for(char c: digits){
        
            sum += Integer.parseInt(String.valueOf(c));
        }
        
        System.out.println(sum);
    }
}
