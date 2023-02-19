import java.util.*;
import java.io.*;

interface Simple_collection{

    boolean is_empty();
    boolean add_to(Object o);
    Object first();
    Object extract();
}

public class Test_simple_collection{

    public static void fill(Simple_collection c){

        for(int i = 1; i <= 10; i++){

            c.add_to(i);
        }
    }

    public static void print_n_fill_out(Simple_collection collection){

        while(!collection.is_empty()){

            System.out.println(collection.extract());
        }
    }

    public static void main(String[] args){

        Test_simple_collection obj = new Test_simple_collection();
        Array_stack p = new Array_stack(20);
        obj.fill(p);
        System.out.println("The stack: " + p);
        obj.print_n_fill_out(p);
        System.out.println("The stack: " + p);
    }
}

class Array_stack implements Simple_collection{

    private Object[] array;
    private int count;

    public Array_stack(int max_size){

        array = new Object[max_size];
        count = 0;
    }

    public boolean is_empty(){

        return count == 0;
    }

    public boolean add_to(Object o){

        if(count == array.length){

            return false;
        }else{

            array[count] = o;
            count++;
            return true;
        }
    }

    public Object first(){

        if(is_empty()){

            throw new NoSuchElementException();
        }else{
            return array[count-1];
        }
    }

    public Object extract(){

        if(is_empty()){

            throw new NoSuchElementException();
        }else{

            return array[--count];
        }
    }

    public String toString(){

            String s = "[";

            for(int i = count-1; i >= 0; i--){

                s+= this.array[i].toString()+",";
            }

            if(!is_empty()){

                return s.substring(0, s.length()-1) + "]";
            }else{
                return s + "]";
            }
    }

    public static void main(String[] args){

        Array_stack obj = new Array_stack(3); 
        Dot d1 = new Dot(5,7,"BLUE");

        obj.add_to(d1);
        System.out.println(obj.toString());
        
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
