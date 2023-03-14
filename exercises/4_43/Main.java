import java.util.concurrent.ThreadLocalRandom;
import java.lang.Math;
import java.util.Arrays;

public class Main{

        public static void main(String[] arg){
        
            int[] arr = {10, 20, 30, 40, 1, 2, 3, 0};
            int[] used = new int[100];
            int[][] result = new int[100][100];
            int count = 0, count2 = 0, target = 53;
            
            for(int p = 0; p < Math.pow(arr.length, 3); p++){
                
                    int a = ThreadLocalRandom.current().nextInt(0, 7 + 1);
                    int b = ThreadLocalRandom.current().nextInt(0, 7 + 1);
                    int c = ThreadLocalRandom.current().nextInt(0, 7 + 1);
                    int d = ThreadLocalRandom.current().nextInt(0, 7 + 1);
                    
                        if((arr[a] + arr[b] + arr[c] + arr[d]) == target && a != b && a != c && a != d && b != c && b != d && c != d){
                        
                            result[count][0] = arr[a];
                            result[count][1] = arr[b];
                            result[count][2] = arr[c];
                            result[count][3] = arr[d];
                            
                            count++;
                        }
                    
            }
            
            count = 0;
            
            for(int[] r: result){
            
                boolean flag = false;
            
                for(int u: used){
                
                    int compare = 0;
                    
                    compare += Integer.parseInt(Integer.toBinaryString(r[0]));
                    compare += Integer.parseInt(Integer.toBinaryString(r[1]));
                    compare += Integer.parseInt(Integer.toBinaryString(r[2]));
                    compare += Integer.parseInt(Integer.toBinaryString(r[3]));
                
                    if(u == compare){
                    
                        flag = true;
                    }
                }
            
                if((r[0] == 0 && r[1] == 0 && r[2] == 0 && r[3] == 0) || flag){
                
                }else{
            
                    System.out.println(r[0] + " " + r[1] + " " + r[2] + " " + r[3]);
                    
                    used[count] = 0;
                    
                    used[count] += Integer.parseInt(Integer.toBinaryString(r[0]));
                    used[count] += Integer.parseInt(Integer.toBinaryString(r[1]));
                    used[count] += Integer.parseInt(Integer.toBinaryString(r[2]));
                    used[count] += Integer.parseInt(Integer.toBinaryString(r[3]));
                    
                    count++;
                }
            }
            
        }
}
