public class Ex_arrays{
    public static void main(String[] args){

        int arr_dig1[] = {0,1,2,3,4,5,6,7,8,9};
    
        int arr_dig2[] = {9,8,7,6,5,4,3,2,1,0};

        char arr_ch1[] = {'a', 'e', 'i', 'o', 'u'};
        char arr_ch2[] = {'a', 'b', 'c', 'd', 'e'};

        String cad_ch1 = "ah OK ";
        String str_ch1a = new String(arr_ch1);

        for(int i = 0; i < arr_ch1.length; i++){
            cad_ch1 += str_ch1a.charAt(i);
        }

        String cad_ch2 = "";
        String str_ch2a = new String(arr_ch2);

        for(int i = 0; i < arr_ch2.length; i++){
            cad_ch2 += str_ch2a.charAt(i);
        }

        for(int i = 0; i < arr_ch1.length; i++){
            System.out.println("vocal: " + arr_ch1[i] + " abc: " + arr_ch2[i]);
        }

        String inter = "";
        String str_ch1 = new String(arr_ch1);
        String str_ch2 = new String(arr_ch2);

        for(int i = 0; i < arr_ch1.length; i++){
            inter += str_ch1.charAt(i);
            inter += str_ch2.charAt(i);
        }

        System.out.println(inter);

        for(int i = 0; i < arr_dig1.length; i++){
            System.out.println(arr_dig1[i] + arr_dig2[i]);
        }
    }
}
