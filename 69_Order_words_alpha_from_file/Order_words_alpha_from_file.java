import java.util.*;
import java.io.*;

public class Order_words_alpha_from_file{

    public void order_file_alpha(String file_name)throws IOException{
        
        BufferedReader input = new BufferedReader(new FileReader(file_name));
        ArrayList<String> all = new ArrayList<String>();
        String reader = null;

        while((reader = input.readLine()) != null){

            all.add(reader);
        }

        input.close();

        Collections.sort(all, String.CASE_INSENSITIVE_ORDER);
        PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter(file_name)));
        ListIterator<String> l = all.listIterator();

        while(l.hasNext()){
            output.println(l.next());
        }

        output.close();
    }

    public static void main(String[] args){

        Order_words_alpha_from_file obj = new Order_words_alpha_from_file();

        String file_name = "the_file";

        try{

        obj.order_file_alpha(file_name);
        }catch(IOException e){

            System.out.println("an error has occurred");
        }
    }
}
