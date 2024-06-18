package LinkedList;

public class Point {

    // coordinate the Point
    public double xVal;
    public double yVal;


    //constructors : create a point from its coordinates
    public Point(double xVal, double yVal) {
        this.xVal = xVal;
        this.yVal = yVal;
    }

    //constructors : create a point from another point
    public Point(Point pointIn) {
        xVal = pointIn.xVal;
        yVal = pointIn.yVal;
    }

    @Override
    public String toString() {
        return "Point [xVal=" + xVal + ", yVal=" + yVal + "]";
    }

}
