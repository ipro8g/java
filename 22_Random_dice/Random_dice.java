//get stats for dice throwing in 1000000 shots

public class Random_dice{
//computes percents
    void get_stats(int total, int c1, int c2, int c3, int c4, int c5, int c6){
        System.out.println("In a total: " + total + " shots, number 1 has: " + (c1 * 100)/total + "% chances");
        System.out.println("In a total: " + total + " shots, number 2 has: " + (c2 * 100)/total + "% chances");
        System.out.println("In a total: " + total + " shots, number 3 has: " + (c3 * 100)/total + "% chances");
        System.out.println("In a total: " + total + " shots, number 4 has: " + (c4 * 100)/total + "% chances");
        System.out.println("In a total: " + total + " shots, number 5 has: " + (c5 * 100)/total + "% chances");
        System.out.println("In a total: " + total + " shots, number 6 has: " + (c6 * 100)/total + "% chances");
    }

//throws the dice
    int shot(){
        int shot;

        do{

        shot  = (int)(Math.random()*10);

        }while(shot < 1 || shot > 6);

        return shot;
    }

    public static void main(String[] args){
        Random_dice dice = new Random_dice();
        int shot;

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;
        int count_else = 0;

        for(int a =0; a < 6; a++){
            shot = dice.shot();

            switch(shot){
            case 1:
            count1++;
            break;

            case 2:
            count2++;
            break;
    
            case 3:
            count3++;
            break;

            case 4:
            count4++;
            break;

            case 5:
            count5++;
            break;

            case 6:
            count6++;
            break;
            }            
        }
        
        int total_shots = count1 + count2 + count3 + count4 + count5 + count6;

        dice.get_stats(total_shots, count1, count2, count3, count4, count5, count6);
    }
}
