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

class Project extends Publication implements Loanable, Comparable<Project>{
    
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
}

public class Main{
    
    public static int count_borrowed(Object[] list){
        
        int count = 0;

        for(Object o: list){

            if(o instanceof Loanable && ((Loanable)o).borrowed()){
                count++;
            }
        }

        return count;
    }

    public static int old_publications_to(Publication[] list, int year){

        int count = 0;

        for(Publication p: list){

            if(p.get_year() < year){

                count++;
            }
        }

        return count;
    }

    public static void main(String[] args){
        
        Publication[] projects = new Publication[3];
        projects[0] = new Project("SIS04039", "musical scores editor", 2005, Career.SYS);
        projects[1] = new Project("INF04003", "voice recognizer", 2004, Career.INF);
        projects[2] = new Project("SIS03014", "SAP tools", 2004, Career.SYS);

        ((Loanable)projects[0]).to_borrow();
        ((Loanable)projects[2]).to_borrow();

        System.out.println(count_borrowed(projects) + " borrowed projects");

        Arrays.sort(projects);

        for(Publication p: projects){

            System.out.println(p);
        }
    }
}
