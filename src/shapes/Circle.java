package shapes;

public class Circle {

    private double radius;
    private static int circleCounter;

    public Circle(double radius) {

        getCircleCounter();
        System.out.println("You created " + circleCounter + " circle(s)");
    }



    public double getArea(double radius) {
        return Math.PI * (radius * radius);
    }


    public double getCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static int getCircleCounter(){
       return circleCounter++;
    }


}