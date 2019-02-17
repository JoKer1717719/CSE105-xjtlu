

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class ScannerInput2 {
    public static void main(String[] args){
        //Further Use of the Scanner
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the first number?");
        int next1 = keyboard.nextInt();
        
        System.out.println("Input the second number?");
        int next2 = keyboard.nextInt();
        
        int calculation = next1 * next2;
        System.out.println("The calculation is "+ calculation );
        
       
    }
    
}
