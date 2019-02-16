/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2;

/**
 *
 * @author Administrator
 */
public class Hw2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Area of a Circle
        double R = 3.0;
        //double R = 7.0
        double a = Math.PI*R*R;
        System.out.println("The radius is "+ R);
        System.out.println("The area is "+ a);
        
        if(a>50){
            System.out.println("It is a small circle");
    }
        else{
            System.out.println("It is a large circle");
    }
        
        //Gender switches with Booleans
        String yourName = "DiZhen";
        int age = 19;
        int studNum = 1717719;
        String gender = "Female";
        System.out.println("Name: "+ yourName +", Age: " +age + ",Student number: " + studNum);
        String job = "lecturer";
        String depar = "CS";
        if(gender == "Female"){
            System.out.println("Her name is " + yourName+",and she is a " + job +"in " + depar);
        }
        else{
            System.out.println("His name is " + yourName+",and he is a " + job +"in " + depar);
        }
        
        //Days of The Week - Multiple Condition If statements
        String weather = "Sunny";
        String weather1 = "Sunny";
        String weather2 = "rainny";
        String mum = "out";
        String mum1 = "out"; 
        String dad = "in";
        String dad1 = "in";
        //if it is string,  you should use .equals(), but ==
        // if it is int or double, you can use == !=
        if((weather.equals(weather1)) &&(mum.equals(mum1))) {
            System.out.println("I will go to the park");
        }
        else if((weather.equals(weather2)) &&(dad.equals(dad1))) {
            System.out.println("I will do my homework");
        } 
        else {
            System.out.println("stay at home");
        }
        
        
    }
    
    
    
}
