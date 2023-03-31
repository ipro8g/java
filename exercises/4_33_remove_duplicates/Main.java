import java.util.*;
import java.util.stream.Collectors;

public class Main{

        public static void main(String[] arg){
        
            String[] animals = {"dog","cat","chicken","dog","cow","shark","eagle","lion","cat","gorilla","shark"};
            ArrayList<String> arr = new ArrayList<>();
            Collections.addAll(arr, animals);
            Set<String> set = new HashSet<>(arr);
            arr.clear();
            arr.addAll(set);
            
            for(String a: arr){
            
                System.out.println(a);
            }
                
            
                
            List<String> uniq = arr.stream().distinct().collect(Collectors.toList());
                
            System.out.println(uniq);
        }
}
