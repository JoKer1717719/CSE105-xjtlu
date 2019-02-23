package cw2;


import java.util.ArrayList;


public class ValidationTaskExample {
    static boolean valid = true;
    static ArrayList<String> names = new ArrayList<String>();
    public static void main(String[] args) {
        /*here, you must have one String for each possible error.
        As you write the test functions in the validateString method,
        test them from here.
        When you have finished, you should have a load of test Strings (16 or more?)
        and test every possible error. For each test, print out what you are testing
        and what the result is to the console
        */
        String object1 = "ISBN 988-0-273-72131-4";
        String object2 = "ISBN 988-0-273-72131-44";
        String object3 = "SSBN 988-0-273-72131-44";
        String object4 = "ISBN-988-0-273-72131-4";
        String object5 = "ISBN 988-0-273-72131-4";
        String object6 = "ISBN 98800-273-72131-4";
        String object7 = "ISBN 988-00273-72131-4";
        String object8 = "ISBN 988-0-273072131-4";
        String object9 = "ISBN 988-0-273-7213104";
        String object10 = "ISBN 9a8-0-273-7213104";
        String object11 = "ISBN 988-a-273-7213104";
        String object12 = "ISBN 988-0-a73-7213104";
        String object13 = "ISBN 988-0-273-72a3104";
        
        //System.out.println(name.substring(5,22));
        validateString(object1);
        validateString(object2);
        validateString(object3);
        validateString(object4);
        validateString(object5);
        validateString(object6);
        validateString(object7);
        validateString(object8);
        validateString(object9);
        validateString(object10);
        validateString(object11);
        validateString(object12);
        validateString(object13);
        
        

    }

    public static boolean validateString(String input) {       

        // Add validation checking here
        //Be 22 characters in length 
        if(input.startsWith("ISBN")){
        valid = false;
        System.out.println(input+"\n"+"It does not start with ISBN. "+ valid);
        }
        
        
        if(input.length() != 22){
            valid = false;
            //System.out.println("==============");
            System.out.println(input+"\n"+"Length is wrong. "+ valid);
            System.out.println("==============");
            return valid;

        }
        
       
        //Begin with â€œISBNâ€? (lower case and upper case are both fine.)
        if(!input.substring(0,4).equalsIgnoreCase("ISBN")){
            valid = false;
            System.out.println(input+"\n"+"It does not start with ISBN. "+ valid); 
            System.out.println("==============");
            
            return valid;
            
        }
        //One space â€? â€? after â€œISBNâ€?
        if(input.charAt(4) != ' '){//use  single '' but not double""
            valid = false;
            System.out.println(input+"\n"+"There is no space. "+ valid);
            System.out.println("==============");
            return valid;
        }
        
        //The highlighted positions have to be â€?-â€?
        if(input.charAt(8) != '-'){
            valid = false;
            System.out.println(input+"\n"+"The  first slash is wrong. "+ valid);
            System.out.println("==============");
            return valid;

        }
        if(input.charAt(10) != '-'){
            valid = false;
            System.out.println(input+"\n"+"The second slash is wrong. "+ valid);
            System.out.println("==============");
            return valid;

        }
        if(input.charAt(14) != '-'){
            valid = false;
            System.out.println(input+"\n"+"The third slash is wrong. "+ valid);
            System.out.println("==============");
            return valid;

        }
        if(input.charAt(20) != '-'){
            valid = false;
            System.out.println(input+"\n"+"The fourth slash is wrong. "+ valid);
            System.out.println("==============");
            return valid;
        }
        

        
        
        //isNum(str1);
        //isNumArray(string);

        
        //Contain only digits (0 to 9) and â€?-â€?.
        String subinput = input.substring(5,22);
        String[] array = subinput.split("-");
        int counter = 0;
        
        for(int i = 0; i<array[0].length();i++){
            counter++;
            if (!Character.isDigit(array[0].charAt(i))){
            valid = false;
            System.out.println("The first group is not all digit ."+"The number "+
                    counter +" char is not digit."+"\n"+ valid);
            System.out.println("==============");
            return valid;
        }
        }
            
        counter = 0;
        for(int j = 0; j<array[1].length();j++){
            counter++;
            if (!Character.isDigit(array[1].charAt(j))){
            valid = false;
            System.out.println("The second group is not all digit ."+"The number "+
                    counter +" char is not digit."+"\n"+ valid);
            System.out.println("==============");
            return valid;
        }
        }
        
        
        counter = 0;
        for(int t = 0; t<array[2].length();t++){
            counter++;
            if (!Character.isDigit(array[2].charAt(t))){
            valid = false;
            System.out.println("The third group is not all digit ."+"The number "+
                    counter +" char is not digit."+"\n"+ valid);
            System.out.println("==============");
            return valid;
        }
        }
        
        counter = 0;
        for(int k = 0; k<array[3].length();k++){
            counter++;
            if (!Character.isDigit(array[3].charAt(k))){
            valid = false;
            System.out.println("The fourth group is not all digit ."+"The number "+
                    counter +" char is not digit."+"\n"+ valid);
            System.out.println("==============");
            return valid;
            }   
        }


        for(int l = 0; l<array[4].length();l++){
            counter++;
            if (!Character.isDigit(array[4].charAt(l))){
            valid = false;
            System.out.println("The fifth group is not all digit ."+"The number "+
                    counter +" char is not digit."+"\n"+ valid);
            System.out.println("==============");
            return valid;
            
        }
        }

        
        
        
        
        
        

//        
//        System.out.println(input.charAt(8));
        //The highlighted positions have to be â€?-â€?
        

//        if(input.charAt(8) == '-'){
//            return false;
//        }
//        
          System.out.println(input);
          System.out.println("This is true. "+ valid);
          System.out.println("==============");
          return valid;
          

}
    
    //test if the samples you substringed are digits.
    public static boolean isNum(String str){
        for (int i= 0;i < str.length();i++){
           if (!Character.isDigit(str.charAt(i))){
                valid = false;
           }
        }
        return valid;
    }
    
    public static boolean isNumArray(ArrayList<String> string){
        
        for(int  i = 0; i< string.size();i++){
            String str = string.get(i);
            
            for (int j= 0;j < str.length();j++){
            if (!Character.isDigit(str.charAt(j))){
                valid = false;
                System.out.println("The digit is wrong. "+ valid);
                
           }
        }
        }
        
         return valid;
        
    }
    
}
