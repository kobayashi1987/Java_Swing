package LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("LinkedList");
        // create an array of coordinates pairs
        double[][] coordinates = new double[][]{{1,2},{3,4},{5,6},{7,8},{9,10},{11,12}};

        //Create a polyline from the coordinates and display it
        PolyLine polygon = new PolyLine(coordinates);
        System.out.println(polygon);
        // add a point and display the polyline again
        polygon.addPoint(22,23);
        System.out.println(polygon);

        // create Point objects from the coordinates array
        Point[] points = new Point[coordinates.length];
        for (int i = 0; i < coordinates.length; i++) {
            points[i] = new Point(coordinates[i][0], coordinates[i][1]);
        }

        // use the points to create a new polyline
        PolyLine polygon2 = new PolyLine(points);
        System.out.println(polygon2);
    }
}
