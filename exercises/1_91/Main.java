/*import java.time.Duration;
import java.time.Instant;*/

public class Main{

    public static void main(String[] args){
    
        long start = System.currentTimeMillis();
    
        int n = 20456;
        
        while(n > 1){
        
            if(n % 2 == 0){
            
                n /= 2;
            }else{
            
                n *= 3;
                n++;
            }
            
            System.out.println(n);
        }
    
        long end = System.currentTimeMillis();
        
        System.out.println("\nthe entire process took: \n" + (end - start) + " miliseconds");
    }
}


