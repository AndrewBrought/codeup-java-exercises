package shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4, 5);
        System.out.println(box1.getPerimeter());
        System.out.println(box1.getArea());

        Rectangle box2 = new Square(5);
        System.out.printf("%.2f\n", box2.getPerimeter());
        System.out.printf("%.2f", box2.getArea());
    }
}
