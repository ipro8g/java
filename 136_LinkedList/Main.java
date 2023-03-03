import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;

public class Main{

    public static void main(String[] args){
    
        LinkedList<String> languages = new LinkedList<>();
        
        languages.add("Python");
        languages.add("Java");
        languages.add("JavaScript");
        
        System.out.println("languages: " + languages);
        
        String str = languages.get(1);
        System.out.println("element at index 1: " + str);
        
        //iterate over linkedlist
        Iterator<String> iterate = languages.iterator();
        System.out.print("LinkedList: ");
        
        while(iterate.hasNext()){
        
            System.out.println(iterate.next() + ", ");
        }
        
        ListIterator<String> list_iterate = languages.listIterator();
        System.out.println("LinkedList: ");
        
        while(list_iterate.hasNext()){
        
            System.out.println(list_iterate.next() + ", ");
        }
         
        //reverse iterate    
        System.out.println("reversed LinkedList: ");
        
        while(list_iterate.hasPrevious()){
        
            System.out.println(list_iterate.previous() + ", ");
        }
        
        
    }
}
