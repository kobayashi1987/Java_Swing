package LinkedList;

public class PolyLine {

    // defines node head and end
    public ListPoint start;
    public ListPoint end;

    // construct a polyline from an array of points
    public PolyLine(Point[] points){
        if(points != null){
            for(Point p : points){
                addPoint(p);
            }
        }
    }

    // construct a poly line from an array of coordinates
    public PolyLine(double[][] coordinates){
        if(coordinates != null){
            for(int i = 0; i<coordinates.length; i++){
                addPoint(coordinates[i][0],coordinates[i][1]);
            }
        }
    }

    public void addPoint(Point point){
        ListPoint newEnd = new ListPoint(point);  // create a new ListPoint , Node
        if(start == null){
            start = newEnd;                       // start is the same as end
        }else {
            end.setNext(newEnd);                  // set next variable for old end as new end
        }

        end = newEnd;                             // set the new end
    }

    // String representation of a Polyline
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("Polyline:  ");
        ListPoint nextPoint = this.start;  // set the 1st point as start
        while(nextPoint != null){
            str.append(" " + nextPoint);
            nextPoint = nextPoint.getNext();
        }
        return str.toString();
    }

    // overload the addPoint method
    public void addPoint(double x, double y){
        addPoint(new Point(x,y));
    }



}
