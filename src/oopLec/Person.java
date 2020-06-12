package oopLec;//package oopLec.oopLec;
import java.util.Scanner;



public class Person {

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

//    public long id; // this would allow us to set an unique id to a person...
//
    private String firstName;
    private String lastName;
//    public int age;
    private String password;
//
    public void setFirstName(String name){
        this.firstName = name;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public void setLastName(String name){
        this.lastName = name;
    }

    public String getLastName(){
        return this.lastName;
    }


//    public void setPassword(String password){
//        this.password = Password.hash(password);
//    }




//    public final String test = "Value"; //final must be directly assigned in the class
//    public int age; // could set age to -1 and when we get back undefined, we will get -1

//
//    instance method
        public String sayHello(){
            return lastName + ", " + firstName + " says hi!";
        }
//
//    public static long worldPop = 7_500_000_000L; //underscores act as commas in this case
//    public String name;
//
//    public static void main(String[] args) {
//        System.out.println(Person.worldPop);
//        Person.worldPop -= 1;
//        System.out.println(worldPop); //this will be different
//
//
//        Person theBestDrummer = new Person();
//        theBestDrummer.name = "Neil Peart";
//        Person.worldPop += 1; //accessing a static prop
//        this also works, but is usually not a good idea
//        re-state: we can refer to a static property through an instantiated object but better to use the static class
//         cannot access a non-static variable name through a class or static context

//        blogpost makes sense to be a class, so with server side logic in java we would need

//    }

}
