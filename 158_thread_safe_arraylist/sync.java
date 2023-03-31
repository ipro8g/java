import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class sync{

    public static void main(String[] args){
    
        //1 Collections.synchronizedList
        List<String> namesList = Collections.synchronizedList(new ArrayList<String>());
        
        namesList.add("Java");
        namesList.add("Phyton");
        namesList.add("Ruby");
        
        // add, remove - we dont need explicit synchronization
        
        // to fetch/traverse the values from this list -- we have to use explicit synchronization
        
        synchronized(namesList){
        
            Iterator<String> it = namesList.iterator();
            
            while(it.hasNext()){
            
                System.out.println(it.next());
            }
        }
        
        //2 copyOnWriteArrayList -- its a class: Thread-safe/synchronized already
        
        CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<String>();
        
        empList.add("Tom");
        empList.add("Steve");
        empList.add("Maveen");
        
        //we dont need explicit synchronization for any operation: add/remove/traverse
        
        Iterator<String> it = empList.iterator();
        
        while(it.hasNext()){
            
                System.out.println(it.next());
            }
    }
}
