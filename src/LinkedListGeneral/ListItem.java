package LinkedListGeneral;

public class ListItem {
    // Attributes

    ListItem next;  // Refer to next item in the list
    Object item;    // the item for this ListItem

    // constructor
    public ListItem(Object item) {
        this.item = item;
        next = null;
    }

    // Return class name and object
    @Override
    public String toString() {
        return "ListItem" + item;
    }
}



