import java.util.HashMap;


public class Main{

    public static void main(String[] args){
    
        set s = new set();
        
        s.add("hello");
        
        s.add(123);
        
        s.add("hehehe");
        
        System.out.println(s.size());
        
        s.remove("haho");
        
        System.out.println(s.size());
        
        System.out.println(s.get(2));
    }
}

class set{

    public static HashMap<Object, Present> map = new HashMap<Object, Present>();
    
    public int size(){
        
        return map.size();
    }
    
    public Object get(int i){
        
        int count = 0;
        Object to_return = null;
        
        for(Object o: map.keySet()){
        
            if(count == i){
            
                to_return = o;
            }
        
            count++;
        }
        
        return to_return;
    }
    
    public boolean add(Object o){
    
        Present p = new Present();
    
        map.put(o, p);
        
        return true;
    }
    
    public boolean remove(Object o){
    
        int before = map.size(); 
    
        map.remove(o);
    
        int after = map.size();
        
        return false;
    }
}

class Present{

    public static boolean value = true;
}
