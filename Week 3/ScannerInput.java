

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class ScannerInput {
    public static void main(String[] args){
        //Introduction to the Scanner
//        Scanner keyboard = new Scanner(System.in);
//        System.out.println("What is your name?");
//        String next = keyboard.nextLine();//if input is "Andrew Abel", you should use .nextLine(); while "Andrew", .next() is fine.
//        System.out.println("Your input was " + next);
        String next = TakeString();
        System.out.println("I'm "+ next);
        
    }
    public static String TakeString(){
        Scanner kb = new Scanner(System.in);
        System.out.println("what is your name?");
        String next = kb.next();
        return next;
    }
    
}
