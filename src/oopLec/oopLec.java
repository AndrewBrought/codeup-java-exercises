package oopLec;

import java.util.Scanner;

public class oopLec {

   public static void main(String[] args){

       //    =========== classes and objects ================
//       Scanner sc = new Scanner(System.in);


       Person rick1 = new Person(); // new data type
       rick1.firstName = "Rick";
       rick1.lastName = "Sanchez";
//       rick.age = 23;
       System.out.println(rick1.firstName);
       System.out.println(rick1.lastName);
//       System.out.println(rick.age);


//       Person rick2 = new Person(); // new data type
//       rick2.firstName = "Rick";
//       rick2.lastName = "Sanchez";
////       rick.age = 23;
//       System.out.println(rick2.firstName);
//       System.out.println(rick2.lastName);
//
//       System.out.println(rick1 == rick2); //false
//
//       System.out.println(rick1); //hexadecimal value that represents the value id that java assigns
//       System.out.println(rick2);


//        If we're working with a reference type we get back "null" for undefined
//       If we're working with a number type we get back "0" for undefined.
//       default for boolean is "false"
//       the undefined value for char is "[]"

//        User user = new User(); // to create this we could create a user class.


       Person fred = new Person();
       fred.firstName = "Fred";
       fred.lastName = "Smith";
//       System.out.println(fred.firstName);
//       System.out.println(fred.lastName);
       System.out.println(fred.sayHello());  //invoking a method




       Dog d1 = new Dog();
       d1.age = 3;
       d1.breed = "corgi";
       d1.canBreed = false;
       d1.name = "Tater";
       System.out.println(d1.name);
       System.out.println(d1.age);

       d1.callForDog("Tater"); //Tater is now walking toward you!
       d1.callForDog("Sparky"); //Tater ignores you.



   }

}
