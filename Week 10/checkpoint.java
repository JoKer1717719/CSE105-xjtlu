
import java.util.ArrayList;
import java.util.Iterator;


public class checkpoint {
    static ArrayList<String> names = new ArrayList<String>();
    public static void main(String[] args) {
        /*
        here, you must have one String for each possible error.
        As you write the test functions in the validateString method,
        test them from here.
        When you have finished, you should have a load of test Strings (16 or more?)
        and test every possible error. For each test, print out what you are testing
        and what the result is to the console
        */

        names.add("Jenny");
        names.add("Penny");
        names.add("Max");
        names.add("Davy");
        names.add("Black");
        
        
        for(int i =0; i<names.size();i++){
            System.out.println(names.get(i));
    }
        System.out.println("=================");
        
        System.out.println(removeName("Max"));
        
        for(int i =0; i<names.size();i++){
            System.out.println(names.get(i));
    }
        System.out.println("=================");

        
        System.out.println(removeName("J"));
        
        for(int i =0; i<names.size();i++){
            System.out.println(names.get(i));
    }
        System.out.println("=================");


    }

    
    public static boolean removeName(String input){
        Iterator iterator = names.iterator(); 
        
        boolean judge =  false;
        while(iterator.hasNext()){
            if(iterator.next().equals(input)){
                iterator.remove();
                judge = true;
                System.out.println("The name has been removed.");
//                break;
            }
        }
        if(judge == false){
            System.out.println("There is no this name.");
        }
        return judge;

    }

}
