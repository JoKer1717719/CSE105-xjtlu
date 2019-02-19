
/**
 *
 * @author dizhe
 */
public class HW5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        pyramid(6);
    }
    public static void pyramid(int side){
        for(int i = 1;i<= side;i++){
            for(int l = i;l < side;l++){
                System.out.print(" ");
            }
            
            for(int j = i; j>=1;j--){
            System.out.print(j);
            }
            for (int k = 1;k< i;k++){
            System.out.print(k+1);
            }
            System.out.println();
            
        }
    }
    
}
