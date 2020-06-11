package shapes;
import util.Input;

public class CircleApp {

    private static Object Circle;

    public static void main(String[] args) {

            Input in = new Input();  //am I creating new input?

        boolean loop;
        do{
        System.out.println("Please submit a radius between 1 - 20: ");
        double radius = in.getDouble(1.0, 20.0);
        Circle cir = new Circle(radius);
        System.out.println("Your radius is " + radius);
        System.out.printf("The circumference of your circle is: %.2f\n", cir.getCircumference(radius));
        System.out.printf("The area of your circle is: %.2f\n", cir.getArea(radius));

            System.out.println("Would you like to continue? Enter y or n: ");
            loop = in.yesNo();
            //set the boolean
            //boolean should be able to change to true
            //create a circle - will create, increment, print out a message
//            Input in = new Input();

        }while(loop == true);
        System.out.println("You created " + shapes.Circle.getCircleCounter() + " circles!");
    }
}

