import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;

public class Main{

    public static void main(String[] args){
    
        LinkedList<String> languages = new LinkedList<>();
        
        languages.add("Python");
        languages.add("Java");
        languages.add("JavaScript");
        
        ListIterator<String> list_iterate = languages.listIterator(1);
        System.out.println("LinkedList from index 1: ");
        
        while(list_iterate.hasNext()){
        
            System.out.println(list_iterate.next() + ", ");
        }
        
        list_iterate = languages.listIterator(languages.size());
         
        //reverse iterate    
        System.out.println("reversed LinkedList: ");
        
        while(list_iterate.hasPrevious()){
        
            System.out.println(list_iterate.previous() + ", ");
        }
        
        System.out.println("before insert cpp at index 1: " + languages);
        
        languages.add(1, "cpp");
        
        System.out.println("after insert cpp at index 1: " + languages);
        
        languages.addFirst("html");
        
        languages.addLast("css");
        
        System.out.println("after insert html at first css at last: " + languages);
    }
}
