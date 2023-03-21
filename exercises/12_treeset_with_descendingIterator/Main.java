import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;

public class Main{
    
    public static void main(String[] args){
    
        TreeSet<String> colors = new TreeSet<>();
        
        System.out.println("add\n");
        
        //add()
        colors.add("white");
        colors.add("black");
        colors.add("green");
        colors.add("blue");
        colors.add("red");
        colors.add("pruple");
        System.out.println("treeset: " + colors);
        
        Iterator asc_iterate = colors.iterator();
        
        Iterator desc_iterate = colors.descendingIterator();
        
        System.out.println("ascending treeset using iterator: ");
        
        while(asc_iterate.hasNext()){
        
            System.out.println(asc_iterate.next());
        }
        
        System.out.println("descending treeset using iterator: ");
        
        while(desc_iterate.hasNext()){
        
            System.out.println(desc_iterate.next());
        }
        
        System.out.println("the first element is: " + colors.first());
        
        System.out.println("the last element is: " + colors.last());
        
        TreeSet<String> copycolors = new TreeSet<>();
        
        System.out.println("copy equals to copycolors?: " + colors.equals(copycolors));
        
        colors.remove("pruple");
        
        System.out.println("colors: " + colors);
    }
}
