package ArraysLecture;
import oopLec.Person;

import java.util.Arrays;

public class ArraysLecture {

//    static int numberOfPlanets = 8; //this just needs to be declared static - which means it's attached or a property pf the class, non-static is attached to an instance of an object


//    This is an array method, copying colors and adding one to it
    public static String[] colorsCopy(String[] array, String color){
        String[] newCopy = Arrays.copyOf(array, array.length + 1);
        newCopy[newCopy.length-1] = color;
        return newCopy;
    }
    public static void main(String[] args){
        int numberOfPlanets = 8;
        //anything that evaluates to an int, can be passed as an index
//        String[] planets = new String[8];  //creating our first Array.  We created an array type - String, gave it a name, and declared a length
        String[] planets = new String[numberOfPlanets];
//         OR we can say:
//        String[] planets;
//        planets = new String{numberOfPlanets};

        planets[0] = "Mercury";
        planets[7] = "Neptune";
//        planets[0] = "Mercury";
//        planets[0] = "Mercury";

        System.out.println(planets.length);
        System.out.println(planets[0]);
        System.out.println(planets[7]);
//        System.out.println(planets[8]); //This will throw a compile error because this is out of bounds of the length of this array - need a work around.

        int[]myNumbers = {1,2,3,4,5}; // This is instantiating an array literal - means it has actual values inside of it.
//        int[] otherNumbers = [5]; //different ways to instantiate an array

//       int[] otherNumbers = {5,4,3,2,1};
//        Arrays.equals would not work comparing myNumbers and ootherNumbers because they are not an exact match
//        we cast math.random to an (int) because it needs to be a whole number and math.random is a double

//        for(int x: myNumbers){
//            ++x;
//            System.out.println(x); // returns each number in the myNumber array manipulate/incremented
//        }

//          Create an array containing person objects:
        Person justin = new Person("Justin", "Reich"); //different ways of storing an object inside of array

        Person[] instructors = new Person[2]; //way 2
////        Person[] instructors = {new Person(), new Person(), new Person()};
////        System.out.println(instructors[1]);
        instructors[0] = justin; //way 3
        instructors[1] = new Person("Sophie", "K"); //We're putting these things inside of some generic container
        System.out.println(Arrays.toString(instructors));
        Person[] oneMoreInstructor = Arrays.copyOf(instructors, 4);
        System.out.println(Arrays.toString(oneMoreInstructor));
        oneMoreInstructor[2] = new Person("John", "Smith");
        System.out.println(Arrays.toString(oneMoreInstructor));

        //Important to note each object reference is not a string

//        for(Person instructor: oneMoreInstructor){
//            System.out.println(instructor.getFirstName());
//        }


//         we could say:
//        Person sophie = instructors[1];
//        System.out.println(Arrays.toString(instructors)); //we're only going to see the reference type


//        instructors[2] = new Person("David", "Stephens");

//        System.out.println(instructors[2].getLastName());

//        Array of Car objects using Car class
        Car[] myCars = new Car[5];
//        System.out.println(myCars[0].make); //will not return anything because it's set to private
//        Setting private car properties
//        Car[] myCars = {new Car(), new Car(), new Car()}; //This would work without having to instantiate, because it's an array literal
        myCars[0] = new Car();  // instantiate a new Object, or you wont return anything
        myCars[0].setMake("Nissan");
        myCars[0].setModel("Rogue");
        myCars[0].setYear(2017);
        System.out.println(myCars[0].getMake());
        System.out.println(myCars[0].getModel());
        System.out.println(myCars[0].getYear());

        Car marksCar = new Car();
        myCars[1] = marksCar;
        marksCar.setMake("Ford");
        System.out.println(marksCar.getMake()); //These are the same
        System.out.println(myCars[1].getMake()); //These are the same



        //=======iterating over a array ========

        String[] theBeatles = {"John", "Ringo", "George", "Paul"}; //array literal of the beatles


//         Enhanced For loop
//        for(type of each element and place holder name for each person: the array name)

            for(String beatle: theBeatles){
                System.out.println(beatle);
            }


//             Array manipulation methods
//         Arrays.fill
        String[] colors = new String[7];
            Arrays.fill(colors, "blue"); //need to import the arrays object in java
//        Arrays.toString
        //need Arrays.toString to return a String reference of an array
        System.out.println(Arrays.toString(colors)); //this returns an array with a length of 7 objects of "blue"
        System.out.println(Arrays.toString(colorsCopy(colors, "red") ));
//        Arrays.equals
//        System.out.println(Arrays.equals(instructors, theBeatles)); //false

//        Arrays.sort
        Arrays.sort(theBeatles);
        System.out.println(Arrays.toString(theBeatles));

//        Arrays.copyOf


    }
}
