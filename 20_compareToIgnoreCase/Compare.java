public class Compare{

    //comparetoignorecase returns 0 when are the same words
    int comp(String a, String b){
        return a.compareToIgnoreCase(b);
    }

    public static void main(String[] args){
        String a = "Word";
        String b = "WoRd";

        Compare cmp = new Compare();

        

        System.out.println((cmp.comp(a, b) == 0 ? a + " and " + b + " are the same word." : a + " and " + b + " are not the same word."));
    }
}
