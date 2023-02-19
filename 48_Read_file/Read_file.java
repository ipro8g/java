import java.io.*;

public class Read_file{

    public static void main(String[] args){

        String file_name = "test.txt";

        FileWriter write;

        try{
            write = new FileWriter(file_name);

            for(char c = 'a'; c <= 'z'; c++){

                write.write(c);
            }

            write.close();
        }catch(IOException e){

            System.out.println("Error, could not open file");
        }

        FileReader read;
        int c;

        try{

            read = new FileReader(file_name);
            c = read.read();

            while(c != -1){

                System.out.print((char)c);
                c = read.read();
            }
            read.close();
        }catch(IOException e){

            System.out.println("Error, could not open file");
        }
        
    }
}
