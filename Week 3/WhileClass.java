

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class WhileClass {
    public static void main(String[] args){
        //while loop introduction
        int countdown = 10;
        while(countdown>0) {
        System.out.println(countdown);
        countdown= countdown-1;
        }
        System.out.println("Go!");
        
        int countdown1 = 1;
        while(countdown1<6) {
            System.out.println(countdown1);
            countdown1= countdown1+1;
        }
        System.out.println("stop");
        
        //
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input integer");
        int next1 = keyboard.nextInt();
        int count = 1; 
        while(count < next1+1){
            System.out.println(count);
            count = count +1;
         }
        System.out.println("stop");
        
    }
    
        
    
    
    
}
