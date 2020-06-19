package AnnotationsExceptionsAndHandling;

import java.sql.SQLException;

public class ExceptionLecture {

    /*
    * Exceptions are when something goes wrong in our software that are recoverable
    *
    * Major types: Exception, RuntimeException, Error
    *
    * RuntimeExceptions are issues within our code that we can fix
    *
    * Errors are usually a Serious problem outside of our control
    *
    * throws keyword allows us to use the try-catch block in whatever method will throw the exception
    *
    * KNOW the difference between checked and unchecked exceptions...
    * Checked exceptions are things that could go wrong that are risky but out of our control
    * */

        public static void main(String[] args) {

            // ================================ SLIDE 3
//        This happens when the code runs...after the compilation.
//        throw new RuntimeException("Something went wrong");

//            Runtime exceptions are when we do something in our code that are not valid, but wont throw an error during compilation


//            when we write code that's invalid the java library language will throw an exception

            //      command  + b will show us where code is defined in the java lang
//        String[] names = {"cathy", "bob"};
//        System.out.println(names[10]);

//        int x = 3;
//        int y = 0;
//
//        System.out.println(x / y);
//
//            try {
//                int x = 3;
//                int y = 0;
//                System.out.println(x/y);
//            }catch(ArithmeticException e) {
//                System.out.println("Error in arithmetic!"); // this will run
//            }catch(Exception e){
//                System.out.println("Something went wrong!");
//                System.out.println(e.getMessage());
//            }
//            System.out.println("it will run");


//            try {
//                String st = null;
//                System.out.println(st.toUpperCase());
//            } catch (ArithmeticException e) {
//                System.out.println("Error in arithmetic!");
//            }catch(RuntimeException e){
//                System.out.println("A runtime exception happened!"); //NOW this new catch will run
//                System.out.println(e.getMessage());
//            }catch(Exception e){
//                System.out.println("Something went wrong!"); //This will run
//                System.out.println(e.getMessage());
//            }
//            System.out.println("it will run");

//        throw new ArithmeticException("Cannot divide by zero");

            // Exceptions may be thrown

//            try {
//                String str = null; //prints out "Something went wrong"
//                String str2 = "Bob"; //prints out length
//                System.out.println(str.length());
//                //Here, Exception is the data type
//            }catch(Exception e){
//                System.out.println("Something went wrong!");
////                System.out.println(e.getMessage()); // this returns null
//                e.printStackTrace(); // returns null pointer exception
//            }


//            throw new Exception("Uh oh"); //this by itself will not run because it's throwing a checked exception and we must handle it in some way (ie. try-catch block

//            This will run:
//            try{
//                throw new Exception("Uh Oh");
//            }catch(Exception e){
//                e.printStackTrace();
//            }

//            This will hault the program
//            try {
//                throw new SQLException("Something went wrong"); //checked exception
//            } catch(SQLException e){
//                throw new RuntimeException("Error occurred when adding a record"); //will completely stop the program
//            } finally {
//                System.out.println("the finally always runs!");
//        }

//            finally block is normally where you would close off the connection to a data base or outside resources
//             See this: https://stackoverflow.com/questions/3861522/do-you-really-need-the-finally-block

//      Throws - - throws the problem further down the road to be handled...sometimes you're at a too specific level to handle a problem
//            Rule of thumb, use try-catch as soon as you can

//            try {
//                throw new NameIsBobException("The name is Bob: ");
//            } catch (NameIsBobException e) {
//                e.printStackTrace();
//            }


//              checked exception - Any exception, not descended from runtime exception...must handle the exception such as with a try catch block
//              runtime exception - is any exception descended from Runtime exception...does not have to be handled


//        try {
//            throw new Exception("Something went wrong");
//        } catch(NullPointerException e) {
//            System.out.println(e.getMessage());
//        } catch(RuntimeException e) {
//            System.out.println("Runtime exception happened");
//        } catch(Exception e) {
//            System.out.println("Something went wrong generally");
//        }
//
//        System.out.println("What will happen?");
//
//        System.out.println("Will this run?????");

            // You have to handle most exceptions that extend from Exception

//            try {
//                // risky things
//                boolean badThingHappened = true;
//                if (badThingHappened) {
//                    throw new Exception("EXCEPTION: you did the bad thing!!!");
//                }
//                System.out.println("This only runs if condition is false");
//            } catch(Exception e) {
//                System.out.println("You did x and it broke");
//                System.out.println(e.getMessage());
//                e.printStackTrace(System.out);
//            }

            // Curriculum Example


//            try {
//                System.out.println("Let's see...");
//                int result = 1 / 0;
//                System.out.println("I can divide by zero!");
//            } catch (ArithmeticException e) {
//                System.out.println("Math still works!");
//                System.out.println(e.toString());
//                System.out.println();
//                e.printStackTrace(System.out);
//            }

//            System.out.println("This will still run");




            // ================================ SLIDE 4

//        int[] numbers = {1, 2, 3};
//        int x = 5;
//        try {
//            x = numbers[1];
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Exception caught!");
//            x = 0;
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            System.out.println("This will always run.");
//            // normally used for "clean up" like closing file streams or DB connections
//        }
//        System.out.println(x);
//        System.out.println("This always runs");



            // we can catch multiple exceptions, including exceptions we defined

//            try {
//                double result;
//                String[] strings = {"Bob", "Fred", "Sally"}; // will not be caught by specific Exception
//                System.out.println(strings[3]);
//            } catch(ArrayIndexOutOfBoundsException e) {
//                System.out.println(e.toString());
//            } catch(Exception e) {
//                System.out.println("This won't run");
//                System.out.println(e.toString());
//            }


            // ================================ SLIDE 5 and 6

//        try {
//            throw new Exception("Bummer. The risky stuff failed. You'll handle it.");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


            // ================================ SLIDE 7

            // catching a custom exception


//        try {
//            soutName("Bob"); // cannot call soutName without exception handling
//        } catch (NameIsBobException e) {
//            e.printStackTrace();
//        }


            // ================================ SLIDE 8


            // calling a method that handles an exception

//            thisHandlesAnException();

            // using throws in a method, we can kick the responsibility of handling the exception up the chain

//            try {
//                thisMakesAnException();
//            } catch (Exception e) {
//                System.out.println(e.getMessage());
//            }


            try {
//                soutName("Justin");
                soutName("Bob");
            } catch (NameIsBobException e) {
                e.printStackTrace();
            }


        }

//        public static void thisHandlesAnException() {
//            try {
//                throw new Exception("Yep, an exception again :(");
//            } catch (Exception e) {
//                System.out.println("EXCEPTION!!!");
//                System.out.println(e.getMessage());
//            }
//        }
//
//        public static void thisMakesAnException() throws Exception {
//            throw new Exception("Exception!");
//        }
//
    //Can throw multiple exception in throws
//    See line 237
        public static void soutName(String name) throws NameIsBobException {
            if (name.equalsIgnoreCase("bob")) {
                throw new NameIsBobException("NOOOOOOO!!!!");
            } else {
                System.out.println(name);
            }
        }

    }












