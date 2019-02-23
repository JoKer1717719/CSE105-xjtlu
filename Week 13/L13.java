
package L13;

/**
 *
 * @author dizhe
 */
public class L13 {
    static int count;
    static long[] fibArray = new long[20];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //factoral
        int x = 4;
        int f = factorial(x);
        System.out.println(f);
        
        int n =4;
        int result = factorial_recursive(n);
        System.out.println(result);
        System.out.println("This method has been called "+count+" time(s)");
        
        //fibonacci
        int x1 = 9;
        int f1 = fibonacci(x1);
        System.out.println("x = " + x1 + " , fibonacci = " + f1);

        long result0 = fibonacci0(x1);
        System.out.println("fib(9)= " + +result0);
        System.out.println("method called " + count + " time(s).");
        
        //store some values to make it simple
        fibArray[0] = 1;
        fibArray[1] = 1;
        for(long fib:fibArray){
            System.out.print(fib+" ");
        }
        System.out.println();
        
        long result2 = fibonacci1(9);
        System.out.println("fib(9) = "+ result2);
        for(long fib:fibArray){
            System.out.print(fib + " ");
        }
        System.out.println();
        System.out.println("method called "+ count+ " time(s).");

        
    }
    
    //factoral
     private static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
     
     //factorial
     private static int factorial_recursive(int n){
         count++;
         System.out.println("Start calculating factorial: "+n+"!");
         if ( n == 0 ){
             System.out.println("Finished calculating factorial:"+n+"!");
             return 1;
         }else{
             int result = n* factorial_recursive(n-1);
             System.out.println("Finished calculating factorial:"+n+"!");
             return result;
         }
         
     }
     
     //Fibonacci
     private static int fibonacci(int n) {
        System.out.println("Call to fibonacci: n = " + n);
        if (n == 0) {
           return 0;
        }
        if (n == 1) {
           return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
     
    private static int fibonacci0(int n) {
	count ++;
        if (n == 0) {
            return 0;
        }else if (n == 1) {
            return 1;
        }
        return fibonacci0(n - 1) + fibonacci0(n - 2);
    }
    
    //store into the array
    public static long fibonacci1(int n) {
        count ++;
        int index = n - 1;
        if (fibArray[index] > 0) {                                               /*Question*/
            return fibArray[index];
        }
        long result = fibonacci(n - 1) + fibonacci(n - 2);
        fibArray[index] = result;
        return result;
    }

    public static int inDirect(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + buddy(n - 1);
        }
    }

    public static int buddy(int x) {
        return inDirect(x);
    }
    
}
