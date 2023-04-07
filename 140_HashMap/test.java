import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.ArrayList;

public class test{

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
        
        System.out.println("hashmap: " + numbers2 + "\n\n\n");
        
        numbers.forEach((k, v)-> System.out.println("key: " + k + ", value: " + v));
        
        HashMap<Integer, String> map1 = new HashMap<Integer, String>();
        
        map1.put(1, "one");
        map1.put(2, "two");
        map1.put(3, "three");
        
        HashMap<Integer, String> map2 = new HashMap<Integer, String>();
        
        map2.put(1, "one");
        map2.put(2, "two");
        map2.put(3, "three");
        map2.put(4, "four");
        
        ArrayList<Integer> l1 = new ArrayList<Integer>(map1.keySet());
        
        ArrayList<Integer> l2 = new ArrayList<Integer>(map2.keySet());
        
        l2.removeAll(l1);
        
        System.out.println("missing element: " + l2);
        
        for(Entry m:map1.entrySet()){   
       
            System.out.println(m.getKey()+" "+m.getValue());    
        }  
    }
}
