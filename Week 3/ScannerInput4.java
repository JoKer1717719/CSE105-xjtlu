

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class ScannerInput4 {

    static String password = "1717719";
    public static void main(String[] args){
        //Methods â€? Passwords
            
            Scanner keyboard = new Scanner(System.in);
            System.out.println("add a password");
            String next = keyboard.next();

            while(next.contains(password)==false){

                System.out.println("add a password");
                String next1 = keyboard.next();
                next=next1;
            }
            System.out.println("Stop");
            
            if (next.length()>5){
                System.out.println(next.substring(next.length()-5));
            }
            else{
                System.out.println(next);
            }
         
         
    }       
        }
        
        
        
        
    
    

