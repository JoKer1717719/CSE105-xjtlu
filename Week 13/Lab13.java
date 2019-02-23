
package lab13;

/**
 *
 * @author dizhe
 */
public class Lab13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Recursion - Factorial
        int input = 1;
        int output = Factorial(input);
        System.out.println("The result is : "+output);
        
        //Student Money 
        int output2 = StudentMoney(input);
        System.out.println("The result is : "+output2);
        
        //Richer student
//        int output3 = richerStudent(input);
//        System.out.println("The result is : "+ output3);
//        
          int output4 = richerStudent1(input);
        System.out.println("The result is : "+ output4);
        
    }
    
    //Recursion - Factorial
    public static int Factorial(int n){
        if(n == 0){
            return 1;
        }
        int result = n*Factorial(n-1);
        return result;
    }
    
    public static int Factorial1(int n){
        if(n == 0){
            return 1;
        }else{
            return n*Factorial1(n-1);
        }
    }
    //Student Money
    public static int StudentMoney(int n){
        if(n == 0){
            return 0;
        }
        int aggre = 7 + StudentMoney(n-1);
        return aggre;
    }
    
    public static int StudentMoney1(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 7;
        }
        return 7 + StudentMoney(n-1);
    }
    
    //Richer student
//    public static int richerStudent(int n){     /*wrong code: 1 % 3 = 1 */
//        int n1 = 7;
//        int n2 = 11;
//        int aggre;
//        if(n == 0){
//            return 0;
//        }
//        if(n % 3 == 0){//n mod 3
//            aggre = n1 + StudentMoney(n-1);
//        }else{
//            aggre = n2 + StudentMoney(n-1);
//        }
//        return aggre;
//    }
    
    public static int richerStudent1(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 7;
        }
        
        if (n % 3 == 0){
            return 11 + richerStudent1(n - 1);
        }else{
            return 7 + richerStudent1(n-1);
        }
    }
    
    
    public static String christmasComing(String str){
        if(str.length()==0){
            return "";
        }
        if(str.length()==1){
            if(str.equals("s")){
                return "Santa";
            }else{
                return str;
            }
        }
        return christmasComing(str.substring(0,1)) + christmasComing(str.substring(1,str.length()));
    }
    
}
