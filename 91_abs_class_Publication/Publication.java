import java.util.*;
import java.io.*;

public abstract class Publication{

    private String code;
    private String title;
    private int year;

    public Publication(String code, String title, int year){
        
        this.code = code;
        this.title = title;
        this.year = year;
    }

    public int get_year(){
        
        return year;
    }

    public String get_code(){

        return code;
    }

    public String toString(){
        
        return "code: " + code + "\ntitle: " + title + "\npublishing year: " + year + "\n";
    }

    public static void main(String[] args){
        
        Book obj = new Book("BOOK01", "Physics Paul A. Tipler", 1997);
        System.out.println(obj.toString());
    }
}

class Magazine extends Publication{
    
    private int number;

    public Magazine(String code, String title, int year, int number){
        
        super(code, title, year);
        this.number = number;
    }

    public String toString(){
        
        return super.toString() + "number: " + number + "\n";
    }
}

interface Loanable{
    
    void to_borrow();
    void give_back();
    boolean borrowed();
}

class Book extends Publication implements Loanable{
    
    private boolean borrowed;

    public Book(String code, String title, int year){
        
        super(code, title, year);
        borrowed = false;
    }

    public void to_borrow(){
        
        borrowed = true;
    }

    public void give_back(){
        
        borrowed = false;
    }

    public boolean borrowed(){
        
        return borrowed;
    }

    public String toString(){
        
        return super.toString() + (borrowed ? "borrowed" : "not borrowed") + "\n";
    }
}
