public class MethodsLecture {
    public static void main(String[] args) {
//        int a = 4;
//        int i = 12;
//        double b = 4.0;
//        double d = 4.0;
//        System.out.printf("%.1f\n", b + d);
//        System.out.println(a + i);
//
//        int intVariable = scan.nextInt();
//        double doubleVariable = scan.nextDouble();
//        scan.nextLine();
//        String strVariable = scan.nextLine();
//        System.out.println(i+intVariable);
//        System.out.println(d+doubleVariable);
//        System.out.println(s+strVariable);
    }
}

//  METHODS
//        A sequence of statements/ block code that performs certain tasks

//                public static void main (String[] args){
//
//        } - has visibility-modifier (public- means other classes can see it), static keyword (optional) means that the method belongs to the class and NOT instances of it, return type of the method- if it doesn't return anything, it will be void, name, takes parameters and has a body
//    There's no reason for main to have a return type because it exists to run our other funcions

//    in JAva we need to specify the type of the arguments

//        public static void HelloWorld(){
//            return "Hello World!";
//        }
//        System.out.println(args);
//            System.out.println(args); //This is an array of strings that's passed into the main method.
//            will always have a main - as long as we run our code in the same class (sometimes we will run code in a different class - but that will take place later)

            //anything that we run is called inside of the main
//            String myGreeting = " Good Day";
//            String cohort = "Olympic";
//            greetCohort(myGreeting, cohort);
//            greetCohort(myGreeting, "Ganymede");
//            greetCohort("Good Morning", "Ganymede");
//            System.out.println(helloWorld());
//        }

//        psvm (String[] args) this is the entry point to our app.  separate classes have one


/*    TO DO TOGETHER: Write a public static method called orderFood that
    prints the message "I would like fries please."
 */

//    public static void orderFood(){ //void means it prints, does not return...like a console.log
//        System.out.println("I would like fries please");
//    }

/*
    TO DO: Create a main method in this class. Use it to call your
    orderFood method. Run the program to see the results.
 */





//     Method Overloading: we can define multiple methods with the same name as long as they have diff. parameter type, parameter order or number of parameters
//    Overloaded methods can call other versions of themselves, use these to provide default values

/*
    TO DO: Write a public static method called favoriteSong that prints
    your favorite song.
 */
//    public static void favSong(String song){
//        System.out.println("My favorite song is " + song);
//        song = "time";
//    }

/*
    TO DO: Write a public static method called weeksIn that prints
    message saying how many weeks you've been at Codeup.
 */

//  METHOD OVERLOADING

/*
    TO DO TOGETHER: Overload your orderFood method. Create a version that
    takes in one String parameter which can replace the item they are
    ordering.
 */
//    Version 1
//public static void orderFood(){ //void means it prints, does not return...like a console.log
//    System.out.println("I would like fries please");
//}
////    Version 2
//public static String orderFood(int number, String order){
//    System.out.printf("I would like %d %s\n", number, order);
//}
////    Version 3
//    public static void orderFood(String food){
//        System.out.printf("I would like %s please!\n", food);
//    }

//    version 4
//    public static void orderFood(String item1, String item2){ //This wroks because the paramets types are different
//        System.out.printf("I would like %s and %s\n", item1, item2);
//    }




/*
    TO DO: Overload orderFood again. Create a version that takes in two
    parameters: a String replacing the item being ordered, and an int that
    represents how many of the item they would like to order. Display a new
    message using these arguments.
 */

/*
    TO DO TOGETHER: We'll overload orderFood again. We'll still have two
    parameters in this new version, however they will both be Strings
    representing two different items the customer wants. Let's display a
    new message reflecting the change.
 */

//  RECURSION

//    recursion is great when you don't know the endpoint...we just need to know our specifications and write code that occurs every other time

//    public static void count(int n){
////         this exception-statement is the stopping condition
//        if(n <= 0){
//            System.out.println("All done!");
//            return;
//        }
//        System.out.println(n);
//        count(n - 1);
//    }


//    public static void main(String[] args) {
//        count(5);
////        prints out 5, calls count(5 -1)
////        prints out 4, calls count(4 -1)
////        prints out 3, calls count(3 -1)
////        prints out 2, calls count(2 -1)
////        prints out 1, calls count(1 -1)
////        prints out "All done!"
//    }


    //    getPower forLoop
//    public static long getPower(int base, int exponent){
//        long result = 1;
//        for( int i =1; i <= exponent; i++){
//            result = result * base;
//        }
//        return result;
//    }

//
//    public static long getPower(int base, int exponent){
//        if(exponent == 0) {
//            return 1;
//        } else if(exponent == 1) {
//            return base;
//        } else if( exponent == 2) {
//            return base * base;
//        }
//        System.out.println("base:" + base);
//        System.out.println("exponent:" + exponent);
//       long count = base * getPower(base, exponent -1);
//        System.out.println("current count:" + count);
//        return count;
//        return base * getPower(base, exponent -1);
//         it's confusing because in recursion we because we're terminating the program and then starting back through it again until we get the thing we're looking for...recursion is a great way to see someone's problem solving skills
//        There are different ways to build recursion - test out your method by seeing what's happening
//        3 * getPower(3,4); <- 1st return because this is calling the method, we're not done
//        3 * 3 * getPower(3, 3); <- 2nd return, we're tacking our returns onto eachother
//        3 * 3 * 3 *getPower(3, 2); <- 3rd return
//        3 * 3 * 3 * 3 * 3 <- final result (you keep going until you reach what ever you're calling in the method)
//    }


//    public static void main(String[] args) {
//        count(5);
////        second example
//        getPower(3, 5);
//        first example
//        getPower(2, 4);
//    }



/*
    BONUS: Take a look at the Fibonacci sequence. Write a
    recursive method that accepts an int argument representing the number
    or results printed out following the Fibonacci sequence.



    For example:

    fibonacci(5) would print -> 0 1 1 2 3
    fibonacci(10) would print -> 0 1 1 2 3 5 8 13 21 34
 */

// HINT: The recursive method should return an int for each number in the series

// HINT: you may need an additional method using a for loop to actually print
// each number

//    public static void main(String[] args) {
//        favSong("Time - Hans Zimmer");
////        invokes version one
//        orderFood();
////        invokes version two
//        orderFood("wings");
////        invokes version three
//        orderFood(3, "Fries");
////        In order for fit to be Method overloading - the arguments have to be different in order for Java to consider it to be a different method
////        invoke version four
//        orderFood("Sushi", "Ramen");
//    }


//    }
//}
