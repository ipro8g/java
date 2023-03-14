import java.util.*;

public class Main{

        public static void main(String[] arg){
        
            int[] arr = {1,2,4,5,6,3,0};
            int target = 6, count = 0;
            int[][] result = new int[2][2];
            int[] used = new int[10];
            
            for(int a = 0; a < arr.length; a++){
            
                for(int b = 0; b < arr.length; b++){
                
                    boolean flag1 = false, flag2 = false;
                    
                        for(int u: used){
                    
                            if(u == arr[a]){
                        
                                flag1 = true;
                            }
                    
                            if(u == arr[b]){
                        
                                flag2 = true;
                            }
                        }
            
                    if(((arr[a] + arr[b]) == target) && a != b && !flag1 && !flag2){
                    
                        result[count][0] = arr[a];
                        result[count][1] = arr[b];
                        
                        used[count] = arr[a];
                        used[count+1] = arr[b];
                        count++;
                    }
                }
            }
            
            for(int[] r: result){
            
                System.out.println(r[0] + " + " + r[1] + " = " + target);
            }
        }
}
