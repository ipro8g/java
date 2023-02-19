import java.util.*;
import java.io.*;

public class Print_char_array_from_matrix{

    public String[] get_matrix_rows(char[][] matrix) throws IOException{

        String[] arr_str = new String[matrix.length];

        for(int i = 0; i < matrix.length; i++){
            
            BufferedReader fread = new BufferedReader(new CharArrayReader(matrix[i]));
            arr_str[i] = fread.readLine();
        }

        return arr_str;
    }

    public static void main(String args[]){

        char[][] matrix = {{'a','b','c','d','e'},
                          {'f','g','h','g','j'},
                          {'k','l','m','n','o'},
                          {'p','q','r','s','t'},
                          {'u','v','w','x','y'}};

        Print_char_array_from_matrix obj = new Print_char_array_from_matrix();

        String[] arr_str = new String[matrix.length];

        try{

            arr_str = obj.get_matrix_rows(matrix);
         }catch(IOException e) {

            e.printStackTrace();
        }

        for(int i = 0; i < arr_str.length; i++){

            System.out.print(arr_str[i] + "\t");
        }

    }
}
