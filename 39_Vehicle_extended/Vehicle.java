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

        Vehicle[] vehicles = {new Car("CARX01", 4), new Truck("TRUCK01X"), new Car("CARX02", 2), new Truck("TRUCK02X")};

        double a = 1;

        for(Vehicle vehicle: vehicles){

            if(vehicle instanceof Truck){
                
                ((Truck)vehicle).set_lifter((double)5000);
            }

            a *= 1.7;
            vehicle.acelerate(a*10);
        }

        for(Vehicle vehicle: vehicles){
            
            System.out.println(vehicle.toString());
        }

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
