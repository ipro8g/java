import java.io.*;

public class Write_first_100_nums{
    public static void main(String[] args){
        String str = "";

        for(int i = 1; i <= 100; i++){

            str += i + " ";

            if(i%10 == 0){

                str += '\n';
            }
        }    

        String file_name = "natural_numbers.txt";

        FileWriter write;

        try{
            write = new FileWriter(file_name);

            write.write(str);

            write.close();
        }catch(IOException e){

            System.out.println("Error, could not open file");
        }
    }
}
