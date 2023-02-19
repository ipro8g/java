import java.awt.*;
import java.util.*;

public class Colored_polygon extends Polygon{
    private Color color;

    public Colored_polygon(Dot[] vortices, Color color){
        super(vortices);
        this.color = color;
    }

    public void set_color(Color color){
        this.color = color;
    }

    public Color get_color(){
        return color;
    }

    public String toString(){
        return "\nPolygon with color " + color + "\n" + super.position();
    }    
    
    public static void main(String[] args){
        Dot[] dot = {new Dot(0,0), new Dot(2,0), new Dot(2,2), new Dot(0,2)};

        Colored_polygon polygon1 = new Colored_polygon(dot, Color.RED);

        System.out.println(polygon1);

        polygon1.move(4, -3);

        polygon1.set_color(Color.BLUE);

        System.out.println(polygon1);        
    }
}

class Polygon{
    private Dot dot1;
    private Dot dot2;
    private Dot dot3;
    private Dot dot4;
    private Dot dot5;
    private Dot dot6;
    
    private String name;

    private Dot[] vortices;

    public int num_vortices(){

        return vortices.length;
    }

    public double perimeter(){

        double acum = 0;

        for(int i = 0; i < vortices.length - 1; i++){

            acum += vortices[i].distance_to(vortices[i + 1]);
        }

        acum += vortices[0].distance_to(vortices[vortices.length-1]);

        return acum;
    }

    public void move(double dx, double dy){

        double dx2;
        double dy2;

        for(Dot dot: vortices){

        dx2 = dot.get_x() + dx;
        dot.set_x(dx2);
        dy2 = dot.get_y() + dy;
        dot.set_y(dy2);

        }
    }

    public void scalar(double k){

        double kx2;
        double ky2;

        for(Dot dot: vortices){

        kx2 = dot.get_x() * k;
        dot.set_x(kx2);
        ky2 = dot.get_y() * k;
        dot.set_y(ky2);

        }
    }

    

    public String position(){
        String str = "";
        int count = 0;        
        System.out.println("\n");

        for(Dot dot: vortices){

            str += "Dot" + (count+1) + ": " + dot.toString() + "\n";
            count++;
        }

        return str;
    }

    public Polygon(Dot[] value){

        vortices = value;
    }
}

class Dot{

    private double x;
    private double y;

    public void set_x(double x){
        this.x = x;
    }

    public void set_y(double y){
        this.y = y;
    }

    public double get_x(){
        return this.x;
    }

    public double get_y(){
        return this.y;
    }

    public double distance_to(Dot dot2){
        return Math.sqrt(Math.pow((dot2.x - this.x),2) + Math.pow((dot2.y - this.y),2));
    }

    public Dot(double x, double y){
        this.x = x;
        this.y = y;
    }

    public String toString(){

            return "(" + x + "," + y + ")";
        
    }
}
