import java.lang.*;

public class Main {
 
    public static void main(String[] args) {
    
        dot d1 = new dot(5, 6);
        dot d2 = new dot(4, 8);
        dot d3 = new dot(7, 9);
        
        dot md = new dot(((d2.x + d3.x)/2), ((d2.y + d3.y)/2));
        
        System.out.println("the center is\nx: " + md.x + "\ty: " + md.y + "\nradius: " + radius(md, d1));
    }
    
    public static double radius(dot di, dot df){
    
        return Math.sqrt(Math.pow((df.y-di.y),2) + Math.pow((df.x-di.x),2));
    }
}


    
    class dot{
    
        public double x;
        public double y;
    
        dot(double x0, double y0){
        
            x = x0;
            y = y0;
        }
    }
