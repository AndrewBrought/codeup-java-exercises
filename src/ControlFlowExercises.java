import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args){

//         Text Examples:
//        for(int i = 0; i < 10; i += 1){
//            System.out.println("i is " + i);
//        }

//        for(int i = 1; i < 100; i++){
//            System.out.println(i);
//            if( i == 5){
//                break;
//            }
//        }

//        for(int i = 1; i <= 10; i++){
//            if(i % 2 == 1){
//                continue;
//            }
//            System.out.println(i);
//        }

//Problem 1
//        int i = 5;
//        while (i <= 15){
//            System.out.print(i + " ");
//            i++;
//        }

//        Problem 2
//        int a = 0;
//        do {
//            a += 2;
//            System.out.println(a);
//        } while (a < 100);

//        int a = 105;
//        do {
//            a -= 5;
//            System.out.println(a);
//        } while (a > -10);

//        long x = 2;
////        int q = (1000 * 100);
//        do {
//            System.out.println(x);
//            x *= x;
//        } while (x <= 1000 * 100);

//        for(int i = 100; i >= -10; i -= 5){
//            System.out.println(i);
//        }
//
//        for(long i = 2; i <= 1000000; i *= i){
//            System.out.println(i);
//
//        }

//        FizzBuzz
//        for( int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

        Scanner sc = new Scanner(System.in);

//      Table of Powers
        System.out.println("What number would you like to enter?");
        int userInput = sc.nextInt();

        System.out.println("number | squared | cubed |");
        sc.nextLine();
        System.out.println("------ | ------- | ----- |");
//        sc.nextLine();

//        for (int i = 1; i <= userInput; i++){
//            System.out.print(i + "    ");
//            if(i > 9) {System.out.print("   " + i * i);
//            }else{
//                System.out.print("    " + i * i);
//            }
//            System.out.print("         " + i * i * i);
//
//        sc.nextLine();
//        }

        for (int i = 1; i <= userInput; i++){
            System.out.print(i + "    ");
            System.out.print("   " + i * i);
            System.out.println("         " + i * i * i);

//            sc.nextLine();
        }

//        System.out.println("Please enter a numerical grade: 0 - 100 ");
//        int userInput = sc.nextInt();
//        System.out.println(userInput);
//        int grade = userInput;
//        String response = "";

//                do {
//                    System.out.println("Please enter a numerical grade: 0 - 100 ");
//                    int userInput = sc.nextInt();
//                    System.out.println(userInput);
//                    int grade = userInput;
//                    if (grade <= 59) {
//                        System.out.println("Your grade is an F: " + grade);
//                    } else if (grade <= 66) {
//                        System.out.println("Your grade is a D: " + grade);
//                    } else if (grade <= 79) {
//                        System.out.println("Your grade is a C: " + grade);
//                    } else if (grade <= 87) {
//                        System.out.println("Your grade is a B: " + grade);
//                    } else if (grade <= 100) {
//                        System.out.println("Your grade is an A: " + grade);
//                    }
//                 System.out.println("Would you like to continue? Enter yes or no: ");
//                     String yesNo = sc.next();
//                     response = yesNo;
//                } while (response.equals("yes"));







//


    }
}
