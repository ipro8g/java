import java.util.*;

interface my_inter{

    int my_method();
}

interface my_inter_p{

    int my_method(int p);
}

interface generic_interface<T>{

    T my_method(T t);
}

public class Main{

    public static void main(String[] args){
    
        //generic arraylist
        ArrayList<Object> l = new ArrayList<Object>();
    
        //Note that we can declare a reference of an interface but we cannot instantiate an interface.
        my_inter o;
        o = () -> 10;
        l.add(o.my_method());
        
        
        System.out.println(o.my_method());
        
        
        my_inter_p u;
        u = (p) -> (p * 10);
        l.add(u.my_method(4));
        System.out.println(u.my_method(4));
        
        
        
        generic_interface<String> i;
        
        i = (s) -> {
        
            return s.toUpperCase();
        };
        
        l.add(i.my_method("this is a lower string"));
        
        System.out.println(i.my_method("this is a lower string"));
        
        
        
        generic_interface<Float> f;
        
        f = (n) -> {
        
            n /= (float)0.666;
            n *= (float)0.777;
            return n;
        };
        
        float fn = (float)123.456;
        
        l.add(f.my_method(fn));
        
        System.out.println(f.my_method(fn));
        
        
        System.out.println("\nnow generic list content\n");
        
        l.forEach((e) -> {
        
                System.out.println(e);
            
            });
        
        
        
        /*//using stream API with lambda expressions
        
        List<String> places = new ArrayList<>();
        
        places.add("Nepal, Kathmandu");
        places.add("Nepal, Pokhara");
        places.add("India, Delhi");
        places.add("USA, New York");
        places.add("Africa, Nigeria");

         
        System.out.println("\n\nStream API\nPlaces from Nepal:");
        
        // Filter places from Nepal
        places.stream()
                .filter((p) -> p.startsWith("Nepal"))
                .map((p) -> p.toUpperCase())
                .sorted()
                .forEach((p) -> System.out.println(p));*/
        
    }
}
