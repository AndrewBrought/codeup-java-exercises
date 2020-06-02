import java.util.Arrays;
import java.util.Scanner;

public class consoleIOLec {

    public static void main(String[] args) {

//        cmd + B allows us to look at what's under the hood
        System.out.println("Hello Ganymede!");

//        =================  print() and println()

//         this:
//            System.out.println("here");
//            System.out.println("there");

//            is equivalent to this: ** \t is a tab
//        This will be in line
//        System.out.print("Hello");
//        System.out.print("World");
//
////        These will run on their own line
//            System.out.print("here\n");
//            System.out.print("there\n");
//
////       To concatenate, just like JS:
//        System.out.println("Hello" + " " + "world");

//        Print a formatted string using the following...printf(formatString, data

////        same output as print():
//        System.out.printf("Hello");
//        System.out.printf("World");
//
////        creating a string variable:
//        String bigBall = "World";
//        System.out.printf("Hello %s", bigBall);
//        System.out.printf("Hello %S", bigBall); //All caps
//
//    //    multiple variables:
////        int three = 3;
////        String typeOfPetGroup = "cats";
//////        %d represents integers (numbers)
////        System.out.printf("I have %d %s.", three, typeOfPetGroup);
//
//        double three = 3.5;
//        String typeOfPetGroup = "cats";
////        %d represents integers (numbers)
//        System.out.printf("I have %.2f %s.", three, typeOfPetGroup);
////        should run: I have 3.50 cats.
//
////        currency
//        int currencyPennies = 1000;
//        System.out.printf("I'll sell you swamp land for $%.2f an acre!", currencyPennies / 100.00);
////        should return: I'll sell you swamp land for $10.00 an acre!
//
////        write a program that will print your name with a greeting
////        Welcome, YOUR-NAME-HERE!
//
//        String name = "Andrew Brought";
//        System.out.printf("Welcome, %s!", name);

//        ======================= user input
//        need to import at the top of the code = import java.util.Scanner
//        while selected and hovered over press: option + enter will give you the ability to auto input the import

        Scanner sc = new Scanner(System.in); //looks at text files and looks at input that user types into our console

//        String str = "hello"; //built into java.lang so will be automatically allowed because java file already uses java.lang

//        String userInput = sc.next();
//        System.out.println(userInput);
//        System.out.println("You entered the following: " + userInput);

//        taking in a number value from the input nextInt();
//        int userInput = sc.nextInt();
//        System.out.println("You entered the following: " + userInput * 2);


//        .next() captures each input separated by whitespace:
//        System.out.println("Please enter your First, middle, and last name: ");
//        String firstName = sc.next();
//        String middleName = sc.next();
//        String lastName = sc.next();
////        String what = sc.next();
//
//        System.out.println(firstName);
//        System.out.println(middleName);
//        System.out.println(lastName);

//      .nextLine():

//       unexpected behavior
//        What happens is that the scanner captures the name reads the new line first doesn't allow you to enter the second half
//        the work around is to a middle new line to clear out hitting enter

        System.out.println("Enter a word:");
        String word1 = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter in a sentence:");
        String line1 = sc.nextLine();
//        String word2 = sc.next();


        System.out.printf("The word is: %s%nThe sentence is: %s", word1, line1); //




    }
}

