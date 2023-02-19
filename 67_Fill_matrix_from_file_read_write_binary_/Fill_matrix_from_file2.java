import java.io.*;
import java.util.*;

public class Fill_matrix_from_file2{

    public int[][] fill_matrix(int[][] matrix){

        int count = 0;
        
        for(int a = 0; a < matrix.length; a++){

            for(int b = 0; b < matrix[a].length; b++){
                
                matrix[a][b] = count;

                count++;
            }
        }

        return matrix;
    }

    public void write_matrix(int[][] matrix)throws IOException{

        FileOutputStream out = new FileOutputStream("binary.dat");

        int count = 0;
    
        byte[] buffer = new byte[100];
        
        for(int a = 0; a < matrix.length; a++){

            for(int b = 0; b < matrix[a].length; b++){
                
                buffer[count] = (byte)matrix[a][b];

                count++;
            }
        }

        out.write(buffer);

        out.close();
    }

    public int[][] read_matrix()throws IOException{

        int count = 0;

        int[][] matrix = new int[10][10];

        File file = new File("binary.dat");

        byte[] buffer = new byte[100];

        DataInputStream dis = new DataInputStream(new FileInputStream(file));

        dis.readFully(buffer);

        dis.close();

        for(int a = 0; a < matrix.length; a++){

            for(int b = 0; b < matrix[a].length; b++){
                
                matrix[a][b] = buffer[count];

                count++;
            }
        }

        return matrix;
    
    }

    public static void main(String[] args){

        Fill_matrix_from_file2 obj = new Fill_matrix_from_file2();

        int[][] matrix = new int[10][10];
        int[][] matrix_back = new int[10][10];

        matrix = obj.fill_matrix(matrix);

        try{

            obj.write_matrix(matrix);
        }catch(IOException e){

            System.out.println("an error has occured");
        }

        try{

            matrix_back = obj.read_matrix();
        }catch(IOException e){

            System.out.println("an error has occured");
        }

        for(int a = 0; a < 10; a++){

            for(int b = 0; b < 10; b++){

                System.out.print(matrix_back[a][b]);
            }

            System.out.println();
        }

    }
}
