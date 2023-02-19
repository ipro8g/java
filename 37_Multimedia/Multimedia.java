enum Format {wav, mp3, midi, avi, mov, mpg, cd_audio, dvd}

public class Multimedia{

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


    public static void main(String[] args){

        Multimedia_list multi_list = new Multimedia_list(10);

        Movie[] movies = {new Movie("Matrix", "Watchowski Sisters", Format.dvd, (double)120, "Keanu Reeves", "Mary Ann Moss"), new Movie("Forrest Gump", "Steven Spilberg", Format.dvd, (double)120, "Tom Hanks", ""), new Movie("Jurassic Park", "Steven Spilberg", Format.dvd, (double)120, "An Actor", "An Actress")};

        for(Movie single_movie: movies){


            multi_list.add(single_movie);

        }

        Disk[] disks = {new Disk("On The Planet", "Meiko Nakahara", Format.mp3, (double)30, "City Pop"), new Disk("Go Ahead", "Tatsuro Yamashita", Format.mp3, (double)40, "Jfunk"), new Disk("After 5 Clash", "Toshiki Kadomatsu", Format.mp3, (double)35, "City Pop"), new Disk("Paranoid", "Black Sabbath", Format.mp3, (double)45, "rock"), new Disk("Highway Star", "Deep Purple", Format.mp3, (double)35, "rock")};

        for(Disk single_disk: disks){


            multi_list.add(single_disk);

        }

        System.out.println(multi_list.toString());


    }
}

class Movie extends Multimedia{

    private String actor;
    private String actress;

    public String get_actor(){

        return actor;
    }

    public String get_actress(){

        return actress;
    }

    public Movie(String title, String author, Format format, double duration, String actor, String actress){

                    super(title, author, duration, format);

                    this.actor = actor;
                    this.actress = actress;

                    if(actor == null && actress == null){
                    
                        System.out.println("Error, at least an actor or actress must exists.");
                    }
    }

    public String toString(){

            String actors =  "";

            if(actress != ""){

                actors += ("\nMain Actress: " + actress);
            }
                
            if(actor != ""){

                actors += ("\nMain actor: " + actor);
            }

            actors += super.toString();
            return actors;
    }
}

class Multimedia_list{

    private Multimedia list[];
    private int items;

    public Multimedia_list(int n){

        list = new Multimedia[n];
        items = 0;

        System.out.println("Multimedia list object created successfully");
    }

    public int size(){

        return items;
    }

    private boolean full(){

        return (items == list.length);
    }

    public boolean add(Multimedia m){

        if(full()){

            return false;
        }else{
   
            list[items] = m;
            items++;
            return true;
        }
    }

    public Multimedia get(int position){

        if(position < 0 || position >= items){

            throw new IndexOutOfBoundsException();
        }
        
        return list[position];
    } 

    public int index_of(Multimedia m){

        int a = 0;

        for(Multimedia item: list){

            if(item.equals(m)){
            
                return a;
            }

            a++;
        }

        return -1;
    }

    public String toString(){

        String info = "";
        double acum = 0;
        int count_rock = 0;
        int count_no_actress = 0;

        for(int i = 0; i < items; i++){

            info += (list[i].toString() + "\n\n");
            acum += list[i].get_duration();

            if(list[i] instanceof Disk){

                Disk disk = (Disk)list[i];

                String genre = disk.get_genre();

                if(genre == "rock"){

                    count_rock++;
                }
            }

            if(list[i] instanceof Movie){

                Movie movie = (Movie)list[i];

                String actress = movie.get_actress();

                if(actress == ""){

                    count_no_actress++;
                }
            }
        }

        info += ("\nThe total duration of this list is: " + acum + " minutes");
        info += ("\nTotal rock disks found on this list is: " + count_rock);        
        info += ("\nTotal movies without Main Actress on this list is: " + count_no_actress);

        return info;
    }

   
}

class Disk extends Multimedia{
    
    private String genre;

    public Disk(String title, String author, Format format, double duration, String genre){

        super(title, author, duration, format);

        this.genre = genre;
    }

    public String toString(){

        String info = ("Genre " + genre);

        info += super.toString();

        return info;
    }

    public String get_genre(){

        return genre;
    }
}
