
package javaapplication15;

/**
 *
 * @author dizhe
 */
public class Cake {
    //Create class variables for each object
    //Should be private
    private String cakeColour;
    private String cakeType;
    private int candlesNumber;
    private int numSlices;
    private boolean candlesLit;
    private double cost;
    //
    //
    public Cake(String cakeColour, String cakeType,int candlesNumber,int numSlices,
            boolean candlesLit,double cost) {
    this.cakeColour = cakeColour;
    this.cakeType = cakeType;
    this.candlesNumber = candlesNumber;
    this.numSlices = numSlices;
    this.candlesLit = candlesLit;
    this.cost = cost;
    System.out.println(this.cakeColour + " " +this.cakeType +" created.");
    }
    //can be more than one constructor
    public Cake(String cakeType) {
    this.cakeType = cakeType;
    }
    //
    //
    public void cutCake(int slices) {
    // cuts cake into slices
    System.out.println(slices + " slices have been cut.");
    numSlices = numSlices - slices;
    }
    public void lightCandles() {
    // light candles on cake
    if(candlesLit){
        candlesLit = false;
    }else{
        candlesLit = true;
    }
    System.out.println("Candles light is now "+ candlesLit);
    }
    

    //All class detail here
    //A data object with no main class
    

    
}



