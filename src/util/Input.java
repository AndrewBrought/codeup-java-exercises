package util;
import java.util.Scanner;

//scanner is set to private because there isn't any reason the rest of code needs to access it (power supply) - it's internal.
//Think of this as one tool that has a lot of different things it can do...or behaviors. Therefore it is not static it is an instance
public class Input {


    private Scanner sc;

    public Input() {
        this.sc = new Scanner(System.in);
    }

    public String getString() {
        return sc.nextLine();
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return sc.nextLine();
    }

    public boolean yesNo() {
        String userInput = sc.nextLine();
//        String userInput = getString();
        if (userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y")) {
            return true;
        } else if (userInput.equalsIgnoreCase("no") || userInput.equalsIgnoreCase("n")) {
            return false;
        } else {
            System.out.println("I am sorry, that's not a valid entry...");
        }
        return yesNo();
    }


//    public int getInt(int min, int max) {
//        boolean state = false;
//        int userInput;
//        do {
//            userInput = sc.nextInt();
//            if (userInput <= max && userInput >= min) {
//                state = true;
//            } else{
//                System.out.println("You entered an invalid number, please enter a valid number: ");
//            }
//        } while (!state);
//        System.out.println("Thanks for a valid number!");
//        return userInput;
//    }

    //    Justin's solution uses single getInt to validate the integer
    public int getInt(int min, int max) {
        int userInt = getInt();
        if (userInt >= min && userInt <= max) {
            return userInt;
        } else {
            System.out.println("Please enter an integer in the correct range between " + min + " and " + max);
            return getInt(min, max);
        }
    }


//    public int getInt(){
//        int userInput = sc.nextInt();
//        return userInput;
//    }

    //    Justin's solution:
    //Integer.valueOf(String s);
    public int getInt() {
        try {
//            return sc.nextInt();
            return Integer.valueOf(getString());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Enter valid integer...");
            e.printStackTrace();
//            sc.next(); //this breaks the infinite loop This moves the scanner object forward from the previous input  OLD
            return getInt(); //infinite loop without the sc.next() to break the code from using the same info to test the loop
        }
    }


    public double getDouble(double min, double max) {
        boolean state = false;
        double userInput;
        do {
            userInput = sc.nextDouble();
            if (userInput <= max && userInput >= min) {
                state = true;
            } else {
                System.out.println("You entered an invalid input, please enter a decimal: ");
            }
        } while (!state);
        System.out.println("Thanks for a valid decimal!");
        return userInput;
    }

    public double getDouble() {
//        double userInput = sc.nextDouble();
//        return userInput;
        try {
            return Double.valueOf(getString());
        } catch(NumberFormatException e) {
            System.out.println("Invalid input. Enter valid decimal...");
            e.printStackTrace();
            return getDouble();
        }
    }


    public String getBinary(){
        try{
            return Integer.toBinaryString(getInt());
        } catch(NumberFormatException e){
            System.out.println("Invalid input.  Enter valid integer...");
            e.printStackTrace();
            return getBinary();
        }
    }

    public static int convertBinary(int bin){
        try{
            return Integer.parseInt(String.valueOf(bin), 2);
        }catch(NumberFormatException e){
            System.out.println("Invalid input.  Enter valid integer...");
            e.printStackTrace();
            return convertBinary(bin);
        }
    }

    public String getHex(){
        try{
            return Integer.toHexString(getInt());
        } catch(NumberFormatException e){
            System.out.println("Invalid input. Enter a valid integer...");
            e.printStackTrace();
            return getHex();
        }
    }

    public static int convertHex(int hex){
        try{
            return Integer.parseInt(String.valueOf(hex), 2);
        }catch(NumberFormatException e){
            System.out.println("Invalid input.  Enter valid integer...");
            e.printStackTrace();
            return convertHex(hex);
        }
    }

    public static void main(String[] args) {

//        Input in = new Input();
//
//
//        System.out.println("Enter an integer: ");
//       String hex = in.getHex();
//        System.out.println("Hex value is " + hex);
//
//
//
////        System.out.println("Enter an integer: ");
////        System.out.println(getBinary(in.getInt()));
//
//        System.out.println("Enter an integer: ");
//        String bin = in.getBinary();
//        System.out.println(bin);



    }




}
