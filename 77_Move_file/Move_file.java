import java.util.*;
import java.io.*;

public class Move_file{

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

    public void move_file(String source, String destiny, boolean replace)throws FileNotFoundException, IOException{

        if(source == null || destiny == null){

            throw new IllegalArgumentException("not valid");
        }

        File source_file = new File(source);
        File destiny_file = new File(destiny);
    
        try{

            copy_file(source_file.getAbsolutePath(), destiny_file.getAbsolutePath(), replace);
            source_file.delete();
        }catch(FileNotFoundException fnfE){

            throw new FileNotFoundException("an error has occurred in file open, try again");
        }catch(IOException ioeE){

            throw new IOException("an error has occurred, this file exists, try again");
        }
    }

    public static void main(String[] args){

        String source_file = "/home/vndos/Desktop/77_Move_file/dir1/binary.dat";

        String destiny_route = "/home/vndos/Desktop/77_Move_file/dir2/binary.dat";

        boolean replace = true;

        Move_file obj = new Move_file();

        try{

            obj.move_file(source_file, destiny_route, replace);
        }catch(Exception e){
            
            System.out.println("an error has occurred, try again");
        }
    }
}
