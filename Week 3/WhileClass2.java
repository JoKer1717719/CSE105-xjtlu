

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class WhileClass2 {
    static int total = 0;
    static int time = 0;
    public static void main(String[] args){
        //While Loops â€? Variable handling
        while(total < 100){
            Scanner kb = new Scanner(System.in);
            System.out.println("Input next value");
            int next = kb.nextInt();
            total = total + next;
            System.out.println("New total is " + total);
            time = time + 1;
        }
        System.out.println("Final total is " + total);
        System.out.println("Numbers of numbers input is " + time);
    }
    
}
