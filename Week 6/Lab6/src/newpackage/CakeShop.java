/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author joelewis
 */
public class CakeShop {
    static Week6Cake[] myCakes = new Week6Cake[5];

    public static void main (String[] args){
        Week6Cake weekCake = new Week6Cake("Chocolate",12,"Brown",18);
        myCakes[0] = weekCake;
        Week6Cake weekCake1 = new Week6Cake("Chocolate",12,"Brown",18);
        myCakes[1] = weekCake1;
        //Add an .equals() method to the Week6Cake class. Test it.
        System.out.println(weekCake.equals(weekCake1));
        System.out.println(myCakes[0].equals(myCakes[1]));
        
        // comment out the Week6Cake object, and create a WeddingCake object instead.
        WeddingCake weddingCake = new WeddingCake(1,"John & Susan","PINK","Fruit",64,"white",0);//if the variables belong to week6cake, 
        //it will be call to the week6cake class and use the week6cake constructor, while for the variables belongs to the weddingcake class, 
        //the constructors of weddingcake class will be used.
       
        // Create a WeddingCake, and then create a new CakeCutPlan object
        WeddingCake weddingCake1 = new WeddingCake(1,"John & Susan","PINK","Fruit",64,"white");
        CakeCutPlan ccp = new CakeCutPlan(weddingCake);
        
               
        // create a cutting plan
        //They want the user to input how many slices they need, 
        //and generate a 'slice plan' showing how to cut the cake to get that number of slices.
  
        //System.out.println("Wedding cake colour = "+weddingCake.getColour());
    }
}
