

import java.util.Scanner;

/**
 *
 * @author dizhe
 */
public class Lab4_5 {
    public static void main(String[] args){
        int[] intArray = new int[5];
        intArray[0] = 27;
        intArray[1] = 26;
        intArray[2] = 25;
        intArray[3] = 24;
        intArray[4] = 23;
        System.out.println(intArray[0]);
        inputNames();

        
    }
    public static void inputNames(){
       String[] PersonDetails=new String[5];
       for (int i = 0; i<=4;i++){
            
            
            Scanner kb = new Scanner(System.in);
            System.out.println("Input a String: ");
            String input = kb.next();
            
            PersonDetails[i] = input;
            System.out.println(PersonDetails[i]);
        }
       System.out.println("Output is: "+ PersonDetails[0]+"\t"+PersonDetails[1]+"\t"+
               PersonDetails[2]+"\t"+PersonDetails[3]+"\t"+PersonDetails[4]+"\t");
       System.out.println("Output is: "+ "\n"+ PersonDetails[0]+"\n"+PersonDetails[1]+
               "\n"+PersonDetails[2]+"\n"+PersonDetails[3]+"\n"+PersonDetails[4]+"\n");

//        PersonDetails[0] = "A";
//        PersonDetails[1] = "B";
//        PersonDetails[2] = "C";
//        PersonDetails[3] = "D";
//        PersonDetails[4] = "E";
  
    }
    
}
