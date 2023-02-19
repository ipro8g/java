//this show every string element and every 3rd character

public class Array_to_function{

    void show_arr(String[] str){

        for(String item: str){

            System.out.println(item);
            System.out.println(item.charAt(2));
        }
    }

    public static void main(String[] args){
        Array_to_function arr_to_f = new Array_to_function();
        String the_array[] = new String[3];

        the_array[0] = "This";
        the_array[1] = "Is An";
        the_array[2] = "Array";

        arr_to_f.show_arr(the_array);
    }
}
