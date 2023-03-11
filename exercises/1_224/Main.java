import java.lang.Math;

public class Main { 

    public static void main(String[] args) {
 
          circle[] c = {new circle(1.5, 4.5, 5.5), new circle(.5, 4, 6), new circle(1, 6.5, 5)};
          
          
          
          System.out.println(is_inside(c[0], c[1]) ? "c1 is inside c0" : "c1 is not inside c0");
          
          System.out.println(is_inside(c[0], c[2]) ? "c2 is inside c0" : "c2 is not inside c0");
    }
    
    public static boolean is_inside(circle c1, circle c2){
    
        dot test = new dot((c2.x + c2.r), (c2.y + c2.r));
    
        if(c1.r < distance(test, new dot(c1.x, c1.y))){
        
            return false;
        }else{
        
            return true;
        }
    }
    
    public static double distance(dot df, dot di){
    
        return Math.sqrt(Math.pow((df.y - di.y), 2) + Math.pow((df.x - di.x), 2));
    }
    
}

class circle{

    double r, x, y;
    
    circle(double r0, double x0, double y0){
    
        r = r0;
        x = x0;
        y = y0;
    }
}

class dot{

    double x, y;
    
    dot(double x0, double y0){
    
        x = x0;
        y = y0;
    }
}
