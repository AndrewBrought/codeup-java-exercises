import java.util.Scanner;

public class ControlStatementsAndLoopsLec {
    public static void main(String[] args){

//        Control Statements & Loops
//        Tripple equals does not exist in java because there is not a loose quality as there is in JS
//        No such thing as a truthy or falsey statement.  In Java, in order to have a valid condition it has to be true or false
//       ex:
//        discountPercent == 2.3;
//        letter == 'y'
//        isValid == false

//        Strings are NOT a primitive type= they are a ref. type

//        we have top use a special method for looking at them
//        Scanner sc = new Scanner(System.in)

//        improper way
//        System.out.print("Continue? [y/N] ")
//                String userInout = sc.next();
//        boolean confirmation = userInput == "y";
//
//        Propper way
//        System.out.print("Continue? [y/N] ")
//                String userInout = sc.next();
//        boolean confirmation = userInput.equals("y");

        // ==================== Slide 3

        // no >== ,or <==, or === because only value comparisons are available
        // truthy and falsy values don't exist in Java

//        if(2) { //Will NOT run
//            System.out.println("This runs");
//        }

//        if(true) { //This WILL run
//            System.out.println("This runs");
//        }

//        if(3 > 1) { //This WILL run
//            System.out.println("This runs");
//        }

//        if(3 > 1 && true || !false) { //This WILL run
//            System.out.println("This runs");
//        }

//        if(3 == 3) { //Will run
////            System.out.println("This runs");
////        }
//
//            if(3 === 3) { //will NOT run
////            System.out.println("This runs");
////        }

        // ==================== Slide 5

        // && will only check second value if first is true
        // & will check both
        // this can be used to check what would otherwise result in a syntax error
        // same comparison process for || and |

        // x will only increment in second condition if first condition is true using &&
//                int x = 2;
//                int y = 3;

//                if (false && ++x == y) { //This will not evaluate the second half if the first thing is false, so the x will not get to increment
//                    //a single & will actually allow the x to increment
//                    System.out.println("Equal");
//                } else {
//                    System.out.println("Not equal");;
//                }
//                System.out.println(x);


        // ==================== Slide 7

        // DO NOT COMPARE STRINGS WITH == !!!!

//                Scanner sc = new Scanner(System.in);
//                String cat1 = sc.nextLine();
//                String cat2 = "cat";
//                System.out.println(cat1);
//                System.out.println(cat2);
//                System.out.println(cat1 == cat2); //This is not comparing the value of the string, it's comparing stuff that has to do with referrence types should use the .equals method

        // do use equals(),

//        Scanner sc = new Scanner(System.in);
//                String cat1 = sc.nextLine();
//                String cat2 = "cat";
//                System.out.println(cat1);
//                System.out.println(cat2);
//        System.out.println(cat1.equals(cat2)); //This works for comparing values of the strings

//    boolean stringValuesAreEqual = "Test".equals("Tes");
//    System.out.printf("The result is: %s", stringValuesAreEqual);


        // or use equalsIgnoreCase()

//String hello = "hello";
//System.out.println(hello.equalsIgnoreCase("HeLlO"));

        // does not equal

//String tech = "tech";
//System.out.println(!tech.equalsIgnoreCase("tool"));



        // ==================== Slides 8 - 16

        // basically the same as JS :)


//            String caseSwitch = "Fred";
//            switch (caseSwitch) {
//                case "bob":
//                    System.out.println("Case 1");
//                    break;
//                case "fred":
//                    System.out.println("Case 2");
//                    break;
//                default :
//                    System.out.println("Default case");
//                    break;
//            }





    }
}
