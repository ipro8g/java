import java.util.*;
import java.io.*;


enum Format {wav, mp3, midi, avi, mov, mpg, cd_audio, dvd}

interface Loanable{
    
    void to_borrow();
    void give_back();
    boolean borrowed();
}

class Multimedia{

    private Format format;
    private String title;
    private String author;
    private double duration;

    Multimedia(String title, String author, double duration, Format format){

        this.title = title;
        this.author = author;
        this.duration = duration;
        this.format = format;
    }

    public String get_title(){

        return title;
    }

    public String get_author(){

        return author;
    }

    public double get_duration(){

        return duration;
    }

    public String toString(){

        return ("\nA ." + format + " file,\ntitle: " + title + "\nauthor: " + author + "\nduration: " + duration);
    }

    public boolean equals(Multimedia m){

        return title.equals(m.get_title()) && author.equals(m.get_author());
    }
}

public class Disk extends Multimedia implements Loanable{
    
    private String genre;
    private boolean borrowed;

    public Disk(String title, String author, Format format, double duration, String genre){

        super(title, author, duration, format);

        this.genre = genre;

        System.out.println("Disk created: " + title + ", " + author + ", " + duration + ", " + format + ", " + genre);
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

        String info = ("Genre " + genre);

        info += super.toString();

        return info;
    }

    public String get_genre(){

        return genre;
    }

    public static void main(String[] args){
        
        Disk[] disks = {new Disk("On The Planet", "Meiko Nakahara", Format.mp3, (double)30, "City Pop"), new Disk("Go Ahead", "Tatsuro Yamashita", Format.mp3, (double)40, "Jfunk"), new Disk("After 5 Clash", "Toshiki Kadomatsu", Format.mp3, (double)35, "City Pop"), new Disk("Paranoid", "Black Sabbath", Format.mp3, (double)45, "rock"), new Disk("Highway Star", "Deep Purple", Format.mp3, (double)35, "rock")};
    }
}


