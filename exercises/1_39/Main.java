import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;

public class Main{

    public static void main(String[] args){
    
        char[] arr = {'1','2','3','4'};
        int limit = (arr.length*arr.length) + (arr.length * 2) - 1;
        ArrayList<String> result = new ArrayList<>();
        int count = 0;
        
        while(count <= limit){
        
            String r = random_str(arr);
            
            if(!result.contains(r)){
            
                result.add(r);
        
                count++;
            }else{
            
                continue;
            }
        }
        
        for(String r: result){
        
            System.out.println(r);
        }
        
        System.out.println("total unique numbers where: " + (limit + 1));
    }
    
    public static String random_str(char[] arr){
    
        int min = 0;
        int max = arr.length-1;
        
        String result = "";
        
        ArrayList<String> r = new ArrayList<>();
        
        while(result.length() < arr.length - 1){
    
            int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
            
            if(r.contains(Character.toString(arr[randomNum]))){
            
                continue;
            }else{
            
                r.add(Character.toString(arr[randomNum]));
            }
            
            result = "";
            
            for(String s: r){
            
                result += s;
            }
        }
        
        return result;
    }
}
