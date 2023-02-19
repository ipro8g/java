public class Vehicle{

    private String id;
    private double velocity;
    
    Vehicle(String id){

        this.id = id;
        velocity = 0;
    }

    public void acelerate(double val){
        
        velocity += val;
    }

    public double get_velocity(){

        return velocity;
    }

    public String toString(){

        String info = "";

        info += ("\nID: " + id + "\nVelocity: " + velocity + " Km/h");

        return info;
    }

    public static void main(String[] args){

        Car car1 = new Car("00A00", 2);

        System.out.println(car1.toString());

        car1.acelerate((double)25);

        System.out.println(car1.toString());

        Truck truck1 = new Truck("00C0F");

        System.out.println(truck1.toString());

        truck1.acelerate((double)15);
        truck1.set_lifter((double)1000);

        System.out.println(truck1.toString());

        truck1.acelerate((double)80);

        System.out.println(truck1.toString());

    }
}

class Car extends Vehicle{
        
    private int doors;

    public int get_doors(){
        
        return doors;
    }    
    
    Car(String id, int doors){

        super(id);

        this.doors = doors;
    }

    public String toString(){

        String info = "";
        info += (super.toString() + "\nNumber of doors: " + get_doors());

        return info;
    }
}

class Truck extends Vehicle{
    
    double lifter_weight;
    private boolean exists_lifter;

    Truck(String id){

        super(id);
        lifter_weight = 0;
        exists_lifter = false;
    } 


    public void set_lifter(double weight){

        exists_lifter = true;

        lifter_weight = weight;

    }

    public double get_lifter(){
        
        return lifter_weight;
    }

    public void acelerate(double val){

        if(get_lifter() != 0 && ((super.get_velocity() + val) > 100)){

            throw new ArithmeticException("Cannot acelerate over 100 Km/h"); 
        }else{

            super.acelerate(val);
        }
    }

    public String toString(){

        String info = "";
        info += super.toString();

        if(exists_lifter){

            info += " lifter with " + get_lifter() + " Kgs";
        }

        return info;
    }       
}
