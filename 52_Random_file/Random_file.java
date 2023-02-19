import java.io.*;

public class Random_file{

    public static void main(String[] args){

        char c;
        boolean end_file = false;
        RandomAccessFile file = null;

        try{

            file = new RandomAccessFile("test.txt", "rw");
            System.out.println("The Size is: " + file.length());
            do{

                try{

                    c = (char)file.readByte();
                    if(c == 'b'){

                        file.seek(file.getFilePointer()-1);
                        file.writeByte(Character.toUpperCase(c));
                    }

                }catch(EOFException e){

                    end_file = true;
                    file.close();
                    System.out.println("all b letters were converted to Upper");
                }
            }while(!end_file);
        }catch(FileNotFoundException e){

            System.out.println("file not found");
        }catch(IOException e){

            System.out.println("an error occured");
        }
    }
}
