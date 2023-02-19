import java.util.*;

class Stack_array<E>{
    
    private E[] array;
    private int count;

    public Stack_array(int max_size){
        
        array = (E[])new Object[max_size];
        count = 0;
    }
    public boolean is_empty(){
        
        return count == 0;
    }

    public boolean add_to(E o){

        System.out.println("new object added");
        
        if(count == array.length){
            
            return false;
        }else{
            
            array[count] = o;
            count++;
            return true;
        }

        
    }

    public E first(){
        
        if(this.is_empty()){
            
            throw new NoSuchElementException();
        }else{

            return array[count-1];
        }
    }

    public E extract(){
        
        if(is_empty()){
            
            throw new NoSuchElementException();
        }else{

            return array[--count];
        }
    }

    public String toString(){
        
        String s = "[";

        for(int i = count - 1; i >= 0; i--){

            s += array[i].toString() + ".";
        }

        if(!is_empty()){
            
            return s.substring(0,s.length()-1) + "]";
        }else{

            return s + "]";
        }
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

        Stack_array<Obj> stck_arr = new Stack_array<Obj>(3);

        stck_arr.add_to(ob1);

        stck_arr.add_to(ob2);

        stck_arr.add_to(ob3);

        System.out.println(stck_arr.toString());
    }
}
