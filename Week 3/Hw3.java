

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Hw3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //HW Extending your Existing Programs
        Scanner kb = new Scanner(System.in);
        System.out.println("Input Name");
        String Name = kb.next();
        System.out.println("Input Job");
        String Job = kb.next();
        System.out.println("Input School");
        String School = kb.next();//if .next change to .nextLine, why can't input?
        System.out.println("Input Hometown");
        String Hometown = kb.next();

        String female = "female";
        String male = "male";
        boolean GenderCorrect = Female(female);
        System.out.println(GenderCorrect);
        System.out.println("Hello "+ Name);

        if (GenderCorrect == true){
            System.out.println("Her name is "+ Name+", and she is a "+ Job);
        }
        else{
            System.out.println("His name is "+ Name + ", and he is a "+ Job);
        }
        
        System.out.println("Name: "+ Name + ", School: "+ School+",Hometown: "+Hometown);
        
    }
    public static boolean Female(String gender){
        Scanner kb = new Scanner(System.in);
        System.out.println("female? True or false?");
        String gend = kb.next();
        if(gend.equals(gender)){
            return true;
        }
        else{
            return false;
        }
    } 
    
}
