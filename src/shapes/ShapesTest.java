package shapes;

public class ShapesTest {

    public static void main(String[] args) {
        //    ====== Interfaces And Polymorphism Exercise
//        Rectangle box1 = new Rectangle(4, 5);
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());

        //    ======== Interface and Abstract Exercise

        Measurable myShape = new Square(5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        Measurable myShape2 = new Rectangle(4,5);
        System.out.println(myShape2.getArea());
        System.out.println(myShape2.getPerimeter());
//        These will fail, myShape type is Measurable...
//        System.out.println(myShape.getLength());


//        Quadrilateral is your toolbox
//        Methods you have available are determined by the type of variable
//        the implementations (the way you use the tools) is determined by the instance of object
//        Quadrilateral myShape3 = new Rectangle(3,2);
//        Cannot get the color because we are of a Quadrilateral type
//

//        This is how we are setting specific properties on an object
//        Rectangle myRectangle = new Rectangle(4,5);
//        System.out.println(myRectangle.getColor());
//      Then we are able to instantiate a new type with different tools on the same shape...
//        Quadrilateral myShape3 = myRectangle;
//        myShape3.getPerimeter();

    }
}
