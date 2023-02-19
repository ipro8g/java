public class Arith_exc{
    void divide(int num){
        int a = 10;
        
        try{
            double res = a/num;
            System.out.println("We will divide: " + a + " / " + num + ":\t" + res);
        }catch(ArithmeticException e){

            System.out.println("An error occurred not a typic number");
        }
    }

    public static void main(String[] args){
        Arith_exc arith = new Arith_exc();

        int arr[] = new int[5];
        arr[0] = 5;
        arr[1] = -1;
        arr[2] = 0;
        arr[3] = 3;
        arr[4] = 9;

        for(int num: arr){
            arith.divide(num);
        }
    }
}
