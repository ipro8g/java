public class Matrix_multiply{

    public static void main(String[] args){
        int c1 = 5, r1 = 5, c2 = 5, r2 = 5;
        
//to multiply the number of columns of the first matrix must be equals to numbers of rows of the second
//And the result will have the same number of rows as the 1st matrix, and the same number of columns as the 2nd matrix.

        if(c1 != r2){
            System.out.println("Warning, this result will be incorrect");
        }

        int matrix1[][] =  {{1,2,3,4,5},
                            {6,7,8,9,10},
                            {11,12,13,14,15},
                            {16,17,18,19,20},
                            {21,22,23,24,25}};

        int matrix2[][] = {{26,27,28,29,30},
                           {31,32,33,34,35},
                           {36,37,38,39,40},
                           {41,42,43,44,45},
                           {46,47,48,49,50}};

        int[][] result = new int[r2][c2];

        for (int a =0; a<r1; a++){
            for (int b=0; b<c2; b++){
                for (int c=0; c<c1; c++){

                    result[a][b] += (matrix1[a][c]*matrix2[c][b]);
                }
            }
        }

        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c2; j++){
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }



          
        int r1a = 1, c1a = 3, r2a = 3, c2a = 4;

        int cost_matrix[] = {3,4,2};

        int days_matrix[][] = {{13,9,7,15},
                                 {8,7,4,6},
                                 {6,4,0,3}};

        int[][] result2 = new int[r1a][c2a];

        for (int a =0; a<r1a; a++){
            for (int b=0; b<c2a; b++){
                for (int c=0; c<c1a; c++){

                                    //cost_matrix[a][c] for more than 1 row matrix
                                    //in this example we have 1 row
                    result2[a][b] += (cost_matrix[c]*days_matrix[c][b]);
                }
            }
        }

        System.out.println("\nTotal sellings:\n");
        System.out.println("Moonday\tTuesday\tWednesday\tThursday");

        for(int i = 0; i < r1a; i++){
            for(int j = 0; j < c2a; j++){
                
                System.out.print(result2[i][j] + "$\t");
            }
            System.out.println();
        }
    }
}
