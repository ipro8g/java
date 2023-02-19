public class Device{
    static double current_power;
    
    static double current_energy(){
        return current_power;
    }

    double energy;
    boolean is_on;
    String name;

    Device(double c, String n){
        this.energy = c;
        this.name = n;  
    }

    void turn_on(){
        this.is_on = true;
        current_power += this.energy;
        System.out.println(name + " ON.");
    }

    void turn_off(){
        this.is_on = false;
        current_power -= this.energy;
        System.out.println(name + " OFF.");
    }

    public static void main(String[] args){
        Device light = new Device(100, "light");
        Device fan = new Device(2000, "heat fan");
        Device iron = new Device(1200, "iron");

        light.turn_on();
        iron.turn_on();

        System.out.println("The current energy used by the network is: " + Device.current_energy() + " Watts");

        iron.turn_off();
        fan.turn_on();
        
        System.out.println("The current energy used by the network is: " + Device.current_energy() + " Watts");
    }
}
