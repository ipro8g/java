import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Animal{

    String name;

    Animal(String name){
    
        this.name = name;
    }
    
    public String toString(){
    
        return name;
    }
}

public class Main{

    public static void main(String[] args) {
    
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("fuffy"));
        animals.add(new Animal("sascha"));
        animals.add(new Animal("pepy"));
        animals.add(new Animal("tuntun"));
        animals.add(new Animal("nene"));
        
        //subList(index inclusive, index exclusive)
        List<Animal> sublist = animals.subList(2, 5);
        System.out.println(sublist);
        
        System.out.println("is animals equals to sublist? " + animals.equals(sublist));
        
        Collections.swap(sublist, 0, 2);
        System.out.println("after swap 0 2" + sublist);
        
        sublist.add(new Animal("fuffy"));
        sublist.add(new Animal("sascha"));
        sublist.add(new Animal("teto"));
        System.out.println(sublist);
    }
}
