package shapes;



public class Square extends Rectangle {


    public Square(double side){
        super(side,side);
    }

    public double getArea(){
        System.out.println("In square");
        return Math.pow(width, 2);
    }

    public double getPerimeter(){
        System.out.println("In square");
        return 4 * width;
    }


}
