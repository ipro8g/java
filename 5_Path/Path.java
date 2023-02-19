import java.util.Scanner;

public class Path{
    //return distance from last point to current
    public static double distance(double a, double b, double c, double d){
        return (Math.sqrt(Math.pow((c-a),2)+Math.pow((d-b),2)));
    }

    public static void main(String[] args){

        double acum_d = 0, last_x = 0, last_y = 0,distance_value;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of points here: ");
        int n_dots = input.nextInt();

        for(int a = 0; a < n_dots; a++){

            System.out.println("Enter x coords for point " + (a+1) + " here: ");
            int x = input.nextInt();
            System.out.println("Enter y coords for point " + (a+1) + " here: ");
            int y = input.nextInt();

            distance_value = distance(last_x, last_y, x, y);
            
            acum_d += distance_value;

            last_x = x;
            last_y = y;
        }

        System.out.println("The total distance is: " + acum_d + " units.");
    }
}
