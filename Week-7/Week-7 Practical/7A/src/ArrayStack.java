// Stack implementation using an array
class ArrayStack<T> implements Stack<T> {
    private static final int INITIAL_CAPACITY = 10; // Initial capacity of the array
    private T[] array;  // Array to hold stack elements
    private int top;    // Index of the top element

    @SuppressWarnings("unchecked")
    public ArrayStack() {
        array = (T[]) new Object[INITIAL_CAPACITY]; // Generic array creation
        top = -1; // Stack is initially empty
    }

    // Push an element onto the stack
    @Override
    public void push(T element) {
        if (top == array.length - 1) { // If array is full, double its size
            resizeArray();
        }
        array[++top] = element; // Increment top and add element
    }

    // Pop an element from the stack
    @Override
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty.");
        }
        return array[top--]; // Return the top element and decrement top
    }

    // Peek at the top element without removing it
    @Override
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty.");
        }
        return array[top];
    }

    // Check if the stack is empty
    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    // Resize the array when it is full
    @SuppressWarnings("unchecked")
    private void resizeArray() {
        T[] newArray = (T[]) new Object[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }
}
