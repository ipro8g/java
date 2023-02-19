public class Matrix_sequence{

    public void fill_matrix(int matrix[][], int r, int c){
        int count1 = 0;        

        for(int i = 0; i < r; i++){

            for(int j = 0; j < c; j++){
                            
                matrix[i][j] = count1;
                count1++;    
            }
        }

        for(int i = 0; i < r; i++){

            for(int j = 0; j < c; j++){
                            
                System.out.print(matrix[i][j] + "\t");
            }

                System.out.println();
        }   
    }


    public static void main(String[] args){

        Matrix_sequence obj = new Matrix_sequence();

        int c = 5, r = 5;
        int matrix[][] = new int[c][r];

        obj.fill_matrix(matrix, c, r);
    }
}
