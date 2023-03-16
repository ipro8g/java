public class Main{

    public static void main(String[] args){
    
        char[] arr = {'P','R','Q'};
        int count = 0;
        String[] result = new String[100];
        
        for(int a = 0; a < arr.length; a++){
        
            for(int b = 0; b < arr.length; b++){
            
                for(int c = 0; c < arr.length; c++){
            
                result[count] = "";
                result[count] = String.valueOf(arr[a]) + String.valueOf(arr[b]) + String.valueOf(arr[c]);
                count++;
                }
            }
        }
        
        count = 0;
        
        for(String r: result){
        
            if(r != null){
            
                System.out.println(r);
                count++;
            }
        }
        
        System.out.println(count);
    }
}
