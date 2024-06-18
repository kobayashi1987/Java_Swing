package LinkedList;

public class ListPoint {
    // fields, attributes

    public Point point;
    public ListPoint next;

    // constructor
    public ListPoint(Point point) {
        this.point = point;
        this.next = null;
    }

    // setNext, set the pointer to the next next ListPoint
    public void setNext(ListPoint next) {
        this.next = next;
    }

    // getNext: get the next point in the list
    public ListPoint getNext(){
        return this.next;
    }

    @Override
    public String toString() {
        return "(" + point + ")";
    }
}
