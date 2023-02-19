import java.util.*;

class Stack<E>{
    
    private LinkedList<E> list;

    public Stack(){
        
        list = new LinkedList<E>();
    }

    public void add(E o){

        list.addFirst(o);
    }

    public E first(){

        return list.getFirst();
    }

    public E extract(){

        return list.removeFirst();
    }

    public boolean is_empty(){

        return list.isEmpty();    
    }

    public String toString(){

        return list.toString();
    }
    
}

public class Obj{

    static int count;
    int id;
    
    public Obj(){
        
        count++;

        System.out.println("Obj " + count + " created.");

        this.id = count;
    }

    public int get_id(){
        
        return this.id;
    }

    public static void main(String[] args){
        
        Obj ob1 = new Obj();
        Obj ob2 = new Obj();
        Obj ob3 = new Obj();

        LinkedList<Obj> stck = new LinkedList<Obj>();

        stck.add(ob1);
        System.out.println("Obj " + ob1.get_id() + " added");

        stck.add(ob2);
        System.out.println("Obj " + ob2.get_id() + " added");

        stck.add(ob3);
        System.out.println("Obj " + ob3.get_id() + " added");

        System.out.println(stck.toString());
    }
}
