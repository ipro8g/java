import java.io.*;
import java.util.*;

public class Copy_file{

public void copy_file(String source_route, String copy_route, boolean replace)throws FileNotFoundException, IOException{

    if(source_route == null || copy_route == null){

        throw new IllegalArgumentException("not valid route, try again");
    }

    File origin = new File(source_route);
    File copy = new File(copy_route);
    FileInputStream input = new FileInputStream(origin);
    FileOutputStream output = new FileOutputStream(copy);

    if(copy.isFile() && !replace){

       System.out.println("error, this file already exists, try again");
    }

    if(copy.isDirectory()){

        copy = new File(copy.getAbsolutePath()+"/"+origin.getName());

        if(copy.isFile() && !replace){

            System.out.println("error, this file exists, try again");
        }
    }

    try{

          byte[] b = new byte[1024];
          int n_bytes = 0;

           while( (n_bytes = input.read(b)) != -1 ){
                output.write(b, 0, n_bytes);
           }

        input.close();
        output.close();
 
    }catch(FileNotFoundException fnfE){

        throw new FileNotFoundException("error, cannot open file: " + fnfE);
    }catch(IOException ioE){

        System.out.println("Error while copying file: " + ioE);
    }
}

public static void main(String[] args){

    String source_file = "/home/vndos/Desktop/76_Copy_file/dir1/binary.dat";

    String destiny_route = "/home/vndos/Desktop/76_Copy_file/dir2/binary.dat";

    boolean replace = true;

    Copy_file obj = new Copy_file();

    try{

        obj.copy_file(source_file, destiny_route, replace);
    }catch(Exception e){

        System.out.println("an error has occurred, try again");
    }
}

}


