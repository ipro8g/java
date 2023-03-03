import java.util.*;

public class Priority_queue{

    public static void main(String[] args){
    
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.add(4);
        numbers.add(2);
        
        System.out.println("1 queue: " + numbers);
        
        numbers.offer(1);
        
        System.out.println("2 queue: " + numbers);
        
        //peek method
        System.out.println("queue peek: " + numbers.peek());
        
        //remove method
        numbers.remove(2);
        
        //poll removes and return the peek
        System.out.println("3 queue: " + numbers);
        
        System.out.println("element removed: " + numbers.poll());
        
        System.out.println("4 queue: " + numbers);
        
        //iterate through priority queue import java.util.Iterator;
        
        numbers.add(2);
        numbers.add(1);
        
        System.out.println("iterate over priority queue");
        
        Iterator<Integer> iterate = numbers.iterator();
        
        while(iterate.hasNext()){
        
            System.out.println(iterate.next() + "\t");
        }
        
    }
}
