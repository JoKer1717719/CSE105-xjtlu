

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class MethodSecretCode {
    //method-secret code
        public static boolean Secret(int num){
            int input = -1;
            
            while (input <0 || input > 9){
                Scanner kb = new Scanner(System.in);
                System.out.println("Enter a number between 0 and 9");
                input = kb.nextInt();//input is undated
                
            }
            
            if (input < num){
                System.out.println("The number is too low!");
            }
            else if(input > num){
                System.out.println("The number is too high!");
            }
            else{
                System.out.println("You got it!");
            }
            
            return true;
            
    }
        public static void main(String[] args){
            boolean out = Secret(5);
            System.out.println(out);//why print nothing
        }
    }

       
    
    
    

