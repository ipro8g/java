import java.io.*;
import java.util.*;

public class Main{

    public static String[] get_lines_from_file(String file_name)throws IOException{

        BufferedReader read_stream = new BufferedReader(new FileReader(file_name));

        String read = null;

        ArrayList<String> all = new ArrayList<String>();

        while((read = read_stream.readLine()) != null){

            all.add(read);
        }

        read_stream.close();

        return((String[])all.toArray(new String[all.size()]));
    }

    public static void main(String[] args){

        String[] result = new String[20];

        
        try{

            result = get_lines_from_file("../linux notes/mongodb");

        }catch(IOException e){

            System.out.println("Error, could not open file");
        }

        for(String str2: result){
            
            System.out.println(str2);
        }
    }
}
