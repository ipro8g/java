import java.util.NavigableSet;
import java.util.TreeSet;

public class Main{

    public static void main(String[] args){
    
        //creating navigableset using treeset
        NavigableSet<Integer> numbers = new TreeSet<>();
        
        //insert elements to set
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        
        System.out.println("navigableset: " + numbers);
    
        //access first element
        int first_element = numbers.first();
        System.out.println("first: " + first_element);
        
        //access the last element
        int last_element = numbers.last();
        System.out.println("last element: " + last_element);
        
        //remove the first element
        int number1 = numbers.pollFirst();
        System.out.println("removed: " + number1);
        
        //remove the last element
        int number2 = numbers.pollLast();
        System.out.println("removed: " + number2);
    }
}
