import java.lang.Math;
import java.text.DecimalFormat;

public class Main{

    public static void main(String[] args){
 
        
        System.out.println("round 4/3 to the nearest integer: " + Math.round(4/3));
        
        System.out.println("round get both whole and fractional parts 4/3: " + Math.round(4/3) + " and " + ((double)4/3 - Math.round(4/3)));
        
        boolean result = (3 == (double)3) ? true : false;
        
        System.out.println(3 + " equals to " + (double)3 + "?: " + result);  
        
        DecimalFormat df = new DecimalFormat("#.00000"); 
        float number = Float.valueOf(df.format(Math.PI));
        
        System.out.println("PI rounded to 5 decimals: " + number); 
        
        String str_pi = Float.toString(number*10000);
        String[] arr = str_pi.split("");
        
        System.out.println("reversed: ");
        
        for(int a = arr.length-1; a >= 0; a--){
        
            String res = (!arr[a].equals(".")) ? arr[a] : "";
        
            System.out.print(res);
        }
        
        System.out.println("PI abs: " + Math.abs(Math.PI));
        
        String[] bin_arr = Integer.toBinaryString(123456789).split("");
        
        int count = 0;
        int max = 0;
        
        for(String s: bin_arr){
        
            System.out.print(s);
        
            if(s.equals("0")){
            
                count++;
                
                if(count > max){
                
                    max = count;
                }
            }else{
            
                count = 0;
            }
        }
        
        System.out.println("\nthe max number of 0's is: " + max);
        
        System.out.println("\nthe square root of 70 with babylon method is: " + sqRoot(70));
    }
    
    public static float sqRoot(float number) {
    
        float x = number, y = 1;              //initial guess as number and 1
        float precision = (float)0.000001;           //the result is correct upto 0.000001

        while(Math.abs(x - y)/Math.abs(x) > precision) {
    
            x = (x + y)/2;
            y = number/x;
        }
    
        return x;
    }
}
