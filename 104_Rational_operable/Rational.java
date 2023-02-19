import java.util.*;

interface Operable<E>{
    
    E add(E Obj);
    E sustract(E Obj);
    E product(E Obj);
    E division(E Obj);
}

public class Rational implements Operable<Rational>{
    
    private int num;
    private int den;

    public Rational(int numerator, int denominator){
        
        if(denominator == 0){
            
            num = 0;
            den = 1;
        }else{

            num = numerator;
            den = denominator;
        }
    }

    public int get_num(){
        
        return num;
    }

    public int get_den(){
        
        return den;
    }

    public Rational add(Rational r){
        
        int r_num = num * r.get_den() + r.get_num() * den;
        int r_den = den * r.get_den();

        return new Rational(r_num, r_den);
    }

    public Rational sustract(Rational r){
        
        int r_num = num * r.get_den() - r.get_num() * den;
        int r_den = den * r.get_den();

        return new Rational(r_num, r_den);
    }

    public Rational product(Rational r){

        int r_num = num * r.get_num();
        int r_den = den * r.get_den();

        return new Rational(r_num, r_den);
    }

    public Rational division(Rational r){

        int r_num = num * r.get_den();
        int r_den = den * r.get_num();

        if(r_den == 0){
            
            Rational ret = new Rational(0, 1);
            return ret;
        }

        return new Rational(r_num, r_den);
    }

    public String toString(){
        
        return num + "/" + den;
    }

    public static void main(String[] args){
    
        Rational n1 = new Rational(15, 4);
        Rational n2 = new Rational(6, 2);

        Rational result1 = n1.add(n2);

        System.out.println(result1.toString());

        Rational result2 = n1.sustract(n2);

        System.out.println(result2.toString());

        Rational result3 = n1.product(n2);

        System.out.println(result3.toString());

        Rational result4 = n1.division(n2);

        System.out.println(result4.toString());
    }
}
