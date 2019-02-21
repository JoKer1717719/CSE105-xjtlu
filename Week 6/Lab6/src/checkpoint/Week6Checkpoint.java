/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkpoint;

/**
 *
 * @author Administrator
 */
public class Week6Checkpoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //use the methods in the Student class, but you can also use the
        //methods in the Person class
        Student student1 = new Student("Ting",22,"Computing Science", 123,"ICT",2);
        System.out.println(student1.getName());
        student1.setName("Joy");
        System.out.println(student1.getName());
        student1.ChangeName("Jill");
        System.out.println(student1.getName());
        student1.Birthday(22);
        //Use your getter methods to get the age and major of your new student and display them
        System.out.println("#######");
        System.out.println("Person called " + student1.getName() + " created");
        student1.Birthday(22);
        System.out.println("Major is "+ student1.getMajor());
        
    }
    
    
}
