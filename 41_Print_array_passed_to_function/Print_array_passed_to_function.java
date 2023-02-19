public class Print_array_passed_to_function{

    public String print(int arr[]){

        for(int el: arr){

            System.out.println(el);
        }

        for(int el: arr){

            System.out.printf("%d,", el);
        }
        
        String ret = "";

        for(int el: arr){

            ret += el;
        }

        System.out.println();
        return ret;
    }

    public String complete_arr(int arr[]){

        int i = 0;

        for(int el: arr){

            arr[i] = i;
            i++;
        }

        String ret = "";

        for(int el: arr){

            ret += el;
        }

        System.out.println();
        return ret;
    }    

    public static void main(String[] args){
        
        int arr[] = {1,2,3,4,5,6,7,8,9};
        Print_array_passed_to_function obj = new Print_array_passed_to_function();

        System.out.println(obj.print(arr));

        System.out.println(obj.complete_arr(arr));
    }
}
