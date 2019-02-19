
package javaapplication15;

/**
 *
 * @author dizhe
 */
public class Lecture {
    public static void main(String[] args){
        //To do code application logic here
        
        //Create an array of 3 cakes:
        Cake[] cakes = new Cake[3];
        cakes[0] = new Cake("Green", "Sponge", 6, 6, false, 12.6);
        cakes[1] = new Cake("Brown", "Chocolate", 12, 8, false, 18);
        cakes[2] = new Cake("White", "Sans Rival", 4, 5, false, 8.2);
        for(int i = 0;i<cakes.length;i++){
            cakes[i].cutCake(1);
        }
        //create cake
//        Cake chocolateCake = new Cake("Green", "Sponge", 6, 6, false, 12.6);
//        Cake spongeCake = new Cake("Brown", "Chocolate", 12, 8, false, 18);
//        Cake sansRivalCake = new Cake("White", "Sans Rival", 4, 5, false, 8.2);
//        chocolateCake.cutCake(2);
    }
    
}
