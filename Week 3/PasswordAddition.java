
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class PasswordAddition {
    static String next;
    public static void main(String[] args){
        next = Password();
        String solu = "17";
        while(next.contains(solu) == false){
            next = Password();
        }
        
        if (next.length()>5){
            String sub = next.substring(next.length()-5);
            System.out.println(sub);
        }
        else{
            System.out.println(next);
        }
        
    }
    
    public static String Password(){
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a password");
        String next = kb.next();
        String getPassword = next;
        return next;//return nothing "return null"
    }
}
