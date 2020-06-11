import util.Input;

public class InputTest {
    public static void main(String[] args){

        System.out.println("Welcome!");
        Input in = new Input();
        System.out.println("What's your favorite color?");
        String color = in.getString();
        System.out.println("Good choice! " + color + " is a great color!");
        System.out.println("Please enter a number between 1 and 10: ");
        int number = in.getInt(1,10);
        System.out.println("The number you entered is: " + number);
        System.out.println("Please enter y or n: ");
        boolean response = in.yesNo();
        System.out.println("Your input is: " + response);
        System.out.println("Please enter a decimal between 1.0 and 10.0: ");
        double decimal = in.getDouble(1.0, 10.0);
        System.out.println("The decimal you entered is: " + decimal);

    }

}
