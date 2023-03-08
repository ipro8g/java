public class Main{

    public static void main(String[] args){
    
        int totalSecs = 86399;
    
        int hours = totalSecs / 3600;
        int minutes = (totalSecs % 3600) / 60;
        int seconds = totalSecs % 60;

        System.out.println(totalSecs + " seconds are: " + String.format("%02d:%02d:%02d", hours, minutes, seconds));
    }
}
