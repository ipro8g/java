import java.util.*;

class Movie{

    public double rating;
    public String name;
    public int year;
 
    // Constructor
    public Movie(String nm, double rt, int yr)
    {
        this.name = nm;
        this.rating = rt;
        this.year = yr;
    }
}
 
// Driver class
class Main{

    public static ArrayList<Movie> list2;
    
    public static ArrayList<Movie> sorted_list = new ArrayList<Movie>();

    public static void main(String[] args)
    {
        //i want to sort this arraylist by year asc
        ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));
        
        System.out.println("\nwithout sort");
        
        for(Movie m: list){
        
            System.out.println("\nname: " + m.name
                                + ", year: " + m.year
                                  + ", rating: " + m.rating);
        }
        
        list2 = list;
    
        //call get_min() method for for every element
        for(Movie m: list){
        
            get_min();
        }
        
        System.out.println("\nnow sorted");
        
        for(Movie m: sorted_list){
        
            System.out.println("\nname: " + m.name
                                + ", year: " + m.year
                                  + ", rating: " + m.rating);
        }
    }
    
    public static void get_min(){
        
        int min = 10000;
        int count = 0;  
        int min_index = -1;
     
        
        for(Movie m: list2){  
        
            if(m != null){
        
                if(m.year < min){
            
                    min = m.year; 
                    min_index = count; 
                }
            }
            
            count++;
        }
        
        if(min_index != -1){
        
            sorted_list.add(list2.get(min_index));
        
            list2.set(min_index, null);
        }
    }
}
