public class Intro {
    public static void main(String[] args){
        System.out.println("Hello, and welcome to intro to Java!");


// control + r will automatically build and run

// Examples of types:

    int age;

    double price;
    final String name = "Andrew";

    System.out.println(name);
//    name = "Alex"; will NOT run...cannot reassign a final variable
            age = 24;
//            pi = 3.14159;
            price = 19.65;
            price = 19.99;

//    Implicit Casting
// can store something that has lesser value into something that has greater value - changing the range of values that the variable can hold
//        putting contents of smaller glass of water into larger glass
//        ex:
//        short lessPrecise = 5;
//        int morePrecise = lessPrecise;

//        Explicit Casting
//        Involves going from a less specific type to a more specific type or going from a higher precision type to a lower precision type
//        Where we take content of larger glass, drinking some and pouring into smaller glass
//        ex:
//            double pi = 3.14159;
//            System.out.println(pi);
//
//            int almostPi = (int) pi;
//            System.out.println(almostPi);
//
//            double piAgain = almostPi;
//            System.out.println(piAgain);
//        This is still 3

    }
}