
import java.util.Scanner;

/**
 *
 * @author dizhe
 */
public class Lab4_7 {
    public static void main(String[] args){
        Ave();
    }
    public static void Ave(){
        int[] age = new int[3];
        int[] average = new int[3];
        
        for(int i = 0; i <= 2; i++){
            
            Scanner kb = new Scanner(System.in);
            System.out.println("Input a age: ");
            int ag = kb.nextInt();
            age[i]=ag;
           
        }
        average[0] = (age[0]+age[1]+age[2]) / 3;
        System.out.println("The average of ages is: " + average[0]);
    }
    
}
