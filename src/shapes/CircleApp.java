package shapes;
import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        Input inRadius = new Input();

        System.out.println("Please submit a radius between 1 - 20: ");
        double radius = inRadius.getDouble(1.0, 20.0);
        Circle cir1 = new Circle(radius);
        System.out.println("Your radius is " + radius);
        System.out.printf("The circumference of your circle is: %.2f\n", cir1.getCircumference(radius));
        System.out.printf("The area of your circle is: %.2f", cir1.getArea(radius));
    }
}

