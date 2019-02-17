

/**
 *
 * @author dizhe
 */
public class Dice {
    
public static void main(String[] args) {

   int[] dice = new int[4];    
   for(int i = 0; i<dice.length; i++){
      dice[i] = getDice();
      System.out.println("Result is " + dice[i]);
   }
}


public static int getDice() {
    
   double rand = (Math.random() * 6);
   int r = (int) rand;
   return r;
}

    
}