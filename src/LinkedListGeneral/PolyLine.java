package LinkedListGeneral;

public class PolyLine {

    private LinkedList polyline;

    // construct a polyline from an array of coordinates pairs
    public PolyLine(double[][] coords){
        Point[] points = new Point[coords.length];  // array to hold points
        this.polyline = new LinkedList();

        // create points from the coordinates
        for (int i = 0; i < coords.length; i++){
            points[i] = new Point(coords[i][0], coords[i][1]);
        }

        // create a polyline from an array of points
        polyline = new LinkedList(points);
    }

    // construct a polyline from an array of points
    public PolyLine(Point[] points){
        polyline = new LinkedList(points);
    }

    // Add point to the list
    public void addPoint(Point point){
        polyline.addItem(point);
    }

    // Add point from a coordinate pair to the list
    public void addPoint(double x, double y){
        polyline.addItem(new Point(x, y));
    }

    // String representation of a polyline
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("Polyline: ");
        Point point = (Point) polyline.getFirst();   // set the first point as start

        while (point != null){
            str.append(" (" + point + ") " );
            point = (Point) polyline.getNext();
        }

        return str.toString();

    }

}
