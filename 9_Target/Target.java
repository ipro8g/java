public class Target{
    double x, y;

    //get target position at specified time
    void yposition(double x){
        this.y = 2 * x + 1;
        this.x = xposition(this.y);
    }

    double xposition(double y){
        return (y - 1) / 2;
    }

    public static void main(String[] args){
        Target target1 = new Target();
        double time[] = {3.5, 4, 6.2};
        
        target1.yposition(time[0]);
        System.out.println("Target position at: " + time[0] + " seconds is, X: " + target1.x + ", Y: " + target1.y);

        target1.yposition(time[1]);
        System.out.println("Target position at: " + time[1] + " seconds is, X: " + target1.x + ", Y: " + target1.y);

        target1.yposition(time[2]);
        System.out.println("Target position at: " + time[2] + " seconds is, X: " + target1.x + ", Y: " + target1.y);
    }
}
