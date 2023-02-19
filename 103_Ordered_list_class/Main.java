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


class Orderer_list<E extends Comparable<E>>{

    private List<E> list;

    public Orderer_list(){
        
        list = new ArrayList<E>();
    }

    public boolean add(E Obj){

        for(int i = 0; i < list.size(); i++){
            
            if(Obj.compareTo(list.get(i)) < 0){
                
                list.add(i, Obj);
                return true;
            }
        }

        list.add(Obj);
        return true;
    }

    public E get(int index){

        return list.get(index);
    }

    public int size(){
        
        return list.size();
    }

    public boolean remove(E Obj){
        
        return list.remove(Obj);
    }

    public boolean isEmpty(){
        
        return list.isEmpty();
    }

    public int indexOf(E Obj){
        
        return list.indexOf(Obj);
    }

    public String toString(){
        
        String s = "";

        for(int i = 0; i < list.size(); i++){
            
            s += list.get(i) + "\n";
        }

        return s;
    }
}

class Orderer_arraylist <E extends Comparable<E>> extends ArrayList<E>{
    
    public Orderer_arraylist(){}

    public boolean add(E Obj){
        
        for(int i = 0; i < size(); i++){
        
            if(Obj.compareTo(get(i)) < 0){

                add(i, Obj);
                return true;
            }
        }

        super.add(Obj);
        return true;
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

    public static void main(String[] args){
        
        Orderer_list<Project> projects = new Orderer_list<Project>();
        projects.add(new Project("SIS-04039", "Musical scores editor", 2005, Career.SYS));
        projects.add(new Project("INF-04003", "Voice recognizer", 2004, Career.INF));
        projects.add(new Project("SIS-03014", "Herramientas SAP", 2004, Career.SYS));
        System.out.println(projects);
    }
}
