import java.util.Scanner;

public class Car{
    public String model;
    public String color;
    public int type_int;
    public String type[] = {"mini","utility","family","sport"};
    public int ensurance_int;
    public String ensurance[] = {"risky","tercerize"};
    public int mpaint_int;
    public String mpaint[] = {"is not metalized","is metalized"};
    public int iden;
    public int year;
    
    //Object constructor
    public Car(String model, String color, int type, int ensurance, int paint, int iden, int year){
        this.model = model;
        this.color = color;
        this.type_int = type;
        this.ensurance_int = ensurance;
        this.mpaint_int = paint;
        this.iden = iden;
        this.year = year;
    }
    
    //print attributes on screen
    public void print_attr(){
        System.out.println(
            "Model\tColor\tType\tEnsurance\tPaint\tIden\tYear"
        );
        System.out.println(
            this.model + "\t" + this.color + "\t" + this.type[this.type_int] + "\t" +  this.ensurance[this.ensurance_int] + "\t" + this.mpaint[this.mpaint_int] + "\t" + this.iden + "\t" + this.year
        );
    }

    //main method
    public static void main(String[] args){
        
        System.out.println("\nEnter Cars model here: ");
        Scanner input = new Scanner(System.in);
        String model = input.nextLine();

        System.out.println("\nEnter Cars color here: ");
        String color = input.nextLine();

        System.out.println("\nSelect type:\n0) for mini\n1) for utility\n2) for family\n3) for sport\n");
        int type = input.nextInt();

        System.out.println("\nSelect Ensurance:\n0) for risky\n1) for tercerize\n");
        int ensurance = input.nextInt();

        System.out.println("\nSelect Paint:\n0) for not metalized\n1) for metalized\n");
        int paint = input.nextInt();

        System.out.println("\nidentification number\n");
        int iden = input.nextInt();

        System.out.println("\nEnter manufacture year\n");
        int year = input.nextInt();

        Car car1 = new Car(model, color, type, ensurance, paint, iden, year);
        car1.print_attr();       
        
    }
}
