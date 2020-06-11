package shapes;

public class Circle {

    private double radius;
    private static int circleCounter;

    public Circle(double radius) {
        this.radius = radius;
        getCircleCounter();
//        System.out.println("You created " + circleCounter + " circle(s)");
    }


//These are instances methods, determined by the defined radius

    public double getArea() {
        return Math.PI * (Math.pow(radius, 2));
    }


    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public static int getCircleCounter(){
       return circleCounter++;
    }


}