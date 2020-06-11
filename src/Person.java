public class Person {
    private String name;

    public String getName(){
//TODO: return the person's name
        return this.name;
    }

    public void setName(String name){
//TODO: change the name property to the passed value
        this.name = name;
    }
    public void sayHello(String name){
//TODO: print a message to the console using the person's name
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args){
//        Person person1 = new Person();
//        person1.setName("Joe Shmoe");
//
//        person1.sayHello(person1.getName());

//        Person person1 = new Person();
//        person1.setName("John");
//        Person person2 = new Person();
//        person2.setName("John");
//        System.out.println(person1.getName().equals(person2.getName())); // true
//        System.out.println(person1 == person2); //false

//        Person person1 = new Person();
//        person1.setName("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2); //true

//        Person person1 = new Person();
//        person1.setName("John");
//        Person person2 = person1;
//        System.out.println(person1.getName()); //John
//        System.out.println(person2.getName()); //John
//        person2.setName("Jane");
//        System.out.println(person1.getName()); //John Jane
//        System.out.println(person2.getName()); //Jane
        //Because the two objects are set to be equal they are locked in to assume all values of eachother...because the code is compiled first, before running.




    }


}
