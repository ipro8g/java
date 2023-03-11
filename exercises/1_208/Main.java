import java.util.HashMap;

public class Main{
    
    public static void main(String[] args){
    
        String str = "aaaabbbbcccccddddeeee";
        HashMap<String, Integer> map = new HashMap<>();
        
        String[] str_arr = str.split("");
        String unique = "";
        String[] add = new String[str.length()];
        int count = 0;
        
        for(int a = 0; a < str_arr.length; a++){
        
            boolean flag = false;
        
            for(int b = 0; b < add.length; b++){
            
                if(str_arr[a].equals(add[b]) && a != b){
                
                    flag = true;
                }
            }
            
            if(!flag){
            
                unique += str_arr[a];
                add[count++] = str_arr[a];
            }
        }
        
        String[] str_arr2 = unique.split("");
        
        for(int a = 0; a < str_arr2.length; a++){
        
            count = 0;
        
            for(int b = 0; b < str_arr.length; b++){
            
                if(str_arr2[a].equals(str_arr[b])){
                
                    count++;
                }
            }
            
            map.put(str_arr2[a], count);
        }
        
        String result = "";
        
        for(String k: map.keySet()){
        
            result += k;
            result += Integer.toString(map.get(k));
        }
        
        System.out.println(result);
    }
}
