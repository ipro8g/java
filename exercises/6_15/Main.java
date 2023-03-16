import java.util.*;

public class Main{

    public static void main(String[] args){
    
        Calendar cal = Calendar.getInstance();
	    cal.add(Calendar.HOUR, 3);
        System.out.println("two hours after: " + cal.getTime());
	    cal.add(Calendar.HOUR, -3);
	    cal.add(Calendar.DAY_OF_YEAR, 14);
	    cal.add(Calendar.DAY_OF_YEAR, -14);
	    cal.add(Calendar.YEAR, 1);
        System.out.println("two weeks after: " + cal.getTime());
    }
}
