public class Main{

    public static void main(String[] args){
    
        String bin1 = "10";
        String bin2 = "11";
        
        int sum = Integer.parseInt(bin1) + Integer.parseInt(bin2);
        
        System.out.println(Integer.toBinaryString(sum));
    }
}
