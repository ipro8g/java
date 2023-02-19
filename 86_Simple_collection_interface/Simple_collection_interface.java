import java.util.*;
import java.io.*;

interface simple_collection{
    boolean is_empty();
    boolean add_to(Object o);
    Object first();
    Object extract();
}

public class Simple_collection_interface implements simple_collection{

    private Object[] array;
    private int count;

    public Simple_collection_interface(int max_size){

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

        Simple_collection_interface obj = new Simple_collection_interface(3); 
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
