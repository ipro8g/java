import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Main{
    
    public static void main(String[] args){
    
        LinkedHashMap<String, Integer> even = new LinkedHashMap<>();
        even.put("Two", 2);
        even.put("Four", 4);
        
        System.out.println("linkedhashmap: " + even);
        
        //creating a linkedhashmap from other linkedhashmap
        LinkedHashMap<String, Integer> numbers = new LinkedHashMap<>(even);
        
        numbers.put("Three", 3);
        
        System.out.println("linkedhashmap 2: " + numbers);
        
        System.out.println("updated linkedhashmap: " + numbers);
        
        //access linkedhashmap elements
        System.out.println("iterating over values: ");
        
        for(Integer n: numbers.values()){
            
            System.out.println(n);
        }
        
        System.out.println("iterating over keys: ");
        
        for(String k: numbers.keySet()){
            
            System.out.println(k);
        }
        
        System.out.println("iterating over both: ");
        
        for(Entry<String, Integer> e: numbers.entrySet()){
            
            System.out.println(e);
        }
        
        //get
        int value1 = numbers.get("Three");
        System.out.println("get: " + value1);
        
        //getOrDefault
        int value2 = numbers.getOrDefault("Thrree", 0);
        System.out.println("getOrDefault: " + value2);
        
        // remove method with single parameter
        int value3 = numbers.remove("Two");
        System.out.println("Removed value: " + value3);

        // remove method with two parameters
        boolean result = numbers.remove("Three", 3);
        System.out.println("Is the entry Three removed? " + result);

        System.out.println("Updated LinkedHashMap: " + numbers);
    }
}
