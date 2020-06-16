package shapes;



public class Square extends Rectangle {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square(double side){
        super(side,side);
    }

//    public Square(double side){
//        this.side = side;
//    }

    public double getArea(){
        return Math.pow(width, 2);
    }

    public double getPerimeter(){

        return 4 * width;
    }

//    public double getArea(){
//        return Math.pow(side, 2);
//    }
//
//    public double getPerimeter(){
//        return 4 * side;
//    }

}
