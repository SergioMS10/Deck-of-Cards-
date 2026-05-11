// Filename: Stack.java
// Description: Stack interface defining the operations of a last-in, first-out stack
// Author: Sergio Martinez Sanz
// Date Modified: 04/17/2026

// A last-in, first-out stack.
public interface Stack<E> {

    // Return true if this Stack is empty.
    public boolean isEmpty();

    // Return the top item on this Stack, but do not modify the Stack.
    // @throws RuntimeException if this Stack is empty.
    public E peek();

    // Remove and return the top item on this Stack.
    // @throws RuntimeException if this Stack is empty.
    public E pop();

    // Add target to the top of this Stack.
    public void push(E target);
}
