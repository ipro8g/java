import java.util.*;
import java.io.*;

public class Identity_matrix_stream{

    public byte[][] get_identity_matrix(int dimension){

        if(dimension <= 0){

            throw new IllegalArgumentException("Invalid argument");
        }

        byte[][] matrix = new byte[dimension][];

        for(int i = 0; i < matrix.length; i++){

            ByteArrayOutputStream file = new ByteArrayOutputStream(dimension);

            for(int j = 0; j < dimension; j++){

                file.write(i == j ? 1 : 0);
            }

            try{
                file.close();
            }catch(IOException ioE){}
            
            matrix[i] = file.toByteArray();
        }

        return matrix;
    }

    public static void main(String[] args){

        //c columns, r rows
        int c = 5, r = 5;

        Identity_matrix_stream ob = new Identity_matrix_stream();

        byte[][] matrix = new byte[c][r];

        matrix = ob.get_identity_matrix(c);

        for(int i = 0; i < c; i++){

            for(int j = 0; j < r; j++){

                System.out.print(matrix[i][j] + "\t");
            }

            System.out.println();
        }
    }
}
