

import java.util.Scanner;

/**
 *
 * @author dizhe
 */
public class Lab4_3 {
    public static void main(String[] args){
        //Nested For Loops
//        int num;
//        int out;
//        int[] a = new int[10];
//        for (int i = 1; i <= 10; i++){
//            num = i;
//            for (int j = 1; j <= 10; j++){
//                out = j * num;
//                a[j-1] = out;
//            }
//            System.out.println(a[0]+"\t"+a[1]+"\t"+a[2]+"\t"+a[3]+"\t"+a[4]+"\t"+
                  //a[5]+"\t"+a[6]+"\t"+a[7]+"\t"+a[8]+"\t"+a[9]);
//        }
        
        //use the method
        //Matrix();
        MatrixH();
        
        
        
    }
    public static void Matrix(){
        int num;
        int out;
        int[] a = new int[10];
        for (int i = 1; i <= 10; i++){
            num = i;
            for (int j = 1; j <= 10; j++){
                out = j * num;
                a[j-1] = out;
            }
            System.out.println(a[0]+"\t"+a[1]+"\t"+a[2]+"\t"+a[3]+"\t"+a[4]+"\t"+
                    a[5]+"\t"+a[6]+"\t"+a[7]+"\t"+a[8]+"\t"+a[9]);
            
        }
    }
    
    //change the argument
    public static void MatrixH(){
        Scanner kb = new Scanner(System.in);
        System.out.println("input a number");
        int input = kb.nextInt();
        
        int num;
        int out;
        
        int[] a = new int[10];//how to change it to remove the last col of 0
        for (int i = 1; i <= input; i++){
            num = i;
            
            for (int j = 1; j <= input; j++){
                out = j * num;
                a[j-1] = out;
                System.out.print(a[j-1] + "\t");
            }
            System.out.println();

            
        }
    }
}
