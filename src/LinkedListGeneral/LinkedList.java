package LinkedListGeneral;

import org.w3c.dom.Node;

public class LinkedList {

    private ListItem start = null;
    private ListItem end = null;
    private ListItem current = null;

    // Default constructor -- create an empty list
    public LinkedList(){}

    // Constructor to create  a list containing one object
    public LinkedList(Object item){
        if(item != null){
            current = end = start = new ListItem(item);
        }
    }

    // Construct a linked list from an array of objects
    public LinkedList(Object[] items){
        if(items != null){
            // Add the item to the list
            for(Object item : items){
                addItem(item);
            }
            current = start;
        }
    }

    // add an item object to the list
    public void addItem(Object item){
        ListItem temp = new ListItem(item);
        if(start == null){
            start = end = temp;
        } else {
            end.next = temp;
            end = temp;
        }
    }

    // get the first item in the list
    public Object getFirst(){
        current = start;
        return start == null ? null : start.item;
    }

    //get the next object in the list
    public Object getNext(){
        if(current == null){
            current = current.next;
        }
        return current == null ? null : current.item;
    }


    private class ListItem {
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
}
