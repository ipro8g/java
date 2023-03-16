import java.util.Calendar;
import java.util.Date;

public class Main{

    public static void main(String[] args){
    
        Calendar c = Calendar.getInstance();
        Date d = c.getTime();
        
        System.out.println("year: " + c.get(Calendar.YEAR) +
                            "\nmonth: " + c.get(Calendar.MONTH) +
                            "\nday: " + c.get(Calendar.DATE) +
                            "\nminute: " + c.get(Calendar.MINUTE));
    }
}
