public byte[][] Read_matrix_from_file(String file_name, int rows, int cols) throws IOException{

    FileInputStream file = new FileInputStream(file_name);

    if(file.avaliable() != rows*cols){

        throw new IllegalArgumentException("not valid argument");
    }

    byte[][] matrix = new byte[rows][cols];

    int element, i = 0, j = 0;

    while((element = file.read()) != -1){

        matrix[i][j++] = (byte)element;

        if(j == dim2){
            j = 0;
            j++;
        }
    }
    file.close();
    return matrix;   
}
