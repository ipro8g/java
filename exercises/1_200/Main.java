public class Main{
    
    public static void main(String[] args){
    
        String str = "zxywooxz";
        String[] str_arr = str.split("");
        String result = "";
        String[] added = new String[str.length()];
        int count = 0;
        
        for(int a = 0; a < str_arr.length; a++){
            
            boolean flag = false;
            
            for(String ad: added){
            
                if(str_arr[a].equals(ad)){
                
                    flag = true;
                }
            }
            
            if(!flag){
            
                result += str_arr[a];
                added[count++] = str_arr[a];
            }
        }
        
        System.out.print(result);
    }
}
