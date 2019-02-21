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

}
