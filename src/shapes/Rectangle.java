package shapes;

public class Rectangle {
        protected double width;
        protected double length;

        public Rectangle(){

        }

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public double getArea(){
        return length * width;
    }

    public double getPerimeter(){
        return 2 * length + 2 * width;
    }

}

