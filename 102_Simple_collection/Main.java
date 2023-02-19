import java.util.*;

interface Simple_collection<E>{
    
    boolean is_empty();
    boolean add_to(E o);
    E first();
    E extract();
}

class Stack_array<E> implements Simple_collection<E>{
    
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

public class Main{
    
    public static void main(String[] args){
        
        Stack_array<String> stack1 = new Stack_array<String>(10);
        
        stack1.add_to("one");
        stack1.add_to("two");
        stack1.add_to("three");

        System.out.println(stack1.toString());
        System.out.println(stack1.first().charAt(0));

        Stack_array<Integer> stack2 = new Stack_array<Integer>(10);

        stack2.add_to(1);
        stack2.add_to(2);
        stack2.add_to(3);

        System.out.println(stack2);
        int sum = 0;

        while(!stack2.is_empty()){
            
            sum += stack2.extract();
        }

        System.out.println("sum is " + sum);
    }
}

