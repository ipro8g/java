import java.util.*;
import java.text.SimpleDateFormat;

public class Main{

    public static void main(String[] args){
    
        Calendar cal = Calendar.getInstance();
	    cal.add(Calendar.HOUR, 3);
        System.out.println("two hours after: " + cal.getTime());
	    cal.add(Calendar.HOUR, -3);
	    cal.add(Calendar.DAY_OF_YEAR, 14);
	    cal.add(Calendar.DAY_OF_YEAR, -14);
	    cal.add(Calendar.YEAR, 1);
        System.out.println("one year after: " + cal.getTime());
	    cal.add(Calendar.YEAR, -1);
	    cal.add(Calendar.DAY_OF_YEAR, -10);
        System.out.println("ten days before: " + cal.getTime());
	    cal.add(Calendar.DAY_OF_YEAR, 20);
        System.out.println("ten days after: " + cal.getTime());
        System.out.println(new SimpleDateFormat("MMM").format(cal.getTime()));
        
    }
}
