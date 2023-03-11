import java.util.*;
import java.lang.*;
import java.util.Arrays;

public class Main { 

    public static void main(String[] args) {
    
        dot d1 = new dot(2, 6);
        dot d2 = new dot(3, 5);
        dot d3 = new dot(4, 6);
        
        dot dp = new dot(3.75, 5.25);

        dot[] triangle = {d1, d2, d3};
        
        //dot[] check = {new dot(2.5, 5), new dot(3, 5.5), dp};
        
        dot excluded = exclude_point(dp, triangle);
        
        System.out.println("for 3.75, 5.25");
        
        for(dot d: triangle){
        
            if(!d.equals(excluded)){
        
                System.out.println("d.x: " + d.x + "\td.y: " + d.y);
            }
        }
    }
    
    public static double distance(dot df, dot di){
    
        return Math.sqrt(Math.pow((df.y - di.y),2) + Math.pow((df.x - di.x), 2));
    }
    
    public static dot exclude_point(dot dp, dot[] triangle){
        
        double[] double_d = new double[triangle.length];
        
        for(int a = 0; a < triangle.length; a++){
        
            double_d[a] =  distance(triangle[a], dp);
        }
        
        Arrays.sort(double_d);
        dot result = new dot(0,0);
        
        
        for(int a = 0; a < triangle.length; a++){
        
           if(distance(triangle[a], dp) == double_d[triangle.length-1]){
            
                result = triangle[a];
           }
        }
        
        return result;
    }
    
    
    public static boolean in_boundaries(dot[] triangle, dot dp){
        
        double maxx = 0;
        double maxy = 0;
        double minx = 1000;
        double miny = 1000;
        
        for(dot d: triangle){
        
            if(d.x > maxx){
            
                maxx = d.x;
            }
            
            if(d.y > maxy){
            
                maxy = d.y;
            }
            
            if(d.x < minx){
            
                minx = d.x;
            }
            
            if(d.y < miny){
            
                miny = d.y;
            }
        }
        
        if(dp.x < minx || dp.y < miny || dp.x > maxx || dp.y > maxy){
        
            return false;
        }else{
        
            return true;
        }
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
