import java.util.Deque;
import java.util.ArrayDeque;

public class Main{

    public static void main(String[] args){
    
        //deque can add and remove elements from tail and head
        Deque<Integer> numbers = new ArrayDeque<>();
        
        numbers.offer(1);
        numbers.offerLast(2);
        numbers.offerFirst(3);
        System.out.println("Deque: " + numbers);
        
        int first_element = numbers.peekFirst();
        System.out.println("first element: " + first_element);
        
        int last_element = numbers.peekLast();
        System.out.println("last element: " + last_element);
        
        //remove elements
        int removed_1 = numbers.pollFirst();
        System.out.println("removed 1: " + removed_1);
        
        int removed_2 = numbers.pollLast();
        System.out.println("removed 2: " + removed_2);
        
        System.out.println("final result: " + numbers);
    }
}
