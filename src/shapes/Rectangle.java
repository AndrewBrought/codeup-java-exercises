package shapes;



public class Rectangle extends Quadrilateral implements Measurable{
    String color = "blue";

    public Rectangle(double length, double width) {
        super(length, width);
    }
//    ====== Interfaces And Polymorphism Exercise
//        protected double width;
//        protected double length;
//
//        public Rectangle(){
//        }
//
//    public Rectangle(double width, double length){
//        this.width = width;
//        this.length = length;
//    }
//
//    public double getPerimeter(){
//        return 2 * length + 2 * width;
//    }
//
//    public double getArea(){
//        return length * width;
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
//        return 2 * length + 2 * width;
        return (2 * length) + (2 * width);
    }

    @Override
    public double getArea() {
        return length * width;
    }


    public String getColor(){
        return color;
    }


}

