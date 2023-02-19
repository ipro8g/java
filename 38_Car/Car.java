import java.util.*;

public class Car{
    private String id;
    private double velocity;
    private int march;

    public Car(String id){

        this.id = id;
        velocity = 0;
        march = 0;
    }

    public void acelerate(double velocity){

        if((this.velocity += velocity) < 0){

            throw new ArithmeticException("Can not be changed to a negative value"); 
        }else{

            this.velocity += velocity;
        }
    }

    public void reduce(double val){

        velocity -= val;
    }

    public String toString(){

        String info = "";
        info += "\nCar ID: " + id + "\nVelocity: " + velocity + "\n";

        return info;
    }

    public void change_march(int val){
        
        if((march += val) < 0){

             throw new ArithmeticException("Can not be changed to a negative value"); 
        }else{

            march += val;
        }
    } 

    public void change_velocity(double val){
        
        if((velocity += val) < 0){

             throw new ArithmeticException("Can not be changed to a negative value"); 
        }else{

            velocity += val;
        }
    } 

    public double get_velocity(){
       
        return velocity;
    }

    public int get_march(){

        return march;
    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter car ID here: ");

        String id = input.nextLine();

        System.out.println("\nSelect an option:\n1) Automatic car\n2)Manual car\n");

        int type = input.nextInt();

        if(id != "" && (type == 1 || type == 2)){

            Automatic_car car1 = new Automatic_car(id);

            System.out.println(car1.toString());

            car1.acelerate(60);

            System.out.println(car1.toString());
        }

        
    }
}

class Manual_car extends Car{

    public Manual_car(String id){
        
        super(id);
    }
    
    public void change_march(int march){
        
        if(march < 0){

            throw new ArithmeticException("Can not be changed to a negative value"); 
        }else{

            super.change_march(march);
        }
    }
}

class Automatic_car extends Car{

    public Automatic_car(String id){

        super(id);
    }

    public void acelerate(double val){

        super.acelerate(val);

        if(get_velocity() < 10){

            change_march(1);
        }else if(get_velocity() < 30){

            change_march(2);
        }else if(get_velocity() < 50){

            change_march(3);
        }else if(get_velocity() < 80){

            change_march(4);
        }else{

            change_march(5);
        }
    }

    public void reduce(double val){

        super.reduce(val);

        if(get_velocity() < 5){

            change_march(1);
        }else if(get_velocity() < 20){

            change_march(2);
        }else if(get_velocity() < 40){

            change_march(3);
        }else if(get_velocity() < 60){

            change_march(4);
        }else{

            change_march(5);
        }
    }
}
