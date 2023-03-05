import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Main{

    public static void main(String[] args){
    
        HashMap<String, Integer> numbers = new HashMap<>();
        
        //put
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        
        System.out.println("hashmap: " + numbers);
        
        
        System.out.println("get 'One': ");
        Integer value = numbers.get("One");
        
        System.out.println(value);
        
        //keySet()
        System.out.println("keys: " + numbers.keySet());
        
        //values
        System.out.println("values: " + numbers.values());
        
        //return both keys and values with entriSet()
        System.out.println("entrySet: " + numbers.entrySet());
        
        //replace element
        numbers.replace("Two", 20);
        System.out.println("after replace: " + numbers);
        
        //remove element
        numbers.remove("Two");
        System.out.println("after remove: " + numbers);
        
        numbers.put("Two", 2);
        
        //iterare over hashmap
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
        
        //creating a hashmap from other maps
        TreeMap<String, Integer> even_numbers = new TreeMap<>();
        
        even_numbers.put("Six", 6);
        even_numbers.put("Eight", 8);
        
        System.out.println("create a hashmap from other maps\neven numbers treemap: " + even_numbers);
        
        //creating a hashmap
        HashMap<String, Integer> numbers2 = new HashMap<>(even_numbers);
        numbers2.put("Seven", 7);
        
        System.out.println("hashmap: " + numbers2);
    }
}
