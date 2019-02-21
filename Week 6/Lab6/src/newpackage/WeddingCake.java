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
public class WeddingCake extends Week6Cake{
    private final int tiers;
    private final String inscription;
    private final String flowerColours;

    public WeddingCake(int tiers, 
            String inscription, 
            String flowerColours, 
            String flavour, 
            int slices, 
            String colour) {
        super(flavour, slices, colour, 0);
        this.tiers = tiers;
        this.inscription = inscription;
        this.flowerColours = flowerColours;
        System.out.println("WeddingCake constructed: tiers = "+tiers+" inscription = "
                +inscription+ " flowercolours = "+flowerColours+ " flavours = "+ flavour + " slices  = "+ slices + "colour = "+ colour);
    }

    public WeddingCake(int tiers, String inscription, String flowerColours,String flavour, int slices,String colour, int candles){
        super(flavour,slices,colour,candles);//must have super() in contructor.
        this.tiers = tiers;
        this.inscription = inscription;
        this.flowerColours = flowerColours;
        System.out.println("WeddingCake constructed: tiers = "+tiers+" inscription = "+inscription+ " flowercolours = "+ flowerColours );
    }
    public int getTiers() {
        return tiers;
    }

    public String getInscription() {
        return inscription;
    }

    public String getFlowerColours() {
        return flowerColours;
    }     
}
