public class Main{

    public static void main(String[] args){
    
        int a = 5, b = 6, c = 8, d = 9, e = 7, f = 4;
        float p = 0;
        float y = 0, x = 0;
        
        for(int n = 0; n < 10e7; n++){
            
            if((3 - (2 * p)) == ((6 - (5 * p))/4)){
            
                y = p;
                x = 3 - (2 * y);
            }
        
            p += 0.000001;
        }
        
        System.out.println("x: " + x + "\ny: " + y);
    }
}

/*

ax+by=c
dx+ey=f

*/
