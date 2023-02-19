import java.util.*;
import java.io.*;

public class Stream_test3{

    public void write_object(Dot[] dots, String file_name)throws IOException {

        FileOutputStream fos = new FileOutputStream(file_name);

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(dots);

        System.out.println("session serialized");
    }

     public Dot[] read_object(String file_name)throws Exception{

        FileInputStream fis = new FileInputStream(file_name);

        ObjectInputStream ois = new ObjectInputStream(fis);

        Dot[] dots = (Dot[])ois.readObject();

        return dots;
     }

    public static void main(String[] args){

        Stream_test3 obj = new Stream_test3();

        Dot d1 = new Dot(1, 0, "WHITE");
        Dot d2 = new Dot(2, 0, "RED");
        Dot d3 = new Dot(0, 3, "BLUE");
        Dot d4 = new Dot(0, 4, "GREEN");
        Dot d5 = new Dot(5, 5, "GRAY");

        Dot[] dots_array = {d1, d2, d3, d4, d5};

        try{

            obj.write_object(dots_array, "dots_array");

        }catch(IOException ioE){

            System.out.println("Error: " + ioE.toString());
        }

        try{

            Dot[] dots = obj.read_object("dots_array");

            for(Dot dot: dots){

                System.out.println(dot.to_string());
            }

        }catch(Exception e){

            System.out.println("Error: ");
        }
    }
}



class Dot implements Serializable{

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
