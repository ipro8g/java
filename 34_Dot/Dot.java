

public class Dot{
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

    Dot(double x, double y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "(" + x + "," + y + ")";
    }

    public static void main(String[] args){
        Dot dot1 = new Dot(2.4, 1.6);
        Dot dot2 = new Dot(5.87, 3.14);

        System.out.printf("distance from dot2 to dot1: %.3f units\n", dot2.distance_to(dot1));

        System.out.println("coordinates of dot2: " + dot2.toString());
        
    }
}
