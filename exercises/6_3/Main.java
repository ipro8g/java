import java.util.Calendar;
import java.util.Date;

public class Main{

    public static void main(String[] args){
    
        Calendar c = Calendar.getInstance();
        Date d = c.getTime();
        
        System.out.println("year: " + c.getMaximum(Calendar.YEAR) +
                            "\nmonth: " + c.getMaximum(Calendar.MONTH) +
                            "\nday: " + c.getMaximum(Calendar.DATE) +
                            "\nminute: " + c.getMaximum(Calendar.MINUTE));
                            
        System.out.println("year: " + c.getMinimum(Calendar.YEAR) +
                            "\nmonth: " + c.getMinimum(Calendar.MONTH) +
                            "\nday: " + c.getMinimum(Calendar.DATE) +
                            "\nminute: " + c.getMinimum(Calendar.MINUTE));
    }
}
