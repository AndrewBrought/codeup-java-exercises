import java.util.Scanner;

public class HighLow {
    static Scanner sc = new Scanner(System.in).useDelimiter("\n");



    public static int guess(int min, int max) {
        System.out.println("In 10 tries, please guess a number between 1 and 100: ");
        int userInput = sc.nextInt();
        if (userInput > 100 || userInput < 1) {
            System.out.println("Please guess a number between 1 and 100: ");
            return guess(1, 100);
        } else {
            int number = (int) (Math.random() * 100);
            int guess = 0;
            for (int i = 1; i <= 10; i++) {

                System.out.println("Guess " + guess + i + " : " + userInput);
                if (userInput > number) {
                    System.out.println("LOWER");
                     userInput = sc.nextInt();
                } else if (userInput < number) {
                    System.out.println("Higher");
                    userInput = sc.nextInt();
                } else {
                    System.out.println("GOOD GUESS!");
                    break;
                }
            }
            return userInput;
        }
    }

//============   Sophie's Solution:   =================

//    public static int getInteger(int min, int max){
////        Scanner sc = new Scanner(System.in).useDelimiter("\n");
//        System.out.printf("Enter a number between %d and %d: ", min, max);
//        int userInput = sc.nextInt();
////        this conditional validates if a # is within range
//        if(userInput > max || userInput < min){
//            System.out.println("Please enter a number within the range.");
//            return getInteger(min, max);
//        }
//        System.out.println("Thanks for entering a valid number!");
//        return userInput;
//    }
//    //      calculating factorial using recursion
//    public static long factorialRecursion(int x){
//        if(x <= 1){
//            return 1;
//        }
//        return x * factorialRecursion(x - 1);
//    }

//    public static void guessingGame(int guess, int answer){
//        if(guess == answer){
//            System.out.println("You got it!");
//        }else if (guess < answer){
//            System.out.println("HIGHER");
//            guessingGame(getInteger(1,100), answer);
//        }else {
//            System.out.println("LOWER");
//            guessingGame(getInteger(1,100), answer);
//        }
//    }
//    THIS IS HER PSVM
//    public static void main(String[] args) {
////        Exercise 5 - START: High Low Guessing Game
//        System.out.println("Let's play a game.");
//
//        do {
//            int answer = (int) (Math.random() * 100) + 1;
//            System.out.println("Can you guess what number I'm thinking of?");
//            guessingGame(getInteger(1,100), answer);
//            System.out.println("Would you like to continue?(y/n)");
//        }while(sc.next().equalsIgnoreCase("y"));
//        Exercise 5 - END




    public static void main(String[] args) {
        int newGuess = guess(1, 100);
        System.out.println(newGuess);

    }
}
