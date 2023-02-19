import java.lang.Math.*;

public class Angle{
    double val;
    
    Angle(double val){
        this.val = val;
    }

    //returns sexagesimal value
    double get_degrees(){
        return this.val * 180 / Math.PI;
    }
    
    //sin value
    double get_sin(){
        return (Math.sin(this.val) < 0.01 ? 0 : Math.sin(this.val));
    }

    //cos value
    double get_cos(){
        return (Math.cos(this.val) < 0.01 && Math.cos(this.val) > -0.01 ? 0 : Math.cos(this.val));
    }
    
    //tg
    double get_tg(){
        return (Math.tan(this.val) < 0.01 ? 0 : Math.tan(this.val));
    }

    public static void main(String[] args){
        double val = Math.PI;
        
        Angle ang = new Angle(val);

    
        System.out.println("The value you entered is: " + ang.get_degrees() + " sexagesimal degrees");
        System.out.println("The Sin of this angle is: " + ang.get_sin());
        System.out.println("The Cos of this angle is: " + ang.get_cos());
        System.out.println("The Tang of this angle is: " + ang.get_tg());
    }
}
