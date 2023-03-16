import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.Timestamp;  

public class Main{

    public static void main(String[] args){
    
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Timestamp(System.currentTimeMillis()));
        System.out.println(timeStamp);
    }
}
