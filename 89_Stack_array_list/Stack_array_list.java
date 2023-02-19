import java.util.*;
import java.io.*;

interface Simple_collection{

    boolean is_empty();
    boolean add_to(Object o);
    Object first();
    Object extract();
}

public class Stack_array_list extends ArrayList<Object> implements Simple_collection{
    
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

    public static void main(String[] args){
        
        Stack_array_list obj = new Stack_array_list();
        Dot d1 = new Dot(5,7,"BLUE");
        Dot d2 = new Dot(3,4,"RED");
        Dot d3 = new Dot(1,2,"WHITE");

        obj.add_to(d1);
        obj.add_to(d2);
        obj.add_to(d3);
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
