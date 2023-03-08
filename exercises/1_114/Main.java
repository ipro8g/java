public class Main{

    public static void main(String[] args){
    
        int[] arr = {1,2,3,4,5,6};
        int off = 2;
        boolean left = false;
        
        int[] result = new int[arr.length];
        
        for(int a = 0; a < off; a++){
        
            if(left){
        
                result[a] = arr[a + off];
                result[arr.length - off + a] = arr[a];
            }else{
            
                result[arr.length - off + a] = arr[a + off];
                result[a] = arr[arr.length - off + a];
            }
        }
        
        for(int a = off; a < arr.length - off; a++){
        
            if(left){
            
                result[a] = arr[a + off];
            }else{
            
                result[a] = arr[a - off];
            }
        }
        
        for(int n: result){
        
            System.out.print(n);
        }
    }
}
