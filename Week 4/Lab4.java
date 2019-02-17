

/**
 *
 * @author dizhe
 */
public class Lab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ShowSquares
        int out;
        int outsq;
        for (int i = 0; i <=10 ; i++){
            out = i;
            outsq = i*i;//Math.pow(i,2);
            System.out.println(out + " " + outsq);
        }
        //use a method
        ShowSquares();
        //
        //ShowExpend()
        int outcu;
        for (int i = 0; i <=10 ; i++){
            out = i;
            outsq = i*i;//Math.pow(i,2);
            outcu = i*i*i;
            System.out.println("Number: "+out + ", square: " + outsq + ", Cube: "+outcu);
        }
        //use a method
        Showexpend();
        //
        //democrate the display
        
        //use a method
        System.out.println("CSE105 Cousework");
        Showexpenddeco();
        System.out.println("Name : Di Zhen; ID: 1717719");
        //
        //
        //
        
    }
    public static void ShowSquares(){
        int out;
        int outsq;
        for (int i = 0; i <=10 ; i++){
            out = i;
            outsq = i*i;//Math.pow(i,2);
            System.out.println(out + " " + outsq);
        }
    }
    public static void Showexpend(){
        int out;
        int outsq;
        int outcu;
        for (int i = 0; i <=10 ; i++){
            out = i;
            outsq = i*i;//Math.pow(i,2);
            outcu = i*i*i;
            System.out.println("Number: "+out + ", square: " + outsq + ", Cube: "+outcu);
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        }
    }
    
    //democrate the display
    public static void Showexpenddeco(){
        int out;
        int outsq;
        int outcu;
        for (int i = 0; i <=10 ; i++){
            out = i;
            outsq = i*i;//Math.pow(i,2);
            outcu = i*i*i;
            displayMessage("Number: "+out + ", square: " + outsq + ", Cube: "+outcu);
            
        }
    }
    
    
    public static void displayMessage(String display) {
        System.out.println("*****************");
        System.out.println(display);
        System.out.println("*****************");
    }
    
}
