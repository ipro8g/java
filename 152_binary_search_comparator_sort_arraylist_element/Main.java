import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;

class Animal{

    String name;

    Animal(String name){
    
        this.name = name;
    }
    
    public String toString(){
    
        return name;
    }
}

class sort_name implements Comparator<Animal>{

    public int compare(Animal object1, Animal object2) {
    
          return object1.name.compareTo(object2.name);
    }
}

public class Main{

    public static void main(String[] args) {
    
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("fuffy"));
        animals.add(new Animal("sascha"));
        
        Animal a = new Animal("nene");
        
        animals.add(a);
        
        Collections.sort(animals, new sort_name());
        
        int pos = Collections.binarySearch(animals, a, new sort_name());
        System.out.println("The position of nene is " + pos);
    }
}
