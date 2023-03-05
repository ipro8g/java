import java.util.concurrent.LinkedBlockingQueue;
import java.util.Iterator;

public class Main{

    public static void main(String[] args){
    
        LinkedBlockingQueue<String> animals = new LinkedBlockingQueue<>(5);
        
        //using add()
        animals.add("Dog");
        animals.add("Cat");
        
        //using offer
        animals.add("Horse");
        
        System.out.println("arrayblockingqueue: " + animals);
        
        //access to elements
        
        String element1 = animals.peek();
        System.out.println("peek: " + element1);
        
        Iterator iterate = animals.iterator();
        System.out.println("linkedblockinglist: ");
        
        while(iterate.hasNext()){
        
            System.out.println(iterate.next());
        }
        
        //remove
        String element2 = animals.remove();
        System.out.println("removed: " + element2);
        
        //poll
        String element3 = animals.remove();
        System.out.println("poll: " + element3);
        
        //clear
        animals.clear();
        System.out.println("after clear: " + animals);
        
        //put
        try {
        // Add elements to animals
           animals.put("Dog");
           animals.put("Cat");
           System.out.println("LinkedBlockingQueue: " + animals);
        }
        catch(Exception e) {
            System.out.println(e);
        }
        
        //take
        try {

           // Remove an element
           String element4 = animals.take();
           System.out.println("Removed Element: " + element4);
           System.out.println("New LinkedBlockingQueue: " + animals);
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
