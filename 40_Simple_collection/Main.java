import java.util.LinkedList;

public class Main{
    
    public static void fill(Simple_collection c){
        
        for(int i = 1; i <= 10; i++){
            
            c.add(i);
        }
    }

    public static void print_fill_out(Simple_collection c){
        
        while(!c.is_empty()){

            System.out.println(c.extraer());
        }
    }

    public static void main(String[] args){
        
        Stack stack = new Stack();
        fill(stack);
        System.out.println("Stack data");
        print_fill_out(stack);

        Queue queue = new Queue();
        fill(queue);
        System.out.println("Queue Data");
        print_fill_out(queue);

        Str s = new Str("First");
        Boo b = new Boo(true);
        Nmb n = new Nmb((float)7.5);

        stack.add(s);
        stack.add(b);
        stack.add(n);
        stack.add(queue);
        System.out.println("Stack data with different types");
        print_fill_out(stack);
    }
}

abstract class Simple_collection{

    private LinkedList<Object> list;

    public Simple_collection(){
        
        list = new LinkedList<Object>();
    }

    public abstract void add(Object o);

    public Object extraer(){
    
        return list.removeFirst();
    }

    public boolean is_empty(){
        
        return list.isEmpty();
    }

    public Object first(){

        return list.getFirst();
    }

    public String toString(){

        return list.toString();    
    }

    protected LinkedList<Object> get_list(){

        return list;
    }
}



class Stack extends Simple_collection{
    
    public Stack(){
        
    }

    public void add(Object o){

        get_list().addFirst(o);
    }
}

class Queue extends Simple_collection{

    public Queue(){
        
    }

    public void add(Object o){
        
        get_list().addLast(o);
    }
}

class Str{
    String s;

    public Str(String s){
    
        this.s = s;
    }
}

class Nmb{
    float n;

    public Nmb(float n){
    
        this.n = n;
    }
}

class Boo{
    boolean b;

    public Boo(boolean b){
    
        this.b = b;
    }
}
