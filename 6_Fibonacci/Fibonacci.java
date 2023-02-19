public class Fibonacci{

    public void print_number(int limit){
        int last = 1, pre_last = 1, result = 1;

        for(int n = 1; n < limit; n++){
            result = last + pre_last;
            pre_last = last;
            last = result;
        }

        System.out.println(result);        
    }

    public static void main(String[] args){
        Fibonacci ser = new Fibonacci();
        
        for(int u = 1; u < 10; u++){
            ser.print_number(u);
        }
    }
}
