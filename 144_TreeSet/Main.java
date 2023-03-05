import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;

public class Main{
    
    public static void main(String[] args){
    
        TreeSet<Integer> even_numbers = new TreeSet<>();
        
        System.out.println("add\n");
        
        //add()
        even_numbers.add(2);
        even_numbers.add(4);
        even_numbers.add(5);
        even_numbers.add(6);
        System.out.println("treeset: " + even_numbers);
        
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        
        //addAll()
        numbers.addAll(even_numbers);
        System.out.println("new treeset: " + numbers);
        
        System.out.println("\naccess treeset elements\n");
        
        //access treeset elements
        Iterator iterate = numbers.iterator();
        
        System.out.println("treeset using iterator: ");
        
        while(iterate.hasNext()){
        
            System.out.println(iterate.next());
        }
        
        System.out.println("\nremove\n"); 
        
        //remove
        boolean value1 = numbers.remove(5);
        System.out.println("did remove 5? " + value1);
        
        //removeAll(Collection c)
        boolean value2 = numbers.removeAll(numbers);
        System.out.println("did remove all values? " + value2);
        
        System.out.println("tree: " + numbers);        
        
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        
        System.out.println("\nnavigation\n"); 
        
        //navigation
        //first
        int first = numbers.first();
        System.out.println("first: " + first);
        
        //last
        int last = numbers.last();
        System.out.println("last: " + last);
        
        System.out.println("\nceiling(), floor(), higher() and lower()\n"); 
        
        //ceiling(), floor(), higher() and lower()
        numbers.removeAll(numbers);
        numbers.add(2);
        numbers.add(5);
        numbers.add(4);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);

        // Using higher()
        System.out.println("Using higher(4): " + numbers.higher(4));

        // Using lower()
        System.out.println("Using lower(4): " + numbers.lower(4));

        // Using ceiling()
        System.out.println("Using ceiling(4): " + numbers.ceiling(4));

        // Using floor()
        System.out.println("Using floor(3): " + numbers.floor(3));
        
        numbers.add(3);
        System.out.println("Using floor(3) with existing 3: " + numbers.floor(3));
        
        numbers.remove(3);
        
        System.out.println("\npollFirst() and pollLast()\n"); 
        
        System.out.println("TreeSet: " + numbers);

        // Using pollFirst()
        System.out.println("Removed First Element: " + numbers.pollFirst());

        // Using pollLast()
        System.out.println("Removed Last Element: " + numbers.pollLast());

        System.out.println("New TreeSet: " + numbers);
        
        numbers.add(2);
        numbers.add(6);
        
        System.out.println("\nheadSet(), tailSet() and subSet()\n"); 
        
        System.out.println("TreeSet: " + numbers);

        // Using headSet() with default boolean value
        System.out.println("Using headSet(5) without boolean value: " + numbers.headSet(5));

        // Using headSet() with specified boolean value
        System.out.println("Using headSet(5, true) with boolean value: " + numbers.headSet(5, true));
        
        // Using tailSet() with default boolean value
        System.out.println("Using tailSet(4) without boolean value: " + numbers.tailSet(4));

        // Using tailSet() with specified boolean value
        System.out.println("Using tailSet(4, false) with boolean value: " + numbers.tailSet(4, false));
        
        // Using subSet() with default boolean value
        System.out.println("Using subSet(4, 6) without boolean value: " + numbers.subSet(4, 6));

        // Using subSet() with specified boolean value
        System.out.println("Using subSet(4, false, 6, true) with boolean value: " + numbers.subSet(4, false, 6, true));
        
        
        even_numbers.remove(5);
        numbers.remove(2);
        numbers.remove(4);
        numbers.remove(6);
        even_numbers.add(8);
        numbers.add(3);
        numbers.add(1);
        numbers.add(7);
        numbers.add(2);
        
        System.out.println("\nunion addAll() - intersection retainAll()\n");
        
        System.out.println("numbers: " + numbers);
        System.out.println("even_numbers: " + even_numbers);
        
        // Union of two sets
        numbers.addAll(even_numbers);
        System.out.println("Union is: " + numbers);
        
        numbers.removeAll(even_numbers);
        numbers.add(2);

        // Intersection of two sets
        numbers.retainAll(even_numbers);
        System.out.println("Intersection is: " + numbers);
        
        numbers.add(3);
        numbers.add(1);
        numbers.add(7);
        numbers.add(2);
        
        System.out.println("\ndifference between sets with removeAll()\n");

        // Difference between two sets
        numbers.removeAll(even_numbers);
        System.out.println("Difference is: " + numbers);
        
        numbers.add(2);
                     
        System.out.println("\nsubset of a set with containsAll()\n");

        TreeSet<Integer> primeNumbers = new TreeSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        System.out.println("TreeSet1: " + numbers);
        System.out.println("TreeSet2: " + primeNumbers);

        // Check if primeNumbers is subset of numbers
        boolean result = numbers.containsAll(primeNumbers);
        System.out.println("Is TreeSet2 subset of TreeSet1? " + result);
                     
        System.out.println("\nTreeSet comparator\n");
        
        TreeSet<String> animals = new TreeSet<>(new CustomComparator());
        
        animals.add("Dog");
        animals.add("Zebra");
        animals.add("Cat");
        animals.add("Horse");
        
        System.out.println("TreeSet: " + animals);
    }
    
    
    public static class CustomComparator implements Comparator<String>{
        
            @Override 
            public int compare(String animal1, String animal2){
            
                int value = animal1.compareTo(animal2);
                
                //elements are sorted in reverse order
                if(value > 0){
                
                    return -1;
                }else if(value < 0){
                
                    return 1;
                }else{
                
                    return 0;
                }
            }
    }
}
