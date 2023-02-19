import java.util.*;

public class Generic_matrix<E>{

    private E[][] table;

    public Generic_matrix(int rows, int columns){
        
        table = (E[][]) new Object[rows][columns];
    }

    public void set(int row, int column, E element){

        table[row][column] = element;
    }

    public E get(int row, int column){
        
        return table[row][column];
    }

    public int columns(){

        return table[0].length;    
    }

    public int rows(){

        return table.length;    
    }

    public String toString(){

        String s = "";

        for(int i = 0; i < table.length; i++){

            for(int j = 0; j < table[0].length; j++){

                s += table[i][j] + "\t";
            }

            s += "\n";
        }

        return s;
    }

    public static void main(String[] args){
        
        Generic_matrix<Integer> m = new Generic_matrix<Integer>(4,2);

        int num = 1;

        for(int i = 0; i < m.rows(); i++){

            for(int j = 0; j < m.columns(); j++){
            
                m.set(i,j,num++);
            }
        }

        System.out.println(m);
        System.out.println(m.get(0,1));

        m.toString();
    }
}
