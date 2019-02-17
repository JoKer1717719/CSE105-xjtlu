
import java.util.Scanner;



/**
 *
 * @author Administrator
 */
public class Calculations {
    public static void main(String[] args) {
//        //From Strings to Arithmetic
//        System.out.println("hello");
//        //System.out.println("5 * 7 + 4 - 2 / 2 = 38");
//        int num1 = 5;
//        int num2 = 7;
//        int num3 = 4;
//        int num4 = 2;
//        int result;
//        result = num1 * num2 + num3 - num4 / num4;
//        System.out.println("The result is: " + result );
//        System.out.println(num1 + "*" + num2 + "+" + num3 + "-" + num4 + "/" + num4 + "= " + result );

          //Variable Types and Calculations â€? Ints and Mods
          int num1 = 2;
          int num2 = 3;
          int solution1;
          solution1 = num1 + num2;
          System.out.println("The solution to num1+num2 is " + solution1);
          int solution2 = num1 % num2;//0.6......2
          System.out.println("The solution to num1%num2 is " + solution2);
          
          int num3 = 5;
          int num4 = 7;//variable cannot be repetitively creat
          int solution3;
          solution3 = num3 + num4;
          System.out.println("The solution to num1+num2 is " + solution3);
          int solution4 = num3 % num4;//0.6......2
          System.out.println("The solution to num1%num2 is " + solution4);
          
          
          //Variable Types and Calculations â€? Doubles and Operator Precedence
          double calcVal1 = 4;
          double calcVal2 = 8;
          double calcVal3 = -1;
          double complexCalc1 = 4 +8 * -1 - 4 + 4/8 + -1;
          double complexCalc2 = calcVal1 +calcVal2 * calcVal3 - calcVal1 + calcVal1/calcVal2 + calcVal3;
          System.out.println("The solution to complexCalc1 is  " + complexCalc1);
          System.out.println("The solution to complexCalc2 is  " + complexCalc2);
          
          //Variable Types and Calculations â€? Maths and Randoms
          double pi = Math.PI ;
          System.out.println(pi);
          System.out.println("The value of Pi is "+ Math.PI);
          int num5 = 5;
          double sq = Math.sqrt(num5);
          System.out.println("The value of sqrt 5 is "+ sq);
          
          double randomValue = Math.random()*10;//random number between 0 and 10 and change every time.
          System.out.println("the random value is " + randomValue);
          
          //If Statements
          double numA = 3;
          double numB = 4;
          double addAB = 3*numA + (numB-1);
          System.out.println("The answer should be " + addAB);
          
          if (addAB > 10){
              System.out.println("Greater than 10");
          
          }
          else{
              System.out.println("10 or less");
          
          }
          
          
          //with random numbers
          double rand = Math.random()*100;
          if (rand > 50){
              System.out.println("Greater than 50");
          }
          else{
              System.out.println("50 or less");
          }
          
          //More Calculations
          Scanner keyboard = new Scanner(System.in);
          System.out.println("Input the first number?");
          int next1 = keyboard.nextInt();
          System.out.println("Input the second number?");
          int next2 = keyboard.nextInt();
          int solution = next1 * next2;
          if (solution > 10){
              System.out.println("Greater than 10");
          }
          else{
              System.out.println("10 or less");
          }
          
          //input a radius
          System.out.println("Input a radius");
          double R = keyboard.nextDouble();
          double area = Math.PI*R*R;
          System.out.println("The area is "+ area);
          
}  
}
