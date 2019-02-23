
package lec13.pkg2;

/**
 *
 * @author dizhe
 */
public class Lec13_2 {
    static int count;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        long start = System.nanoTime();
        int res = factorial_iterative(40);
        long end = System.nanoTime();
        long elapsed = end - start;
        System.out.println("Time for iterative: "+ elapsed);
        
        long start1 = System.nanoTime();
        int res1 = factorial_recursive(40);
        long end1 = System.nanoTime();
        long elapsed1 = end1-start1;
        System.out.println("Time for recursive method: "+ elapsed1);
    }
    
         private static int factorial_recursive(int n){
//         count++;
//         System.out.println("Start calculating factorial: "+n+"!");
         if ( n == 0 ){
//             System.out.println("Finished calculating factorial:"+n+"!");
             return 1;
         }else{
             int result = n* factorial_recursive(n-1);
//             System.out.println("Finished calculating factorial:"+n+"!");
             return result;
         }
         
     }
         private static int factorial_iterative(int n ){
             //count++
             int result = 1;
             for(int i = 1;i<=n;i++){
                 result = result+1;
             }
             return result;
         }
         
         
         
    
}
