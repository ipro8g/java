import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;

public class Main{

    public static void main(String[] args){
    
        LinkedList<Integer> languages = new LinkedList<>();
        
        languages.add(10);
        languages.add(20);
        languages.add(30);
        languages.add(40);
        languages.add(50);
        
        System.out.println("linkedlist: " + languages);
        
        languages.remove(3);
        
        System.out.println("after remove 3: " + languages);
    }
}
