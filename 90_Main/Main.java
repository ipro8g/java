import java.util.*;
import java.io.*;

interface Simple_collection{

    boolean is_empty();
    boolean add_to(Object o);
    Object first();
    Object extract();
}

class Queue implements Simple_collection{

    private LinkedList<Object> list;

    public Queue(){

        list = new LinkedList<Object>();
    }

    public boolean add_to(Object obj){

        list.addLast(obj);
        return true;
    }

    public Object extract(){

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
}


class Stack_array_list extends ArrayList<Object> implements Simple_collection{
    
    public Stack_array_list(){}

    public boolean is_empty(){

        return is_empty();
    }

    public boolean add_to(Object obj){

        add(0, obj);
        return true;
    }

    public Object first(){

        return get(0);
    }

    public Object extract(){
        
        return remove(0);
    }
}

public class Main{

    public static void fill(Simple_collection collection){

        for(int i = 1; i < 10; i++){

            collection.add_to(i);
        }
    }

    public static void print_n_fill_out(Simple_collection collection){
        
        while(!collection.is_empty()){
                
            System.out.println(collection.extract());
        }
    }

    public static void main(String[] args){
        
        Main obj = new Main();
        Queue queue = new Queue();
        Stack_array_list stack = new Stack_array_list();

        obj.fill(queue);

        System.out.println("The queue: " + queue);

        obj.print_n_fill_out(queue);

        System.out.println("The queue: " + queue);

        obj.fill(stack);

        System.out.println("The stack: " + stack);

        obj.print_n_fill_out(stack);

        System.out.println("The stack: " + stack);
    }
}

class Dot{

   private double x, y;
   private double distance_origin;
   private String color;

    public Dot(double x, double y, String color){
        this.x = x;
        this.y = y;
        this.color = color;
        this.distance_origin = Math.sqrt(Math.pow((0 - x),2) + Math.pow((0 - y),2));
    }

    public Dot(){
        this.x = 0;
        this.y = 0;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public String get_color(){
        return color;
    }

    public String to_string(){

        String response = "";

        response += ("X: " + this.getX() + ",  Y: " + this.getY() + ", Color: " + this.get_color());

        return response;
    }
    
    public double distance_to(Dot d){

        double distance = Math.sqrt(Math.pow((d.x - this.x),2) + Math.pow((d.y - this.y),2));
        return distance;
    }
}
