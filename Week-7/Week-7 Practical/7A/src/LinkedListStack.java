// Stack implementation using a linked list
class LinkedListStack<T> implements Stack<T> {
    // Inner class representing a node in the linked list
    private static class Node<T> {
        T data;
        Node<T> next;
        Node(T data) {
            this.data = data;
        }
    }

    private Node<T> top; // Top of the stack

    // Push an element onto the stack
    @Override
    public void push(T element) {
        Node<T> newNode = new Node<>(element);
        newNode.next = top; // New node points to the old top
        top = newNode;      // Update top to the new node
    }

    // Pop an element from the stack
    @Override
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty.");
        }
        T data = top.data;
        top = top.next; // Remove the top element
        return data;
    }

    // Peek at the top element without removing it
    @Override
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty.");
        }
        return top.data;
    }

    // Check if the stack is empty
    @Override
    public boolean isEmpty() {
        return top == null;
    }
}
