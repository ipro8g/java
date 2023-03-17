

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.sql.Timestamp; 
import java.text.*;   

public class Main{

    public static void main(String[] args){
    
        Date currentDate = new Date();
        long time = currentDate.getTime() / 1000;
        System.out.println(time);
    }
}
