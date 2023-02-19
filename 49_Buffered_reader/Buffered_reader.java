import java.io.*;

public class Buffered_reader{
    public static void main(String[] args){

        //String file_name = "Buffered_reader.java";
        String file_name = "file.txt";

        FileReader file;
        BufferedReader filter;
        String line;

        try{
            file = new FileReader(file_name);
            filter = new BufferedReader(file);
            line = filter.readLine();

            while(line != null){

                System.out.println(line);
                line = filter.readLine();
            }

            filter.close();

        }catch(IOException e){

            System.out.println("Error, could not open file");
        }
    }
}
