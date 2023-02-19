import java.io.*;
import java.util.*;

public class Words_classifier{

    public void length_classifier(String file_name, int length, String minimal, String max)throws IOException{

        BufferedReader in = new BufferedReader(new FileReader(file_name));

        PrintWriter out1 = new PrintWriter(new BufferedWriter(new FileWriter(minimal)));

        PrintWriter out2 = new PrintWriter(new BufferedWriter(new FileWriter(max)));

        String reader;

        while((reader = in.readLine()) != null){

            if(reader.length() < length){

                out1.println(reader);
            }else{
                out2.println(reader);
            }
        }

        in.close();
        out1.close();
        out2.close();
    }

    public static void main(String[] args){

        Words_classifier obj = new Words_classifier();

        String file_name = "the_file";

        String minimal = "min";

        String max = "max";

        int length = 10;

        try{

            obj.length_classifier(file_name, length, minimal, max);
        }catch(IOException e){

            System.out.println("An error has occurred!");
        }
    }
}
