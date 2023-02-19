enum type {H24,H12};
enum turn {AM,PM};

public class Clock{
    int hour, minute, second;

    Clock(){
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public String get_hour(type t){

        if(t == type.H24){
            return hour + ":" + minute + ":" + second;
        }else if(t == type.H12){
            return ((hour > 12) ? hour - 12 : hour) + ":" + minute + ":" + second;
        }

        return "";
    }

    void set_hour(int hour, int minute, int second){

            this.hour = hour;
            this.minute = minute;
            this.second = second;

    }

    public static void main(String[] args){
        Clock clock1 = new Clock();
        System.out.println(clock1.get_hour(type.H24));
        
        clock1.set_hour(13,21,40);

        System.out.println(clock1.get_hour(type.H12));
    }
}
