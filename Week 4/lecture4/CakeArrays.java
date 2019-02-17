

/**
 *
 * @author dizhe
 */
public class CakeArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String[] cakeColour = new String[3];
        String[] cakeType = new String[3];
        int[] candlesNumber = new int[3];
        int[] numSlices = new int[3];
        boolean[] candlesLit = new boolean[3];
        double[] cost = new double[3];

// Create 3 cakes
// First cake is a green cake
        cakeColour[0] = "Green";
        cakeType[0] = "Sponge";
        candlesNumber[0] = 6;
        numSlices[0] = 6;
        candlesLit[0] = false;
        cost[0] = 12.6;

// Second cake is a chocolate cake
        cakeColour[1] = "Brown";
        cakeType[1] = "Chocolate";
        candlesNumber[1] = 12;
        numSlices[1] = 8;
        candlesLit[1] = false;
        cost[1] = 18;

// Third cake is a sans rival cake
        cakeColour[2] = "White";
        cakeType[2] = "Sans Rival";
        candlesNumber[2] = 4;
        numSlices[2] = 5;
        candlesLit[2] = false;
        cost[2] = 8.2;

        // Display details
        displayDetails(cakeColour, cakeType, candlesNumber, candlesLit);//arrays can be displayed in this way

        // get highest cost and display it
        int highest = findHighestCost(cost);
        displayCake(cakeColour[highest], cakeType[highest], candlesNumber[highest], candlesLit[highest], cost[highest]);


    }

    // full version
    public static void displayDetails(String[] cakeColour, String[] cakeType, int[] candlesNumber, boolean[] candlesLit) {
        // Display names of arrays using a for loop
        System.out.println("");
        System.out.println("********** OUTPUT ***************");
        for (int i = 0; i < cakeColour.length; i++) {
            System.out.print(cakeType[i]);
            System.out.print(", colour: ");//print (no ln) directly connect two system.out
            System.out.print(cakeColour[i]);
            System.out.print(", candles: ");
            System.out.print(candlesNumber[i]);
            System.out.print(", lit: ");
            System.out.print(candlesLit[i]);

            System.out.println(".");
            System.out.println("**");
        }
    }

    public static int findHighestCost(double[] cost) {
        // A method to identify the largest indice
        int indice = 0; // largest is set to zero
        double largestCost = 0; // Largest cost is zero
        for (int i = 0; i < cost.length; i++) {
            if (cost[i] > largestCost) {
                // If largest cost
                largestCost = cost[i];
                indice = i;
            }
        }
        return indice;
    }

    // Displays all info for a single cake
    public static void displayCake(String cakeColour, String cakeType, int candlesNumber, Boolean candlesLit, double cost) {
        // Display names of arrays using a for loop
        System.out.println("");
        System.out.println("********** Cake Info ***************");
        System.out.print(cakeType);
        System.out.print(", colour: ");
        System.out.print(cakeColour);
        System.out.print(", candles: ");
        System.out.print(candlesNumber);
        System.out.print(", lit: ");
        System.out.print(candlesLit);
        System.out.print(", cost: ");
        System.out.print(cost);
        System.out.println(".");
    }




}