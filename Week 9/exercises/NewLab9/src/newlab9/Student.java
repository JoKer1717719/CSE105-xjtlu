
package newlab9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dizhe
 */
public class Student extends Person {
    private final String major;
    private final int yearOfStudy;
    public Student(String name,int age,String department,int type,String major,int yearOfStudy){
        super(name,age,department,type);
        this.major = major;
        this.yearOfStudy = yearOfStudy;

}
    public String getMajor(){
        return major;
    }
    public static void getString(ArrayList<Student> myStudent){
        for(Student im:myStudent){
            System.out.println(im.toString());
            
        }
        
    }
    public static void  renameStudent(ArrayList<Student> myStudent){
        Scanner kb = new Scanner(System.in);
        System.out.println("Input a new name for Ting");
       
        for (int i = 0; i<myStudent.size();i++){
            if(myStudent.get(i).getName().contains("Ting")){
            System.out.println(myStudent.get(i).getName().replace("Ting", "Jenny"));
            System.out.println("You have changed the name.");
            }else{
            System.out.println("There is no change.");
            }
        }
        
        
        

    }
        
        
        
    }
    



