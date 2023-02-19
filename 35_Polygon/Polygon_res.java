import java.util.*;

public class Polygon{
    private Dot dot1;
    private Dot dot2;
    private Dot dot3;
    private Dot dot4;
    private Dot dot5;
    private Dot dot6;
    
    private String name;

    private int vortices;

    public void move3(double dx, double dy){
        double dx2 = this.dot1.get_x() + dx;
        this.dot1.set_x(dx2);
        double dy2 = this.dot1.get_y() + dy;
        this.dot1.set_y(dy2);

        dx2 = this.dot2.get_x() + dx;
        this.dot2.set_x(dx2);
        dy2 = this.dot2.get_y() + dy;
        this.dot2.set_y(dy2);

        dx2 = this.dot3.get_x() + dx;
        this.dot3.set_x(dx2);
        dy2 = this.dot3.get_y() + dy;
        this.dot3.set_y(dy2);
    }

    /*public void move4(double dx, double dy){
        this.dot1.set_x(this.dot1.get_x() += dx);
        this.dot1.set_y(this.dot1.get_y() += dy);

        this.dot2.set_x(this.dot2.get_x() += dx);
        this.dot2.set_y(this.dot2.get_y() += dy);

        this.dot3.set_x(this.dot3.get_x() += dx);
        this.dot3.set_y(this.dot3.get_y() += dy);

        this.dot4.set_x(this.dot4.get_x() += dx);
        this.dot4.set_y(this.dot4.get_y() += dy);
    }

    public void move5(double dx, double dy){
        this.dot1.set_x(this.dot1.get_x() += dx);
        this.dot1.set_y(this.dot1.get_y() += dy);

        this.dot2.set_x(this.dot2.get_x() += dx);
        this.dot2.set_y(this.dot2.get_y() += dy);

        this.dot3.set_x(this.dot3.get_x() += dx);
        this.dot3.set_y(this.dot3.get_y() += dy);

        this.dot4.set_x(this.dot4.get_x() += dx);
        this.dot4.set_y(this.dot4.get_y() += dy);

        this.dot5.set_x(this.dot5.get_x() += dx);
        this.dot5.set_y(this.dot5.get_y() += dy);
    }

    public void move6(double dx, double dy){
        this.dot1.set_x(this.dot1.get_x() += dx);
        this.dot1.set_y(this.dot1.get_y() += dy);

        this.dot2.set_x(this.dot2.get_x() += dx);
        this.dot2.set_y(this.dot2.get_y() += dy);

        this.dot3.set_x(this.dot3.get_x() += dx);
        this.dot3.set_y(this.dot3.get_y() += dy);

        this.dot4.set_x(this.dot4.get_x() += dx);
        this.dot4.set_y(this.dot4.get_y() += dy);

        this.dot5.set_x(this.dot5.get_x() += dx);
        this.dot5.set_y(this.dot5.get_y() += dy);

        this.dot6.set_x(this.dot6.get_x() += dx);
        this.dot6.set_y(this.dot6.get_y() += dy);
    }*/

    public String position3(){

        return ("Dot1: " + this.dot1.toString() + "\nDot2: " +  this.dot2.toString() + "\nDot3: " + this.dot3.toString());
    }

    public Polygon(Dot dot1, Dot dot2, Dot dot3){
        this.dot1 = dot1;
        this.dot2 = dot2;
        this.dot3 = dot3;

        this.name = "threeangle";
        this.vortices = 3;

        System.out.println("Threeangle created succesfully\n        x   y\nDot1: " + dot1.toString());
        System.out.println("\n        x   y\nDot2: " + dot2.toString());
        System.out.println("\n        x   y\nDot3: " + dot3.toString());
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double x[] = {0,0,0,0,0,0};
        double y[] = {0,0,0,0,0,0};


        System.out.println("Select type: \n1) Threeangle\n2) Square\n3) Pentagon\n4) Hexagon");
        int res = input.nextInt();

        switch(res){

            case 1:
            for(int a = 0; a < res + 2; a++){

                System.out.println("Enter X coordinates for Dot" + (a + 1) + ": ");
                x[a] = input.nextDouble();
                System.out.println("Enter Y coordinates for Dot" + (a + 1) + ": ");
                y[a] = input.nextDouble();
            }

            Dot dot1 = new Dot(x[0], y[0]);
            Dot dot2 = new Dot(x[1], y[1]);
            Dot dot3 = new Dot(x[2], y[2]);

            Polygon threeangle = new Polygon(dot1, dot2, dot3);

            System.out.println("Enter units to X movement: ");
            x[0] = input.nextDouble();
            System.out.println("Enter units to Y movement: ");
            y[0] = input.nextDouble();

            threeangle.move3(x[0], y[0]);
            System.out.println(threeangle.position3());
            break;

            default:
            break;

        }

      

        
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
