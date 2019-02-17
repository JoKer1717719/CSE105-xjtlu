
import java.util.Scanner;

/**
 *
 * @author dizhe
 */
public class Lab4_6 {
    public static void main(String[] args){
        Input();    
    }
    public static void Input(){
            int[] age = new int[3];
            int[] ID = new int[3];
            String[] major = new String[3];
            String[] name = new String[3];
            
            for (int i = 0; i<=2; i++){
            
            Scanner kb = new Scanner(System.in);
            
            System.out.print("Input name: ");
            String out0 = kb.nextLine();//string can be next line;
            name[i] = out0;
            
            System.out.print("Input age : ");
            String out1 = kb.nextLine();//string can be next line;
            age[i] = Integer.parseInt(out1);//String to int
            
            System.out.print("Input ID : ");
            String out2 = kb.nextLine();//string can be next line
            ID[i] = Integer.parseInt(out2);
           
            System.out.print("Input major : ");
            String out3 = kb.nextLine();//string can be next line
            major[i] = out3;

            }
            System.out.println("**OUT PUT**");
            for (int i = 0;i<=2;i++){
            System.out.println(name[i]+",age : "+ age[i]+", Student ID: " + ID[i] 
                    + ", major : " + major[i]+".");
            System.out.println("**");
            } 
    }
    
}
