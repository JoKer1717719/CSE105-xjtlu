
import java.util.Scanner;

/**
 *
 * @author dizhe
 */
public class Lab4_4 {
    public static void main(String[] args){//main里只做调用函数和设置变量
        
        MatrixH();
    }
    
    public static void MatrixH(){
        int out;
        int num;
        int input;
//        Scanner kb = new Scanner(System.in);
//        System.out.println("input a number");
//        int input = kb.nextInt();
        input = inputInteger();
        
        int[] a = new int[10];//the most is 10 but can less than it
        for (int i = 1; i <= input; i++){
            num = i;
            for (int j = 1; j <= input; j++){
                out = j * num ;
                a[j-1] = out;
                System.out.print(a[j-1]+"\t");
            }
        System.out.println();
            
 
//            
        }

    }
        public static int inputInteger() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int input = kb.nextInt();
        return input;
        }
}