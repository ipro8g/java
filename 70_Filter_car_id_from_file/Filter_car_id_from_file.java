import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class Filter_car_id_from_file{

    public void check_ids_from_file(String file_name)throws IOException{
        
        BufferedReader input = new BufferedReader(new FileReader(file_name));

        ArrayList<String> all = new ArrayList<String>();

        String reader = null;

        while((reader = input.readLine()) != null){

            if(Pattern.matches("[0-9]{4}\\s[A-Z&&[^AEIOU]]{3}", reader)){

                all.add(reader);
            }
        }

        input.close();

        PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter(file_name)));

        ListIterator<String> list = all.listIterator();

        while(list.hasNext()){

            output.println(list.next());
        }

        output.close();
    }
    
    public static void main(String[] args){

        String file_name = "the_file";

        Filter_car_id_from_file obj = new Filter_car_id_from_file();

        try{

            obj.check_ids_from_file(file_name);
        }catch(IOException e){

            System.out.println("an error has occurred, try again.");
        }
    }
}
