//this counts how many birthdays are thursday

import java.util.GregorianCalendar;
import java.util.Calendar;

public class Day_birthday{
    public static void main(String[] args){
        int count_thursday = 0;

        GregorianCalendar gc = new GregorianCalendar(1989, Calendar.MARCH, 23);

        for(int i = 0; i < 55; i++){
            gc.roll(Calendar.YEAR, 1);

            if(gc.get(Calendar.DAY_OF_WEEK) == Calendar.THURSDAY){
                count_thursday++;
                
                System.out.println("The " + gc.get(Calendar.DAY_OF_MONTH) +
                                   "/" + (gc.get(Calendar.MONTH) + 1) +
                                   "/" + gc.get(Calendar.YEAR) +
                                    " is Thursday");
            }
        }
        System.out.println("The Birthday occurs in " + count_thursday + " days being Thursday");
    }
}
