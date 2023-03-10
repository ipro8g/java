import java.util.HashMap;

public class Main{

    public static HashMap<String, String> numbers = new HashMap<>();

    public static void main(String[] args){
    
        numbers.put("0","0");
        numbers.put("1","1");
        numbers.put("8","8");
        numbers.put("6","9");
        numbers.put("9","6");
    
        int[] arr = {1,35,33,1961,400,9060, 1, 8, 11, 69, 88, 96, 101, 111, 181, 609, 619, 689, 808, 818, 888, 906, 916, 986, 1001, 1111, 1691, 1881, 1961, 6009, 6119, 6699, 6889, 6969, 8008, 8118, 8698, 8888, 8968, 9006, 9116, 9696, 9886, 9966};
        
        for(int n: arr){
        
            check(n);
        }
    }
    
    public static void check(int number){
    
        String n = Integer.toString(number);                 
        char[] str_arr = n.toCharArray();
        int len = n.length();
        
        String ne = "";
        
        for(int a = str_arr.length-1; a >= 0; a--){
        
            if(str_arr[a] == '0' || str_arr[a] == '1' || str_arr[a] == '8' || str_arr[a] == '6' || str_arr[a] == '9'){
        
                ne += numbers.get(String.valueOf(str_arr[a]));
            }
        }
        
        if(!ne.equals("")){
        
            if(Integer.parseInt(ne) == number){
        
                System.out.println(number + " is a strobogrammatic number");
            }
        
        }else{
        
            System.out.println(number + " is not a strobogrammatic number"); 
        }
    }
}
