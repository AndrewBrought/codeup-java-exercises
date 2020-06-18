package shapes;


public class Square extends Quadrilateral{
//    public Square(double length, double width) {
//        super(length, width);
//    }

    public Square(double s) {
        super(s, s);
    }

//    ====== Interfaces And Polymorphism Exercise
//    public Square(double side){
//        super(side,side);
//    }
//
//    public double getArea(){
//        System.out.println("In square");
//        return Math.pow(width, 2);
//    }
//
//    public double getPerimeter(){
//        System.out.println("In square");
//        return 4 * width;
//    }

//    ======== Interface and Abstract Exercise


    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 4 * width;
    }

    @Override
    public double getArea() {
        return Math.pow(width, 2);
    }
}
