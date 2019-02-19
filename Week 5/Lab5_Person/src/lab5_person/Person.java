
package lab5_person;

/**
 *
 * @author dizhe
 */
public class Person {
    private String name;//name
    private int age;//age of person
    private String address;// a city: Suzhou or London
    private String type;
    
    //constructor
    public Person(String name,int age, String address){
    this.name = name;
    this.age = age;
    this.address = address;
    System.out.println("Name : "+ name+", age : "+ age + ",address : "+ address);
}
    public Person(String name,String type,int age){
    this.name = name;
    this.type = type;
    this.age = age;
    System.out.println("Person called " + name +" created with ID: "+ type +
            " age:"+age);
    }
    //method
    public void Birthday(int age){
    System.out.println("Happy birthday,"+ name + "! You were " + (age-1)+
            " , but you are "+ age + ".");
    this.age = age+1;
    }
    public void ChangeName(String name2){
    name = name2;
    System.out.println("Your new name is " + name);
    }
    public void setName(String name3){
    name = name3;
    }
    public String getName(){
        return name;
    }
    
    public void setAge(int age){
    this.age = age;
    
    }
    public String getID(){
        return type;
    }
    
    
//    public static void LowID(ArrayList<Person> persons){
//        double lowestValue = 10000000; // Start off with a highest value of 0
//        int indexOflowestValue = 0; // Create a variable for index value  
//        // Loop through array
//        for (int i = 0; i < persons.size(); i++) {
//        if (Integer.parseInt(persons.get(i).getID()) < lowestValue) {
//            lowestValue = Integer.parseInt(persons.get(i).getID());
//            indexOflowestValue = i;
//        }
//        System.out.println("The lowest ID number is "+ indexOflowestValue);
//        for (int j = 0; j< persons.size();j++){//do not use i again
//            if(Integer.parseInt(persons.get(i).getID()) == indexOflowestValue){
//            System.out.println(persons.get(i).getName() + " has the lowest ID.");
//            }
//        }
//}
//    }
    @Override
    public String toString() {
    return "ToString details:"+"\n"+"Person name is "+ name + "\n" + "Person type is "+
            type + "\n"+"Person age is "+ age;
}
    /*
    object 中的 toString() 源码
    public String toString() {
    return getClass().getName() + "@" + Integer.toHexString(hashCode());
}
*/
}
