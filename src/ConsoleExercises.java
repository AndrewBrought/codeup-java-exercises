import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f.", pi);

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
//        int userInput = sc.nextInt();
//        System.out.println("You entered the following: " + userInput * 2);

//        System.out.println("Please enter a number: ");
//        int userInput = sc.nextInt();
//        System.out.println("You entered: " + userInput);

//        Input mismatch exception

//        User Prompt
//        System.out.println("Please enter three words: ");
//
////        Variables storing user input
//        String word1 = sc.next();
//        String word2 = sc.next();
//        String word3 = sc.next();
//
////        Return the value of the user's input
//        System.out.println(word1);
//        System.out.println(word2);
//        System.out.println(word3);

//        System.out.println("Please enter a sentence: ");
//       sc.nextLine();
//        String sentence = sc.nextLine();
//
//        System.out.printf(sentence);

//        Prompt the user to enter values of length and width of a classroom at Codeup.
//
//                Use the nextLine method to get user input and parse the resulting string to a numeric type.
//
//        Assume that the rooms are perfect rectangles.
//                Assume that the user will enter valid numeric data for length and width.
//                Display the area and perimeter of that classroom.
//
//                The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.
//
//        System.out.println("Please enter length and width of a classroom at Codeup: ");

//        Variables storing user input
        System.out.println("Please enter the length here: ");
//
        int length = sc.nextInt();
        System.out.println("Please enter the width here: ");
//
        int width = sc.nextInt();

        System.out.format("The area of the classroom per yours specs is: length: %dft * width: %dft" + " = " + length * width + " sqft", length, width);



//        Cubed
//        System.out.println("Please enter the length here: ");
////
//        double length = sc.nextDouble();
//        System.out.println("Please enter the width here: ");
////
//        double width = sc.nextDouble();
//
//        System.out.println("Please enter the height here: ");
////        sc.nextLine();
//       double height = sc.nextDouble();
//
//        System.out.format("The volume of the classroom per yours specs is: length: %.2fft * width: %.2fft * height: %.2fft" + " = " + length * width * height + " cubedft", length, width, height);



    }
}

