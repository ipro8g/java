import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main{

    public static void main(String[] args){
    
        String start_date = "10-12-1492 00:00:00";
 
        // Given end Date
        String end_date = "10-06-2010 00:00:00";
    
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
 
        // Try Block
        try {
 
            // parse method is used to parse
            // the text from a string to
            // produce the date
            Date d1 = sdf.parse(start_date);
            Date d2 = sdf.parse(end_date);
 
            // Calculate time difference
            // in milliseconds
            long difference_In_Time = d2.getTime() - d1.getTime();
 
            // Calculate time difference in
            // seconds, minutes, hours, years,
            // and days
            long difference_In_Seconds = (difference_In_Time/ 1000)% 60;
 
            long difference_In_Minutes = (difference_In_Time/ (1000 * 60))% 60;
 
            long difference_In_Hours = (difference_In_Time/ (1000 * 60 * 60))% 24;
 
            long difference_In_Years = (difference_In_Time/ (1000l * 60 * 60 * 24 * 365));
 
            long difference_In_Days = (difference_In_Time/ (1000 * 60 * 60 * 24))% 365;
 
            // Print the date difference in
            // years, in days, in hours, in
            // minutes, and in seconds
 
            System.out.print("Difference "+ "between two dates is: ");
 
            System.out.println(difference_In_Years+ " years, " + difference_In_Days + " days, " + difference_In_Hours + " hours, " + difference_In_Minutes + " minutes, " + difference_In_Seconds + " seconds");
                
        }catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
