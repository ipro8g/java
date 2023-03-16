import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main{

    public static void main(String[] args){
    
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.add(4);
        numbers.add(2);
        numbers.add(1);
        numbers.add(4);
        numbers.add(3);
        numbers.add(9);
        numbers.add(7);
        numbers.add(6);
        
        ArrayList<Integer> arr = new ArrayList<>(numbers);
            
        arr.sort(Comparator.naturalOrder());
        
        numbers.clear();
        
        numbers.addAll(arr);
        
        System.out.println(numbers);
    }
}
