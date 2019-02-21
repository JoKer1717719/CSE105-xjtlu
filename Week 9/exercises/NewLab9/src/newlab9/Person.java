
package newlab9;

/**
 *
 * @author dizhe
 */
public class Person {
    private String name;//name
    private int age;//age of person
    private String department;// a city: Suzhou or London
    private int type;
    //constructor
    public Person(String name,int age, String address,int type){
    this.name = name;
    this.age = age;
    this.department = department;
    this.type = type;
    System.out.println("Name : "+ name+", age : "+ age + ",address : "+ address +",ID: "
            + type);
}
    //method
    public void Birthday(int age){
    System.out.println("Happy birthday,"+ name + "! "+ "\n" +"You were " + (age-1)
            +" , but you are "+ age + ".");
    this.age = age+1;
    }
    
    public void ChangeName(String name1){
        this.name = name1;
        System.out.println("Your new name is " + name);
    }
    

    
    public void setName(String name2){
    this.name = name2;
    }
    //if the variable are final, they cannot be changed or given.
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }


    @Override
    public String toString() {
        return "ToString details:"+"\n"+"Person name is "+ name + "\n" + "Person age is "
                + age;
    }
    
    
    /*
    object 中的 toString() 源码
    public String toString() {
    return getClass().getName() + "@" + Integer.toHexString(hashCode());
}
*/
}
