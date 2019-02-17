

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class ScannerInput3 {
    
    static String StringTrue = "stop";
    public static void main(String[] args){
        //method
        String StringInput = "";
        while (StringInput.equals(StringTrue)==false){//.qualsIgnoreCase()
            Scanner kb = new Scanner(System.in);
            System.out.println("give a string");
            String next = kb.next();
            StringInput = next;
        }
        
        
        
    }
    
}
