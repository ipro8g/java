public class Main{

    public static void main(String[] args){
    
        int[] arr = {20, 30, 40};
        
        int[] new_arr = new int[arr.length];
        
        int count = 0;
        
        for(int n = 0; n < arr.length-1; n++){
            
                new_arr[n] = arr[n + 1];
        }        
        
        new_arr[2] = arr[0];
        
        System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + "\t" + new_arr[0] + " " + new_arr[1] + " " + new_arr[2]);
    }
}


