import java.util.Arrays;

public class Person { // This allows us to encapsulate our data so that one place is responsible for all related code
    private String name; // restricted visible property/object

    public static String[] peopleCopy(String[] array, String person){
        String[] newCopy = Arrays.copyOf(array, array.length + 1);
        newCopy[newCopy.length - 1] = person;
        return newCopy;
    }

    public Person(String name){
        this.name = name; // here we're just assigning the property directly
//        setName(name); // this would transform to uppercase as per the setter method
    }


    public String getName(){  //getter method getters get values
//TODO: return the person's name
        return this.name;  // we can leave off "this" if there isn't a contradiction sharing the same placeholder value (arguments) or variables
        //getter is to get another name value in another class to assign to the private property name;
    }


    public void setName(String name){ //setter method setters set values (change values)
//TODO: change the name property to the passed value
        this.name = name;  //this allows us to call this in another part of the app to assign the name property of 'this' object to a new value
       // this.name = name.toUpperCase();  //this allows us to call this in another part of the app to assign the name property of 'this' object to a new value
    }


    public void sayHello(){   // With an argument, this is more like a static method.  Should use the property assignment
//TODO: print a message to the console using the person's name
//        System.out.println("Hello, " + name + "!");
        // can also say:
        System.out.println(this.name + " says hi!");
        // Or
       // System.out.println(getName() + " says hi!");
    }


    public static void main(String[] args){
        Person p = new Person("Joe");
        p.sayHello();
        p.setName("Joe Shmoe");
        p.sayHello();
//
//        person1.sayHello(person1.getName());

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName())); // true
//        System.out.println(person1 == person2); //false
//        System.out.println(person1);
//        System.out.println(person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2); //true

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName()); //John
//        System.out.println(person2.getName()); //John
//        person2.setName("Jane");
//        System.out.println(person1.getName()); //John Jane
//        System.out.println(person2.getName()); //Jane
        //Because the two objects are set to be equal they are locked in to assume all values of eachother...because the code is compiled first, before running.




    }


}
