import java.util.*;
import java.io.*;

public class Show_matrix_with_streams{

    void show_matrix_with_streams(byte[][] matrix){

        for(int i = 0; i < matrix.length; i++){
            ByteArrayInputStream row = new ByteArrayInputStream(matrix[i]);
            byte item;

            while((item = (byte)row.read()) != -1){
                System.out.print(item + " ");
            }   

            System.out.println();
        }
    }

    public static void main(String[] args){

        Show_matrix_with_streams ob = new Show_matrix_with_streams();

        byte[][] m1 = {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};

        ob.show_matrix_with_streams(m1);       
    }
}
