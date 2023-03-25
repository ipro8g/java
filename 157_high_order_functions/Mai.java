import java.util.Arrays;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.*;

class Pet{

    private String name;
    private boolean checked = false;
    private int age, weight;

    public Pet(String n, int a, int w){
    
        name = n;
        age = a;
        weight = w;
    }

    public String get_name(){
    
        return name;
    }

    public int get_age(){
    
        return age;
    }

    public int get_weight(){
    
        return weight;
    }

    public void set_checked(){
    
        checked = true;
    }

    public boolean get_checked(){
    
        return checked;
    }
}

public class Mai{

    public static void main(String[] args){
    
        ArrayList<Pet> l = new ArrayList<Pet>(Arrays.asList(new Pet("dog", 1, 2), new Pet("cat", 2, 1), new Pet("rhino", 3, 180), new Pet("whale", 4, 400), new Pet("shark", 5, 300)));
    
        //forEach doesnt accept break nor continue
            
        l.forEach((e) -> System.out.println(e.get_name() + "\t" + e.get_age() + " years"));
        
        Predicate<Pet> pred1 = e -> e.get_age() >= 4;
        Predicate<Pet> pred2 = e -> e.get_weight() > 100;
        
        //filter all pets with age greater-equal than 4 and weight > 100
        
        System.out.println("age greater-equal than 4 and weight > 100");
        
        l.stream().filter(pred1).filter(pred2).forEach(e -> System.out.println(e.get_name()));
        
        l.stream().forEach(e -> {
        
            e.set_checked(); 
            System.out.println(e.get_name() + " was checked? " + e.get_checked());
            
            });
    }
}

//A Functional Interface is an Interface which allows only one Abstract method within the Interface scope.
//Predicate interface is a funcional interface
