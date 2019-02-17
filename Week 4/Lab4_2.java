

/**
 *
 * @author dizhe
 */
public class Lab4_2 {
    public static void main(String[] args){
        //Editing your For Loop
        Countforward();
        Countbackward();
        CountbackwardJump();
        CountbackwardJumpJudge();
        System.out.println("_________________________");
        System.out.println("Name : Di zhen, ID: 1717719");
        
    }
    public static void Countforward(){
        int out;
        int outsq;
        int outcu;
        for (int i = 15; i <=20 ; i++){
            out = i;
            outsq = i*i;//Math.pow(i,2);
            outcu = i*i*i;
            displayMessage("Number: "+out + ", square: " + outsq + ", Cube: "+outcu);
        }
    }
        public static void Countbackward(){
        int out;
        int outsq;
        int outcu;
        for (int i = 20; i >=15 ; i--){
            out = i;
            outsq = i*i;//Math.pow(i,2);
            outcu = i*i*i;
            displayMessage("Number: "+out + ", square: " + outsq + ", Cube: "+outcu);
        }
    }
        public static void CountbackwardJump(){
        int out;
        int outsq;
        int outcu;
        for (int i = 20; i >=0 ; i=i-3){
            out = i;
            outsq = i*i;//Math.pow(i,2);
            outcu = i*i*i;
            displayMessage("Number: "+out + ", square: " + outsq + ", Cube: "+outcu);
        }
    }
        public static void CountbackwardJumpJudge(){
        int out;
        int outsq;
        int outcu;
        for (int i = 20; i >=0 ; i=i-3){
            out = i;
            outsq = i*i;//Math.pow(i,2);
            outcu = i*i*i;
            if(out % 2 == 0){
                displayMessage("Number: "+out + ", square: " + outsq + ", Cube: "+outcu);
            }
        }
           
        }
        public static void displayMessage(String display) {
        System.out.println("*****************");
        System.out.println(display);
        //System.out.println("*****************");
    }
    
    
}
