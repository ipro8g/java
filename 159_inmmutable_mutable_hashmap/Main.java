import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors; 
import java.util.AbstractMap.SimpleEntry;
import java.util.stream.Stream;
import java.util.Collections; 
import java.util.AbstractMap;

public class Main{

    public static Map<String, Integer> marksMap;

    static{
    
        marksMap = new HashMap<>();
        marksMap.put("A", 100);
        marksMap.put("B", 200);
    }
    
    public static void main(String[] args){
    
        //1 using static hashmap
        System.out.println(Main.marksMap.get("A"));
        
        //2 immutableMap singletonMap only single entry
        Map<String, Integer> map3 = Collections.singletonMap("test", 100);
        System.out.println(map3.get("test"));
        
        //map4.put("abc", 200);unsupportedOperationException
        
        //mutable
        //3 JDK 8 creating 2D String array using stream and collecting the form Map 
        Map<String, String> map4 = Stream.of(new String[][] {
        
            {"Tom", "A Grade"},
            {"Naveen", "A+ Grade"},
        }).collect(Collectors.toMap(data -> data[0], data -> data[1]));

        System.out.println(map4.get("Tom"));
        map4.put("Lisa", "A++ Grade");
        System.out.println(map4.get("Lisa"));
        
        //using SimpleEntry (mutable)
        Map<String, String> map5 = Stream.of(
                    new AbstractMap.SimpleEntry<>("maveen", "java"),
                    new AbstractMap.SimpleEntry<>("tom", "python")
                    ).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
                    
        System.out.println(map5.get("maveen"));
        map5.put("Lisa", "C++");
        
        //using SimpleEntry (immutable)
        Map<String, String> map6 = Stream.of(
                    new AbstractMap.SimpleImmutableEntry<>("maveen", "java"),
                    new AbstractMap.SimpleImmutableEntry<>("tom", "python")
                    ).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
                    
        System.out.println(map6.get("tom"));
        map6.put("Steve", "Ruby");
        System.out.println(map6.get("Steve"));
        
        //JDK 1.9 empty map
        Map<String, String> emptyMap = Map.of();
        //emptyMap.put("tome", "bla");unsupportedoperationexception
        
        //singletonMap
        Map<String, String> singletonMap = Map.of("k1", "v1");
        System.out.println(singletonMap.get("k1"));
        //singletonMap.put("llal", "as");unsupportedoperationexception
        
        //multivalues map maximum 10 k v pairs
        Map<String, String> multiMap = Map.of("k1", "v1", "k2", "v2", "k3", "v3");
        System.out.println(multiMap.get("k3"));
        
        //ofEntries method: no limitation on pars key-value (immutable)
        Map<String, Integer> map7 = Map.ofEntries(
            new AbstractMap.SimpleEntry<>("A", 100),
            new AbstractMap.SimpleEntry<>("B", 200),
            new AbstractMap.SimpleEntry<>("C", 300)
            );
            
        System.out.println(map7.get("C"));
        //map7.put("llal", "as");unsupportedoperationexception
    }
}
