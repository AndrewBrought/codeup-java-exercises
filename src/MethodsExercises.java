import java.util.Scanner;

public class MethodsExercises<response> {
// Global scanner
    static Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private static boolean response;
//    private static long fact;

    //    Basic Arithmetic
//    Create four separate methods. Each will perform an arithmetic operation:
//    Each function needs to take two parameters/arguments so that the operation can be performed.
//
//    Addition
    public static long add(int x, int y) {
        return x + y;
    }

    //    Subtraction
    public static long subtract(int x, int y) {
        return x - y;
    }

    //    Multiplication
    public static long multiply(int x, int y) {
        return x * y;
    }

    //    Division

    public static long divide(int x, int y) {
        return x / y;
    }

    //    Add a modulus method that finds the modulus of two numbers.
    public static long modulus(int x, int y){
        return x % y;
    }
//
//    Test your methods and verify the output.
//    Food for thought: What happens if we try to divide by zero? What should happen?
//

//    multiplying with out multiplying
//    public static double loopMultiply(double a, double b){
//        double result = 0;
//        for(double i =0; i < a; i++){
//            result += b;
//        }
//        return result;
//    }


//    recursive multiplication
//    simple verison of recursion
//    public static double recursiveMultiply(double a, double b){
//        if(a == 0 || b == 0){
//            return 0;
//        }
//        return a + recursiveMultiply(a, b-1);
//    }



    //  Create a method that validates that user input is in a certain range
//      The method signature should look like this:

//    public static void getInteger(int min, int max){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = sc.nextInt();
//        if(userInput <= max && userInput >= min){
//            System.out.printf("Nailed it! Your number: " + userInput + " is right on target! Thank you for following directions!");
//        } else{
//            System.out.println("Please enter a number between 1 and 10: ");
//            getInteger(min, max);
//        }
//
//    }


//    Sophie's walkthrough:
//    public static int getInteger(int min, int max){
//        System.out.printf("Enter a number between %d and %d: ", min, max);
//        int userInput = sc.nextInt();
//        if(userInput > max || userInput < min){
//            System.out.println("Please enter a number within the range.");
//            return getInteger(min, max);
//        }
//        System.out.println("Thanks for a valid number!");
//        return userInput;
//    }


//    Calculate the factorial of a number.

//    boolean response;

        public static int factorial(int min, int max) {
            System.out.print("Enter a number between 1 and 10: ");
            int userInput = sc.nextInt();
            if (userInput > max && userInput < min) {
                System.out.print("Enter a number between 1 and 10: ");
                return factorial(1, 10);
            } else {
                long fact = 1;
                for (int i = 1; i <= userInput; i++) {
                    fact = fact * i;
                }
                System.out.println("Factorial of " + userInput + "!" + " = " + fact);
            }
            System.out.println("Thanks for playing the factorial game");
            sc.nextLine();
            System.out.println("Would you like to enter another number?");
            String answer = sc.nextLine();
            if (!answer.equals("no")) {
                return factorial(1, 10);
            } else {
                System.out.println("See yout later!");
            }
            return userInput;
        }


    //    =======  Sophie's Solution for factorial recursion  ======

    //      calculating factorial using recursion
//    public static long factorialRecursion(int x){
//        if(x <= 1){
//            return 1;
//        }
//        return x * factorialRecursion(x - 1);
//    }



//        public static int dice(){
//            System.out.println("Roll the two dice...please enter how many sides for each: ");
//            int userInput = sc.nextInt();
//        }

//  ========  Sophie's Solution =======
//    public static void rollDice(int sides){
//        int firstDice = (int)(Math.random() * sides) + 1;
//        int secondDice = (int)(Math.random() * sides) + 1;
//        System.out.printf("1st Result: %d | 2nd Result: %d%n", firstDice, secondDice);
//    }




    public static void main(String[] args) {
//        System.out.println(add(2, 3)); //5
//        System.out.println(subtract(7, 4)); //3
//        System.out.println(multiply(6, 5)); //30
//        System.out.println(divide(81, 9)); //9
//        System.out.println(modulus(4, 2)); //0
//        System.out.println(modulus(0, 0)); // cannot run 0 mod 0

//      My getInteger solution
//       getInteger(1, 10);
//        Sophie's Solution:
//        int myInt = getInteger(1,50);
//        System.out.println(myInt);

//        My Factorial Solution:
//        long newFactorial = factorial(1,10);
//        System.out.println(newFactorial);




//        Sophie's roll dice
//        do{
//            System.out.println("Let's roll a pair of dice. How many sides? ");
//        getInteger asks the user to input a number
//            rollDice(getInteger(1,10));
//            System.out.println("Would you like to continue?(y/n)");
//        }while(sc.next().equalsIgnoreCase("y"));
//
//        Exercise 3 - START: Calculating Factorials
//        int number;
//        String response;
//        long fact = 1;
//        do{
//            number = getInteger(1,26);
//            System.out.println("Calculate factorial of " + number + "!...?");
//            System.out.println("Continue?(y/n)");
//            response = sc.next();
//        }while(!response.equalsIgnoreCase("y"));
//        System.out.println(fact);
//        System.out.print(number + "! = ");
////        Factorials example WITHOUT recursion
//        for(int i = 1; i <= number; i++){
//            fact = fact * i;
//            if(i < number){
//                System.out.print(i + " x ");
//            }else{
//                System.out.println(i + " = " + fact);
//            }
//        }
////        Exercise 3 - END


    }

}