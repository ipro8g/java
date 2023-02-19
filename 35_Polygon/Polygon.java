import java.util.*;

public class Polygon{
    private Dot dot1;
    private Dot dot2;
    private Dot dot3;
    private Dot dot4;
    private Dot dot5;
    private Dot dot6;
    
    private String name;

    private Dot[] vortices;

    public int num_vortices(){

        return vortices.length;
    }

    public double perimeter(){

        double acum = 0;

        for(int i = 0; i < vortices.length - 1; i++){

            acum += vortices[i].distance_to(vortices[i + 1]);
        }

        acum += vortices[0].distance_to(vortices[vortices.length-1]);

        return acum;
    }

    public void move(double dx, double dy){

        double dx2;
        double dy2;

        for(Dot dot: vortices){

        dx2 = dot.get_x() + dx;
        dot.set_x(dx2);
        dy2 = dot.get_y() + dy;
        dot.set_y(dy2);

        }
    }

    public void scalar(double k){

        double kx2;
        double ky2;

        for(Dot dot: vortices){

        kx2 = dot.get_x() * k;
        dot.set_x(kx2);
        ky2 = dot.get_y() * k;
        dot.set_y(ky2);

        }
    }

    

    public void position(){

        int count = 0;        
        System.out.println("\n");

        for(Dot dot: vortices){

            System.out.println("Dot" + count + ": " + dot.toString() + "\n");
            count++;
        }
    }

    public Polygon(Dot[] value){

        vortices = value;
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
            
            Dot[] dot = {new Dot(x[0],y[0]), new Dot(x[1],y[1]), new Dot(x[2],y[2])};

            Polygon threeangle = new Polygon(dot);
            threeangle.position();

            System.out.println("Enter units to X movement: ");
            x[0] = input.nextDouble();
            System.out.println("Enter units to Y movement: ");
            y[0] = input.nextDouble();

            threeangle.move(x[0], y[0]);
            threeangle.position();
            System.out.printf("This Threeangle perimeter is: %.3f units.", threeangle.perimeter());

            System.out.println("\n\nEnter units to X Y scalar: ");
            x[0] = input.nextDouble();

            threeangle.scalar(x[0]);
            threeangle.position();
            System.out.printf("This Threeangle perimeter is: %.3f units.", threeangle.perimeter());
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
