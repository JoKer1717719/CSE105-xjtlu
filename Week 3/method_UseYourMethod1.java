

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class method_UseYourMethod1 {
    //method-use your method
    public static boolean Secret(int num){// a method that receives an integer and returns a boolean
            int input = -1;
            
            while(input < 0 || input > 9){
                Scanner kb = new Scanner(System.in);
                System.out.println("Enter a number between 0 and 9");
                input = kb.nextInt();//input is undated
            }
            
           if (input != num){
                if (input < num){
                    System.out.println("The number is too low!");
                }
                else if(input > num){
                    System.out.println("The number is too high!");
                }
           return false;
           }
           else{
                return true;
           }
              
    }
    public static void main(String[] args){
        boolean out = Secret(5);
        int time = 1;
        while(out == false){
            out = Secret(5);
            System.out.println(out);
            time +=1;
        } 
        System.out.println("The time is " + time);
        }
    
}
