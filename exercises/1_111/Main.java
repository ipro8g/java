public class Main{

    public static void main(String[] args){
    
        int n = 7;
        
        System.out.println(factorial(7));
    }
    
    public static int factorial(int n){
    
        int acum = 1;
    
        for(int a = 1; a <= n; a++){
        
            acum *= a;
        }
        
        return acum;
    }
}
