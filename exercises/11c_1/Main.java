import java.util.*;  

public class Main{  

 public static void main(String args[]){ 
  
           HashSet<String> set = new HashSet();  
           set.add("One");    
           set.add("Two");    
           set.add("Three");   
           set.add("Four");  
           set.add("Five");  
           Iterator<String> i = set.iterator();
             
           while(i.hasNext()){ 
            
                System.out.println(i.next());  
           }
           
           System.out.println("the hashset is size: " + set.size()); 
           
           set.clear();
           
           System.out.println("the hashset is empty?: " + set.isEmpty()); 
            
           set.add("One");    
           set.add("Two");    
           set.add("Three");   
           set.add("Four");  
           set.add("Five");
           
           HashSet<String> copyset = new HashSet<String>();
           
           copyset = (HashSet)set.clone();
           
           System.out.println("iterate over copyset: "); 
           
           i = copyset.iterator();
             
           while(i.hasNext()){ 
            
                System.out.println(i.next());  
           }  
           
           String[] arr = new String[copyset.size()];
        
           System.out.println("array from set: "); 
        
           // toArray() method converts the set to array
           copyset.toArray(arr);
  
           for (String n : arr){
            
                System.out.println(n);
           }
            
           System.out.println("is set equals to copyset?: " + set.equals(copyset)); 
             
           copyset.add("Eight");
           
           System.out.println("added element Eight to copyset: "); 
           
           i = copyset.iterator();
           
           while(i.hasNext()){ 
            
                System.out.println(i.next());  
           } 
           
           System.out.println("retainAll elements in set (non Eight): "); 
           
           copyset.retainAll(set);
           
           i = set.iterator();
           
           while(i.hasNext()){ 
            
                System.out.println(i.next());  
           } 
    }  
}  
