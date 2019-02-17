

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class ScannerInput5 {
    static String next;// set your Scanner variable to be a global variable
    
    public static void main(String[] args){//main is a method that do the methods
        //Methods
        //String next = TakeString();//call it from your main class, with no output
        next = "hi";//global value should be assign then "next" in while() has a meaning.
        String solu = "Stop";
        while(next.equals(solu) == false){
            next = TakeString();
        }
        
    }
    // create a method in your ScannerInput class that will take a string from the scanner
    public static String TakeString(){
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a string");
        String next = kb.next();
        return next;
    }
}
