import java.util.Scanner;

public class MethodsExercises {


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





    //  Create a method that validates that user input is in a certain range
//      The method signature should look like this:

    public static void getInteger(int min, int max){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = sc.nextInt();
        if(userInput <= max && userInput >= min){
            System.out.printf("Nailed it! Your number: " + userInput + " is right on target! Thank you for following directions!");
        } else{
            System.out.println("Please enter a number between 1 and 10: ");
            getInteger(min, max);
        }

    }


//    Calculate the factorial of a number.

    public static void factorial(){
    Scanner sc = new Scanner(System.in);
    int userInput = sc.nextInt();
        System.out.print("Enter a number between 1 and 10: ");
        for(int i = 1; i <= userInput; i++){

        }
    }





    public static void main(String[] args) {
//        System.out.println(add(2, 3)); //5
//        System.out.println(subtract(7, 4)); //3
//        System.out.println(multiply(6, 5)); //30
//        System.out.println(divide(81, 9)); //9
//        System.out.println(modulus(4, 2)); //0
//        System.out.println(modulus(0, 0)); // cannot run 0 mod 0
       getInteger(1, 10);


    }

}