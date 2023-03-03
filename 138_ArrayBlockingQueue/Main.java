import java.util.concurrent.ArrayBlockingQueue;
import java.util.Iterator;

public class Main{

    public static void main(String[] args){
    
        //size of array is mandatory
        ArrayBlockingQueue<String> animals = new ArrayBlockingQueue<>(5);
        
        //add elements
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        
        System.out.println("arrayblockingqueue: " + animals);
        
        //peek()
        String element = animals.peek();
        System.out.println("access to: " + element);
        
        //iterate
        Iterator iterate = animals.iterator();
        System.out.println("arrayblockingqueue elements: ");
        
        while(iterate.hasNext()){
        
            System.out.println(iterate.next());
        }
        
        //remove
        String element1 = animals.remove();
        System.out.println("removed: " + element1);
        
        System.out.println("before poll");
        System.out.println("arrayblockingqueue: " + animals);
        
        //poll
        String element2 = animals.poll();
        System.out.println("poll: " + element2);
        
        System.out.println("before clear");
        System.out.println("arrayblockingqueue: " + animals);
        
        //clear
        animals.clear();
        System.out.println("after clear");
        System.out.println("arrayblockingqueue: " + animals);
        
        //put
        try {
        // Add elements to animals
           animals.put("Dog");
           animals.put("Cat");
           System.out.println("ArrayBlockingQueue: " + animals);
        }
        catch(Exception e) {
            System.out.println(e);
        }
        
        //take
        try {
           //Add elements to animals
           animals.put("Turtle");
           animals.put("Chicken");
           System.out.println("ArrayBlockingQueue: " + animals);

           // Remove an element
           String element3 = animals.take();
           System.out.println("Removed Element: " + element3);
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
