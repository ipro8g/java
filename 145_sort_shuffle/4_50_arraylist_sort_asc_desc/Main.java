import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main{

        public static void main(String[] arg){
            
            Integer[] arr = {1,21,3,14,50,24,31,16,74,54,37,6};
            ArrayList<Integer> arr1 = new ArrayList<>();
            ArrayList<Integer> arr2 = new ArrayList<>();
            ArrayList<Integer> result = new ArrayList<>();
            
            Collections.addAll(arr1, arr);
            
            Collections.addAll(arr2, arr);
            
            arr1.sort(Comparator.naturalOrder());
            
            arr2.sort(Comparator.reverseOrder());
            
            int count1 = 0, count2 = 0;
            
            for(int a = 0; a < arr.length/2; a++){
            
                result.add(arr2.get(count2));
                count2++;
                
                result.add(arr1.get(count1));
                count1++;
            }
            
            for(Integer r: result){
            
                System.out.println(r);
            }
        }
}
