
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Password {
    static String next;// set your Scanner variable to be a global variable
    
    public static void main(String[] args){//main is a method that do the methods
        //Methods
        //String next = TakeString();//call it from your main class, with no output
        next = Password();//next need assign the value first
        String solu = "1717719";
        while(next.contains(solu) == false){
            next = Password();
         }
    }
    // create a method in your ScannerInput class that will take a string from the scanner
    public static String Password(){
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a password");
        String next = kb.next();
        return next;
    }
    
}
