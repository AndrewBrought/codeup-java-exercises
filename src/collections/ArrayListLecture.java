package collections;
import java.util.*;  //importing java standard library

//import java.util.ArrayList; //can import individually

public class ArrayListLecture {

//    Collections in Java -------

//    What is a data structure?  A way of storing and organizing data for effective access and modification

//     A collection is a data structure that can be used to store and group objects
//    Java collections are not part of the native lanuage but are included in the JAva standard library
//    Collection is actually an interface that is extended by a few sub-interfaces like list set and quue
//    Today we will be covering a specific subtype of list: Arraylist:

//    List vs Set
//Both are indexed
//     List allows for duplicate elements (redundancy)
//     Set does not allow for redundancy

//    What are maps?
//    Maps are another dta structure provided in JSL
//            It is not a subtype of Collection, therefor it behaves differently
//    Maps are intended to store key-value pairs, similar to objects in JS

//    Both of these libraries can be imported into a Class for use **

//    ArrayList
//        Arraylist can only hold objects and all have to be the same type
//    When we want to store primitive values in an array list we have to store data - Java already provides us with "wrapper" classes around primitive types which will allow us to store data like Integers and Doubles in our Collections


//    HashMap
//    Hashmaps store data in key-value pairs
//    keys should all be the same type
//    Values should be the same type
//    Values and Keys don't have to be the same type
//    HashMaps are NOT an indexed data structure - HashMaps don't work that way, the way access values in a hash map is by identifying the corresponding key.*

    public static void main(String[] args) {
//        Creating ArrayList

        ArrayList<String> instructors = new ArrayList<>(); //can specify the type in the new instance - but it's now redundant, no longer necessary
//        int[] threeNumbers = {10, 2, 6};
//        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10,2,6));

//        List<Integer> threeNumbers = Arrays.asList(10,2,6);
//        ArrayList<Integer> numbers = new ArrayList<>(threeNumbers);
//        System.out.println(numbers);

//        Preferred way of writing ArrayLists is to instantiate a generic List type and assign specific arraylist instances...
        List<String> randomList = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Person> people = new ArrayList<>();


//        Add elements to ArrayList
        instructors.add("Justin");
        instructors.add("Sophie");
        instructors.add("Casey");
        instructors.add("Vivian");
        instructors.add(0, "David"); //David is moved to he front and pushes the list back because we set the index where he's added
//        System.out.println(instructors);
//        System.out.println(instructors.size());

        numbers.add(10);
        numbers.add(2);
        numbers.add(6);
        numbers.add(10);
        numbers.add(10);
//        System.out.println(numbers.indexOf(10)); //returns index 0 because the first instance of 10 is at the 0 index
//        System.out.println(numbers.indexOf(8)); // return -1 because it doesnt' exist
//        System.out.println(numbers.lastIndexOf(10)); //returns index 4
//
//        System.out.println(numbers.get(1)); //will return int number 2

//        Creating 2 person objects inside of arraylist
        people.add(new Person("bob", "Ross"));
        people.add(new Person("Jane", "Doe"));
        people.add(0, new Person("john", "smith"));
//        System.out.println(people); //this prints 2 different hash codes, because we're using reference types

        for(Person x : people){
            System.out.println(x.getFirstName());
//            System.out.print("[ ");
//            System.out.print(x.getFirstName());
//            System.out.print(" ]");
        }

//        System.out.println(instructors.contains("Justin")); //returns boolean true
//        System.out.println(instructors.contains("justin")); //returns boolean false  MUST be the same type and same value
//        System.out.println(randomList.isEmpty()); // returns boolean true
//        System.out.println(instructors.isEmpty()); //returns boolean false

//        Removing an element from ArrayList
//        instructors.remove(0);
//        or
//        This would remove the first instance of "David"
//        instructors.remove("David");
//        System.out.println(instructors);  // sans David









    }

}
