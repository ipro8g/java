import java.util.*;

public class Test{
    String area;
    String room;
    private Date date;
    private Hour hour;

    public Test(String area, String room, Date date, Hour hour){
        this.area = area;
        this.room = room;
        this.date = date;
        this.hour = hour;
    }

    public void set_area(String area){

        this.area = area;
    }

    public void set_room(String room){

        this.room = room;
    }

    public void set_date(Date date){

        this.date = date;
    }

    public String get_area(){

        return area;
    }

    public String get_room(){

        return room;
    }

    public Date get_date(){

        return date;
    }

    public String toString(){

        return "Area: " + area + "\nRoom: " + room + "\nDate: " + date.toString() + "\nHour: " + hour.toString();
    }

    public void set_hour(Hour hour){

    this.hour = hour;
    }

    public static void main(String[] args){
        Date date = new Date(25, 11, 2022);
        Hour hour = new Hour(12, 30);
        Test programming = new Test("Math", "23c", date, hour);

        System.out.println(programming.toString());
        programming.set_date(new Date(20, 1, 2022));
        programming.set_hour(new Hour(6, 20));
        System.out.println(programming.toString());
    }
}

class Date{
    int day;
    int month;
    int year;

    Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString(){
        return day + "/" + month + "/" + year;
    }
}

class Hour{
    int hour;
    int minute;

    public Hour(int hour, int minute){
        
        if(hour < 0 || hour > 23 ||minute < 0 || minute > 59){

            throw new IllegalArgumentException();            
        }else{

            this.hour = hour;
            this.minute = minute;
        }
    }

    public String toString(){

        Formatter f = new Formatter();
        return hour + ":" + f.format("%02d",minute);
    }

    public int get_hour(){

        return hour;
    }

    public int get_minute(){

        return minute;
    }
}
