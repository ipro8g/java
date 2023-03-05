import java.util.SortedSet;
import java.util.TreeSet;

public class Main{

    public static void main(String[] args){
    
        //creating sortedset using treeset
        SortedSet<Integer> numbers = new TreeSet<>();
        
        //insert elements to the set
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        
        System.out.println("sortedset: " + numbers);
        
        //access the element
        int first_number = numbers.first();
        System.out.println("first: " + first_number);
        
        int last_number = numbers.last();
        System.out.println("last: " + last_number);
        
        //remove
        boolean result = numbers.remove(2);
        System.out.println("was number 2 removed? " + result);
    }
}
