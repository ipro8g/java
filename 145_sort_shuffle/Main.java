import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Main {
    public static void main(String[] args) {
        
        // Creating an array list
        ArrayList<String> animals = new ArrayList<>();

        // Add elements
        animals.add("Dog");
        animals.add("Eastern Cat");
        animals.add("Whale");
        animals.add("Lion");
        animals.add("Eagle");
        animals.add("Zebra");
        System.out.println("Unsorted ArrayList: " + animals);

        // Using the sort() method
        Collections.sort(animals);
        System.out.println("Natural Sorting: " + animals);

        // Using the customized sort() method
        Collections.sort(animals, new CustomComparator());
        System.out.println("Customized Sorting: " + animals);
        
        // Using the shuffle() method
        Collections.shuffle(animals);
        System.out.println("ArrayList using shuffle: " + animals);
    }
    
    public static class CustomComparator implements Comparator<String> {

        @Override
        public int compare(String animal1, String animal2) {
            int value =  animal1.compareTo(animal2);
            // elements are sorted in reverse order
            if (value > 0) {
                return -1;
            }
            else if (value < 0) {
                return 1;
            }
            else {
                return 0;
            }
        }
    }
}


