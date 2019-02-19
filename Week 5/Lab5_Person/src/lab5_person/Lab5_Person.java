
package lab5_person;

import java.util.Scanner;

/**
 *
 * @author dizhe
 */
public class Lab5_Person {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Person Jenny = new Person("Jenny", 19, "Qingdao");
//        Person Jack = new Person("Jack","1717719");
        //
        Person[] persons = new Person[3];
        persons[0] = new Person("person1","1717719",11);
        persons[1] = new Person("person2","1818819",12);
        persons[2] = new Person("person3","1919919",13);
        //
//        Jenny.Birthday(18);
//        Jack.Birthday(19);
//        Jenny.ChangeName("Joy");
//        Jenny.Birthday(18);//Joy.Birthday(18) won't work
//        System.out.println(Jenny.toString());
        System.out.println(persons.length);//length is 3 but index is 0 1 2 
        
        Scanner kb = new Scanner(System.in);
        for(int i = 0; i<persons.length;i++){//there should be < but not <=
            System.out.println(persons[i].toString());//though toString has return we should print it out
            persons[i].setAge(Integer.parseInt(kb.next())); 
            System.out.println(persons[i].toString());
        }
        
        LowID(persons);
    }

    public static void LowID(Person[] persons){
        double lowestValue = 10000000; // Start off with a highest value of 0
        int indexOflowestValue = 0; // Create a variable for index value  
        // Loop through array
        for (int i = 0; i < persons.length; i++) {
        if (Integer.parseInt(persons[i].getID()) < lowestValue) {
            lowestValue = Integer.parseInt(persons[i].getID());
            indexOflowestValue = i;
        }
        System.out.println("The lowest ID number is "+ persons[indexOflowestValue]);
        System.out.println(persons[indexOflowestValue].getName() + " has the lowest ID.");
}
    }
        
    
}
