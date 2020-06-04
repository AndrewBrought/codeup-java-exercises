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

//    ======Sophie's Solutions:
//        int i = 5;
//        while(i <= 15){
//            System.out.print(i + " ");
//            i++
//        }

//        for(int i = 5; i <= 15; i++){
//            System.out.print(i + " ");
//        }
//        ====================

//        Problem 2
//        int a = 0;
//        do {
//            a += 2;
//            System.out.println(a);
//        } while (a < 100);


//        int a = 100;
//        do {
//            System.out.println(a);
//            a -= 5;
//        } while (a >= -10);

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


        //======== Sophie's Solutions:


//            int j = 0;
//            do{
//                System.out.println(j);
//                j += 2;
//            }while(j <= 100);

        //    for(intialization, condition, incrementation/decrementation)
//        for(int j = 0; j <= 100; j += 2){
//            System.out.println(j);
//        }
//        Also:
//        for(int x = 0; x <= 100; x++){
//            if(x % 2 == 0){
//                System.out.println(x);
//            }
//        }

//        count backwards by 5's from 100 to -10

//            int j = 100;
//            do{
//                System.out.println(j);
//                j -= 5;
//            }while(j >= -10);

//        for(int j = 100; j >= -10; j -= 5){
//            System.out.println(j);
//        }


//            start at 2, square numbers < 1,000,000,
//            long j = 2;
//            do{
//                System.out.println(j);
//                j *= j;;
//            }while(j < 1000000);

//        for(long j = 2; j < 1000000; j *= j){
//            System.out.println(j);
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

        //======== Sophie's Solutions:

//        for(int f = 1; f <= 100; f++){
////            when ever you're writing a waterfall structure you want to check for the most detailed thing first
//            if(f % 15 == 0){
//                System.out.println("FizzBuzz");
//            } else if(f % 5 == 0){
//                System.out.println("Buzz");
//            } else if(f % 3 == 0){
//                System.out.println("Fizz");
//            } else{
//                System.out.println(f);
//            }
//        }

//        =========================

//        Scanner sc = new Scanner(System.in);

//      Table of Powers
//        System.out.println("What number would you like to enter?");
//        int userInput = sc.nextInt();
//
//        System.out.println("number | squared | cubed |");
//        sc.nextLine();
//        System.out.println("------ | ------- | ----- |");
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

//        for (int i = 1; i <= userInput; i++){
//            System.out.print(i + "    ");
//            System.out.print("   " + i * i);
//            System.out.println("         " + i * i * i);
//
////            sc.nextLine();
//        }

        //======== Sophie's Solutions:
//        Justin: I used %-NUMd and they all worked Laura!

//        Scanner userInput = new Scanner(System.in);
//
//        System.out.println("What number would you like to go up to?");
//        int num = userInput.nextInt();
//
//        System.out.println("Here is your table!");
//        System.out.println("number   | squared  | cubed");
//        System.out.println("______   | _______  | _____");
//
//        for(int y = 1; y <= num; y++){
//            System.out.printf("%d        | %d        | %d%n", y, y*y, y*y*y);
//        }

//        ======================





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

        //======== Sophie's Solutions:
//        Scanner userInput = new Scanner (System.in);
//
//        System.out.println("Would you like to take a look at your letter grades?");
//        String answer = userInput.next();
//
//        while(answer.equalsIgnoreCase("YES")){
//            System.out.println("Please enter the numeric grade: ");
//            int grade = userInput.nextInt();
//
//            char letterGrade;
//            if(grade >= 88){
//                letterGrade = 'A';
//            } else if(grade >= 80){
//                letterGrade = 'B';
//            } else if( grade >= 67){
//                letterGrade = 'C';
//            } else if(grade >= 60){
//                letterGrade = 'D';
//            } else{
//                letterGrade = 'F';
//            }
//
//            System.out.printf("Your letter grade is: %c.%n", letterGrade);
//
//            System.out.println("Do you want to check more grades?");
//            answer = userInput.next();
//        }

//        ====================


    }
}
