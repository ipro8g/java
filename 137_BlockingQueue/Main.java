import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;

public class Main{

    public static void main(String[] args){
    
        BlockingQueue<Integer> numbers = new ArrayBlockingQueue<>(5);
        
        try{
        
            numbers.put(2);
            numbers.put(1);
            numbers.put(3);
            
            System.out.println("blocking queue: " + numbers);
            
            //remove elements
            int removed = numbers.take();
            System.out.println("removed: " + removed);
        }catch(Exception e){
        
            e.getStackTrace();
        }
    }
}
