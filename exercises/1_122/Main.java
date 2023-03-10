public class Main{

    public static void main(String[] args){
    
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int max = 0;
        int[] winner_arr = new int[4];
        
        for(int i = 0; i < arr.length; i++){
        
            int[] check_arr = new int[4];
        
            if(i <= arr.length - 4){
            
                for(int b = 0; b < 4; b++){
            
                    check_arr[b] = arr[i + b];
                }
            
                int efficiency = check(check_arr);
            
                if(efficiency > max){
            
                    max = efficiency;
                    winner_arr = check_arr;
                }
            }
        }
        
        for(int n: winner_arr){
            
                System.out.print(n + "\t");
        }
    }
    
    public static int check(int[] arr){
    
        int acum = 0;
        
        for(int n: arr){
        
            acum += n;
        }
        
        return acum;
    }
}
