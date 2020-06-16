package shapes;

abstract class Quadrilateral extends Shape implements Measurable{

    protected double length;
    protected double width;

    public Quadrilateral(double length, double width){
        this.length = length;
        this.width = width;
    }

    abstract void setLength(double length);

    public double getLength(){
        return length;
    }

    abstract void setWidth(double width);

    public double getWidth(){
        return width;
    }


}
