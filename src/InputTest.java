import util.Input;

public class InputTest {
    public static void main(String[] args){

        Input in = new Input(); // This runs the constructor - in this case we're running a scanner object

        System.out.println("Welcome!");
        System.out.println("What's your favorite color?");
        String color = in.getString();
        System.out.println("Good choice! " + color + " is a great color!");

        System.out.println("Will you continue? Enter y or n: ");
        boolean yesNo = in.yesNo();
        System.out.println(yesNo);

        System.out.println("Either way... Enter your favorite number: ");
        int favNumber = in.getInt();
        System.out.println("Cool! " + favNumber + " is a good one!");

        System.out.println("Please enter a number between 1 and 10: ");
        int number = in.getInt(1,10);
        System.out.println("The number you entered is: " + number);

        System.out.println("Please enter your favorite decimal: ");
        double favDecimal = in.getDouble();
        System.out.println("Well done! " + favDecimal + " is an excellent decimal!");


        System.out.println("Please enter a decimal between 1.0 and 10.0: ");
        double decimal = in.getDouble(1.0, 10.0);
        System.out.println("The decimal you entered is: " + decimal);




    }

}
