// Generic interface for a stack data structure
interface Stack<T> {
    void push(T element);    // Push an element onto the stack
    T pop();                 // Pop an element from the stack
    T peek();                // Peek at the top element without removing it
    boolean isEmpty();       // Check if the stack is empty
}
