// Filename: LinkedStack.java
// Description: LinkNode class representing a node in a linked list
// Author: Sergio Martinez Sanz
// Date Modified: 04/17/2026

public abstract class LinkedStack<E> implements Stack<E> {

    //the top ListNode in the Stack
    protected  ListNode<E> top;

    //The Stack is initially empty
    public LinkedStack() {
        top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public E peek() {
        if (isEmpty()) {
            throw new RuntimeException();
        }
        return top.getItem();
    }

    public E pop() {
        if (isEmpty()) {
            throw new RuntimeException();
        }
        E result = top.getItem();
        top = top.getNext();
        return result;
    }

    public void push(E target) {
        top = new ListNode<E>(target, top);
    }

    @Override
    public String toString() {
        String result = "";
        ListNode<E> current = top;

        while (current != null) {
            result += current.getItem();
            if (current.getNext() != null) {
                result += " -> ";
            }
            current = current.getNext();
        }

        return result;
    }

    public void swap(int index1, int index2) {
        ListNode<E> node1 = null;
        ListNode<E> node2 = null;
        ListNode<E> current = top;

        int i = 0;

        while (current != null) {
            if (i == index1) {
                node1 = current;
            }
            if (i == index2) {
                node2 = current;
            }
            current = current.getNext();
            i++;
        }

        // Make sure both were found
        if (node1 == null || node2 == null) {
            throw new IndexOutOfBoundsException();
        }

        // Swap values
        E temp = node1.getItem();
        node1.setItem(node2.getItem());
        node2.setItem(temp);
    }
}
