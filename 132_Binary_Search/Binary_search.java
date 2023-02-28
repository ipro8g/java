import java.util.*;

public class Binary_search{
        
    //how many operations were required?
    public int cost = 0;

    public static void main(String[] args){
    
        Binary_search obj = new Binary_search();
    
        Integer[] arr = {1,3,7,9,11,13,17,18,20,23,27,29,31
                    ,33,35,38,41,44,47,49,52,54,57,79,81
                    ,91,92,93,94,95,96,97,98,99,100,101,102};
                    
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        
        //find the index of number 79
        int target = 79;
        
        int result = obj.search(target, list);
        
        if(result == -1){
        
            System.out.println("element: " + target + " was not found" + "\nthe process required: " + obj.cost + " operations");
        }else{
        
            System.out.println(result + " index contains: " + list.get(result) + "\nthe process required: " + obj.cost + " operations");
        }
        
        obj.cost = 0;
        
        
        
        
        //find the index of number 8
        target = 8;
        
        result = obj.search(target, list);
        
        if(result == -1){
        
            System.out.println("\nelement: " + target + " was not found" + "\nthe process required: " + obj.cost + " operations");
        }else{
        
            System.out.println(result + " index contains: " + list.get(result) + "\nthe process required: " + obj.cost + " operations");
        }
    }
    
    public int search(int target, ArrayList<Integer> list){
        
        //if process fail   
        int result = -1;
    
        int high = list.size() - 1;
        int low = 0;
        
        while(low <= high){
            
            this.cost++;
        
            int middle_index = (low + high) / 2;
            
            if(list.get(middle_index) == target){
            
                result = middle_index;
                break;
            }else if(target < list.get(middle_index)){
            
                high = middle_index - 1;
            }else if(target > list.get(middle_index)){
            
                low = middle_index + 1;
            }
        }
        
        return result;
    }
}
