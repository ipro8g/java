public class Main{

    public static void main(String[] args){
    
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
    }
}


