// Filename: ListNode.java
// Description: LinkNode class representing a node in a linked list
// Author: Sergio Martinez Sanz
// Date Modified: 04/17/2026

// Node in a linked list
public class ListNode<E> {

    // the item stored in this node
    private E item;

    //The node following this one
    private ListNode<E> next;

    //put item in a node with no next node
    public ListNode(E item) {
        this.item = item;
        next = null;
    }

    //Put item in a node with the specified next node
    public ListNode(E item, ListNode<E> next) {
        this.item = item;
        this.next = next;
    }

    //REturn the item stored in this node
    public E getItem() {
        return item;
    }

    //return the next node
    public ListNode<E> getNext() {
        return next;
    }

    //Replace the item stored in this node
    public void setItem(E item) {
        this.item = item;
    }

    //set the next node
    public void setNext(ListNode<E> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        if (item == null) {
            return "null";
        } else {
            return item.toString();
        }
    }
}
