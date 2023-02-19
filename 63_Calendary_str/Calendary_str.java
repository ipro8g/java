import java.io.*;
import java.util.*;

public class Calendary_str{
    String[][] stream = new String[12][30];

    String[] months = {"jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"};

    String[] days = {"mon","tue","wed","thu","fri","sat","sun"};

    String[] populate_month(int first_day){

        String[] month = new String[30];

        

        int count = first_day;
        

            for(int j = 1; j <= 30; j++){
            
              month[j-1] += (j + days[count]);

                if(count == 6){
                    
                    count = 0;
                    continue;
                }

                count++;
            }

        return month;
    }

    void populate_stream(){

        int count = 0;

        for(int i = 0; i < 12; i++){

        System.out.println();
        
        System.out.println('\t' + months[i]);

            for(int j = 1; j <= 30; j++){
            
              System.out.print(j + days[count] + '\t');

                stream[i][j-1] = j + days[count];

                if(j % 7 == 0){

                    System.out.println();
                }

                if(count == 6){
                    
                    count = 0;
                    continue;
                }

                count++;
            }

        }
    }


    void print_some(int month, int day){
        
        System.out.println(stream[month][day]);
    }

    void write_stream_file(String file_name, String[] streams) throws IOException{
        
        FileWriter writer = new FileWriter(file_name);

        for(String str: streams){

            for(int i = 0; i < str.length(); i++){

                writer.write(str.charAt(i)); // method toCharArray() works fine too
            }

            writer.write('*');
        }
        writer.close();                
    }

    String[] read_stream_file(String file_name) throws IOException{
        
        FileReader file = new FileReader(file_name);
        
        ArrayList<String> all = new ArrayList<String>();

        int reading;

        CharArrayWriter str = new CharArrayWriter();

        while((reading = file.read()) != -1){
            
            char ch = (char)reading;

            if(ch == '*'){

                str.close();
                all.add(str.toString());
                str.reset();
            }else{

                str.write(ch);
            }
        }
        
        return((String[])all.toArray(new String[all.size()]));
    }

    public static void main(String[] args){
        
        Calendary_str obj = new Calendary_str();

        String[] streams = new String[30];
        String[] streams_back = new String[30];

        //obj.populate_stream();

        //obj.print_some(2, 22);

        //month june, first day of month thursday
        

        streams = obj.populate_month(4);

         try{

            obj.write_stream_file("the_file", streams);
        }catch(IOException e) {

            e.printStackTrace();
        }

        try{

            streams_back = obj.read_stream_file("the_file");
        }catch(IOException e) {

            e.printStackTrace();
        }

        System.out.println("The content saved is: ");

        for(String str: streams_back){

            System.out.println(str);
        }
    }
}
