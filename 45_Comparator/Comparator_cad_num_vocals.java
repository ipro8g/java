import java.util.*;
import java.io.*;  

public class Comparator_cad_num_vocals implements Comparator<String>{

        private int count_vocals(String cad){

            int num_vocals = 0;
            for(int i = 0; i < cad.length(); i++){

                switch(cad.toUpperCase().charAt(i)){

                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U': num_vocals++;
                              break;
                }
            }
            return num_vocals;
        }

        public int compare(String a, String b){

            return count_vocals(a) - count_vocals(b);
        }

         public static void main(String[] args){

            String[] arr_str = {"printer","chess,item one","items two","item three"};
            Arrays.sort(arr_str, String.CASE_INSENSITIVE_ORDER);
            System.out.println(Arrays.toString(arr_str));

            Arrays.sort(arr_str, new Comparator_cad_len());
            System.out.println(Arrays.toString(arr_str));

            Arrays.sort(arr_str, new Comparator_cad_num_vocals());
            System.out.println(Arrays.toString(arr_str));
       }
}


class Comparator_cad_len implements Comparator<String>{

        public Comparator_cad_len(){}

            public int compare(String a, String b){
                return b.length()-a.length();
            }
        
}


