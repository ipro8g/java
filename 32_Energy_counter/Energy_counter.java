//this emulates a energy system with count

import java.util.Scanner;

public class Energy_counter{
    int energy;    
        
    Energy_counter(int energy){

        this.energy = energy;

        System.out.println("This system has been initialized with " + energy + " Watts");
    }

    void recharge_energy(int energy){

        this.energy += energy;

        System.out.println("Energy level is: " + this.energy + " Watts");
    }

    boolean use_counter(int req){

        if(this.energy < 10){

            System.out.println("Not enough energy");
            return false;
        }else{
            
            this.energy -= req;
            System.out.println("System ON");
            
        }
        
        System.out.println("Energy level is: " + this.energy + " Watts");
        return true;
    }

    public static void main(String[] args){
        int res = 0;

        Scanner input = new Scanner(System.in);        
        
        System.out.println("Enter initial energy in Watts");
        int energy = input.nextInt();

        Energy_counter e_counter = new Energy_counter(energy);
        
        while(res != 3){

        System.out.println("Select an option:\n\n1) Recharge energy\n\n2) Use energy\n\n3) Exit\n\n");
        res = input.nextInt();

        switch(res){

            case 1:
            System.out.println("Enter energy to recharge: ");
            energy = input.nextInt();

            e_counter.recharge_energy(energy);
            break;

            case 2:
            System.out.println("Enter energy to use: ");
            energy = input.nextInt();

            if(!e_counter.use_counter(energy)){
                res = 3;
            }
            break;

            case 3:
            System.out.println("Exit");
            break;  
 
        }

        }
    }
}
