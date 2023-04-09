import java.util.HashSet;
import java.util.Set;

public class test{
  
    public static void main(String args[]){
 
        Set<Integer> s = new HashSet<Integer>();
        
        s.add(3);
        s.add(1);
        s.add(5);
        s.add(4);
        s.add(6);
        
        Set<Integer> s1 = new HashSet<Integer>(s);
 
        Set<Integer> s2 = new HashSet<Integer>();
        
        s2.add(5);
        s2.add(3);
        s2.add(2);
        s2.add(7);
        s2.add(6);
        
        System.out.println("union with addAll()");
        
        s.addAll(s2);
        
        System.out.println(s);
        
        s.removeAll(s);
        
        s.addAll(s1);
        
        System.out.println("intersection with retainAll()");
        
        s.retainAll(s2);
        
        System.out.println(s);
        
        s.removeAll(s);
        
        s.addAll(s1);
        
        System.out.println("difference with removeAll()");
        
        s.removeAll(s2);
        
        System.out.println(s);
    }
}
