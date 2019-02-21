
package newlab9;

import java.util.ArrayList;

/**
 *
 * @author dizhe
 */
public class NewLab9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <Student> myStudent = new ArrayList <Student>(); 
        Student student1 = new Student("Ting",22,"Computing Science", 123,"ICT",2);
        myStudent.add(student1);
        Student student2 = new Student("Jenny",18,"Bioinformatics",1234,"AA",3);
        myStudent.add(student2);
        Student student3 = new Student("Tony",19,"Math",12345,"BB",3);
        myStudent.add(student3);
        
        Student.getString(myStudent);
        
        //Student.renameStudent(myStudent);
        
        
    }
    
}
