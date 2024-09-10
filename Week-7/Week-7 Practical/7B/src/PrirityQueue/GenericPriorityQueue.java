package PrirityQueue;
import java.util.Arrays;
import java.util.NoSuchElementException;

// Generic PriorityQueue class using a binary heap
public class GenericPriorityQueue<T extends Comparable<T>> {
    private T[] heap; // Array representation of the heap
    private int size; // Current number of elements in the heap
    private static final int DEFAULT_CAPACITY = 10; // Default initial capacity of the heap

    @SuppressWarnings("unchecked")
    public GenericPriorityQueue() {
        heap = (T[]) new Comparable[DEFAULT_CAPACITY];
        size = 0;
    }

    // Insert an element into the priority queue
    public void offer(T element) {
        if (size == heap.length) {
            resizeHeap();
        }
        heap[size] = element;
        size++;
        heapifyUp(size - 1);
    }

    // Remove and return the element with the highest priority
    public T poll() {
        if (isEmpty()) {
            throw new NoSuchElementException("Priority queue is empty.");
        }
        T result = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapifyDown(0);
        return result;
    }

    // Return the element with the highest priority without removing it
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Priority queue is empty.");
        }
        return heap[0];
    }

    // Check if the priority queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Resize the heap array when it reaches capacity
    @SuppressWarnings("unchecked")
    private void resizeHeap() {
        T[] newHeap = (T[]) new Comparable[heap.length * 2];
        System.arraycopy(heap, 0, newHeap, 0, heap.length);
        heap = newHeap;
    }

    // Maintain the heap property after inserting an element
    private void heapifyUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            if (heap[index].compareTo(heap[parentIndex]) >= 0) {
                break;
            }
            swap(index, parentIndex);
            index = parentIndex;
        }
    }

    // Maintain the heap property after removing the root element
    private void heapifyDown(int index) {
        while (index < size) {
            int leftChildIndex = 2 * index + 1;
            int rightChildIndex = 2 * index + 2;
            int smallest = index;

            if (leftChildIndex < size && heap[leftChildIndex].compareTo(heap[smallest]) < 0) {
                smallest = leftChildIndex;
            }

            if (rightChildIndex < size && heap[rightChildIndex].compareTo(heap[smallest]) < 0) {
                smallest = rightChildIndex;
            }

            if (smallest == index) {
                break;
            }

            swap(index, smallest);
            index = smallest;
        }
    }

    // Swap two elements in the heap array
    private void swap(int i, int j) {
        T temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
}
