import java.util.*;
import java.io.*;

public class Save_object_collection{

    public void save_array_list(ArrayList<Dot> dots, String file_name)throws IOException{

        ObjectOutputStream dots_file = new ObjectOutputStream(new FileOutputStream(file_name));
        dots_file.writeObject(dots);
        dots_file.close();
    }

    public ArrayList<Dot> read_array_list(String file_name)throws IOException, ClassNotFoundException{

        ObjectInputStream dots_file = new ObjectInputStream(new FileInputStream(file_name));
        ArrayList<Dot> dots_list = (ArrayList<Dot>)(dots_file.readObject());
        dots_file.close();

        return dots_list;
    }
    
    /*public void save_object_collection(Collection<Dot> dots, String file_name)throws IOException{

        ObjectOutputStream dots_file = new ObjectOutputStream(new FileOutputStream(file_name));
        Iterator<Dot> dots_it = dots.iterator();

        while(dots_it.hasNext()){

            Dot d = dots_it.next();
            dots_file.writeObject(d);
        }

        dots_file.close();
    }

    public ArrayList<Dot> get_array_list_from_file(String file_name)throws ClassNotFoundException, IOException{

        ObjectInputStream dots_file = new ObjectInputStream(new FileInputStream(file_name));
        ArrayList<Dot> dots_list = new ArrayList<Dot>();

        try{

            do{

                Dot d = (Dot)dots_file.readObject();
                dots_list.add(d);
            }while(true);

        }catch(EOFException eofE){}
        
        return dots_list;
    }*/

    public static void main(String[] args){

        Save_object_collection obj = new Save_object_collection();
        String file_name = "the_file";

        Dot d1 = new Dot(1, 0, "WHITE");
        Dot d2 = new Dot(2, 0, "RED");
        Dot d3 = new Dot(0, 3, "BLUE");
        Dot d4 = new Dot(0, 4, "GREEN");
        Dot d5 = new Dot(5, 5, "GRAY");

        ArrayList<Dot> dots_list = new ArrayList<Dot>();

        dots_list.add(d1);
        dots_list.add(d2);
        dots_list.add(d3);
        dots_list.add(d4);
        dots_list.add(d5);
        
        try{

            obj.save_array_list(dots_list, file_name);
        }catch(Exception e){
            System.out.println("an error has occurred, try again");
        }

         ArrayList<Dot> dots_list_read = new ArrayList<Dot>();

         try{

            dots_list_read  = obj.read_array_list(file_name);
        }catch(Exception e){
            System.out.println("an error has occurred, try again");
        }

        for(Dot dot: dots_list_read){

            System.out.println(dot.to_string());
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

