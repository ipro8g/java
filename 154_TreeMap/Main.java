import java.util.*; 
import java.util.Map.Entry; 

public class Main{
  
 public static void main(String args[]){ 
  
        TreeMap<Integer,String> map = new TreeMap<Integer,String>();    
        map.put(100,"Amit");    
        map.put(102,"Ravi");    
        map.put(101,"Vijay");    
        map.put(103,"Rahul");    
        
        for(Map.Entry m:map.entrySet()){   
       
            System.out.println(m.getKey()+" "+m.getValue());    
        }   
      
        TreeMap<Integer,String> copymap = (TreeMap)map.clone();  
      
        System.out.println("copy: ");
      
        for(Map.Entry m:copymap.entrySet()){   
       
            System.out.println(m.getKey()+" "+m.getValue());    
        } 
      
        System.out.println("treemap with sorted keys: ");
      
        TreeMap<String,String> tree_map1 = new TreeMap<String,String>(new sort_key());
        // Put elements to the map 
        tree_map1.put("C2", "Red");
        tree_map1.put("C4", "Green");
        tree_map1.put("C3", "Black");
        tree_map1.put("C1", "White"); 
        System.out.println(tree_map1);
        
        System.out.println("The Tree Map contains key C1?: " + tree_map1.containsKey("C3")); 
        
        System.out.println("The Tree Map contains value Black?: " + tree_map1.containsValue("Black")); 
        
        Set<String> keys = tree_map1.keySet();
        
        System.out.println("all the keys: " + keys); 
        
        System.out.println("Greatest key: " + tree_map1.firstEntry());
        
        System.out.println("Least key: " + tree_map1.lastEntry());
      
        System.out.println("Greatest key: " + tree_map1.firstKey());
        
        System.out.println("Least key: " + tree_map1.lastKey());
        
        System.out.println("Reverse order view of the keys: " + tree_map1.descendingKeySet());
        
        TreeMap < Integer, String > tree_map2 = new TreeMap < Integer, String > ();
        // Put elements to the map 
        tree_map2.put(10, "Red");
        tree_map2.put(20, "Green");
        tree_map2.put(40, "Black");
        tree_map2.put(50, "White");
        tree_map2.put(60, "Pink");

        System.out.println("Orginal TreeMap2 content: " + tree_map2);
        System.out.println("Checking the entry for 10: ");
        System.out.println("Value is: " + tree_map2.floorEntry(10));
        System.out.println("Checking the entry for 30: ");
        System.out.println("Value is: " + tree_map2.floorEntry(30));
        System.out.println("Checking the entry for 70: ");
        System.out.println("Value is: " + tree_map2.floorEntry(70));
        
        System.out.println("Orginal TreeMap2 content: " + tree_map2.navigableKeySet());
        
        System.out.println("Value before pollFirstEntry: " + tree_map2);
        
        System.out.println("Value returned: " + tree_map2.pollFirstEntry());
        
        System.out.println("Value after pollFirstEntry: " + tree_map2);
        
        System.out.println("Value before pollLastEntry: " + tree_map2);
        
        System.out.println("Value returned: " + tree_map2.pollLastEntry());
  
        System.out.println("Value after pollLastEntry: " + tree_map2);
        
        System.out.println("Keys are greater than or equal to 40: " + tree_map2.tailMap(40));
        
        System.out.println("Keys are less than 40: " + tree_map2.headMap(40));
    }
    
    public static class sort_key implements Comparator<String>{
    
        @Override
        public int compare(String str1, String str2) {
        
            return str1.compareTo(str2);
        }
    } 
}  
