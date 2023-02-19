public class Identity_matrix{

    public void fill_matrix(int matrix[][], int r, int c){
        int count1 = 0;        

        for(int i = 0; i < r; i++){

            for(int j = 0; j < c; j++){

                if(i == j){

                    matrix[i][j] = 1;
                }else{

                    matrix[i][j] = 0;
                } 
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

        Identity_matrix obj = new Identity_matrix();

        int c = 8, r = 8;
        int matrix[][] = new int[c][r];

        obj.fill_matrix(matrix, c, r);
    }
}
