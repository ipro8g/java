import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;

public class Main{

    public static void main(String[] args){
    
        int n = 5;
        
        int[][] matrix = new int[16][5];
        
        int count1 = 0; 
        
        for(int a = 0; a < 30; a++){
        
            int[] result = simulate(n);
            
            boolean flag = false;
            
            for(int[] row: matrix){
            
                if(Arrays.equals(row, result)){
                
                    flag = true;
                }
            }
            
            if(!flag){
            
                    matrix[count1] = result;
                    count1++;
            }
        }
        
        count1 = 0;
        
        for(int[] row: matrix){
            
                if(!Arrays.equals(row, new int[]{0,0,0,0,0})){
                
                    count1++;
                }
        }
        
        int[][] final_matrix = new int[count1][5];
        
        count1 = 0;
        
        for(int[] row: matrix){
            
                if(!Arrays.equals(row, new int[]{0,0,0,0,0})){
                
                    final_matrix[count1] = row;
                    count1++;
                }
        }
        
        for(int[] result: final_matrix){
        
            for(int n1: result){
            
                System.out.print(n1);
            }
            
            System.out.print("\n");
        }
    }
    
    public static int[] simulate(int n){
    
        int[] arr = new int[n];
        int acum = 0;
        int[] steps = {1,2};
        int count = 0;
        
        while(acum < n){
        
            int randomNum = ThreadLocalRandom.current().nextInt(0, 1 + 1);
            
            if(acum + steps[randomNum] > n){
            
                count = 0;
                acum = 0;
                continue;
            }
            
            acum += steps[randomNum];
            arr[count] = steps[randomNum];
            count++;
        }
        
        count = 0;
        
        for(int n1: arr){
        
            if(n1 != 0){
            
                count++;
            }
        }
        
        int[] result_arr = new int[count];
        count = 0;
        
        for(int n1: arr){
        
            if(n1 != 0){
            
                result_arr[count] = n1;
            }
            
            count++;
        }
        
        return result_arr;
    }
}
