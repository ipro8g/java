import java.io.*;
import java.util.*;

enum Career {SYS,INF,TCO,SEI,ICA,DIN,IND}

interface Loanable{
    
    void to_borrow();
    void give_back();
    boolean borrowed();
}

class Publication{

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
}

public class Project extends Publication implements Loanable, Comparable<Project>{

    public static Career career;
    private boolean borrowed;

    public Project(String code, String name, int year, Career career){
        
        super(code, name, year);
        this.career = career;
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

    public int compareTo(Project p){

        return get_code().compareTo(p.get_code());
    }

    public String toString(){
        
        return super.toString() + "Career: " + career + "\n";
    }

    public static void main(String[] args){
        
        Project project1 = new Project("code01", "artificial intelligence in business", 2025, career.SYS);

        System.out.println(project1.toString());
    }
}
