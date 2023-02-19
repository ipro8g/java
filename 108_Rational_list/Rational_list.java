import java.util.*;

interface Operable<E>{
    
    E add(E Obj);
    E sustract(E Obj);
    E product(E Obj);
    E division(E Obj);
}

class Rational implements Operable<Rational>{
    
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
}

public class Rational_list{
    
    public static <T extends Operable<T>> T add_all(List<T> list){

        T result = list.get(0);

        for(int i =1; i < list.size(); i++){
            result = result.add(list.get(i));
        }

        return result;
    }

    public static <T extends Operable<T>> void power_two(List<T> list){

        for(int i = 0; i < list.size(); i++){
            
            T result = list.get(i).product(list.get(i));
            list.set(i, result);
        }
    }

    public static void main(String[] args){
    
        Rational r1 = new Rational(1,2);
        Rational r2 = new Rational(2,3);
        Rational r3 = new Rational(1,4);

        List<Rational> rationals = new ArrayList<Rational>();

        rationals.add(r1);
        rationals.add(r2);
        rationals.add(r3);

        System.out.println(add_all(rationals));
        System.out.println(rationals);
        power_two(rationals);
        System.out.println(rationals);
    }
}
