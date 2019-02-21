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
public class Week6Cake {
    private final String flavour;
    private final int slices;
    private final String colour;
    private final int candles;        //0 for no candles!
    
    //the construcor
    public Week6Cake(String flavour, int slices, String colour, int candles) {
        this.flavour = flavour;
        this.slices = slices;
        this.colour = colour;
        this.candles = candles; 
        System.out.println("Week6Cake constructed: flavour = "+ flavour + " slices = "+ slices + " colour = "+ colour + " candles = "+ candles);
    }

    @Override
    public String toString() {
        return "Week6Cake" + "flavour=" + flavour + ", slices=" + slices + ", colour=" + colour + ", candles=" + candles;
    }
    
    public String getFlavour() {
        return flavour;
    }

    public int getSlices() {
        return slices;
    }

    public String getColour() {
        return colour;
    }

    public int getCandles() {
        return candles;
    }
    
    public boolean equals(Week6Cake other){
        if (this.slices != other.slices){
            return false;
        }
        if (this.candles != other.candles){
            return false;
        }
        if (!this.flavour.equals(other.flavour)){
            return false;
        }
        if (!this.colour.equals(other.colour)){
            return false;
        }
        return true;
    }    
}
