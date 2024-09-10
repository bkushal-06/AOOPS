package PrirityQueue;
public class Main {
    public static void main(String[] args) {
        // Test GenericPriorityQueue with Integer
        GenericPriorityQueue<Integer> intQueue = new GenericPriorityQueue<>();
        intQueue.offer(5);
        intQueue.offer(2);
        intQueue.offer(8);
        intQueue.offer(1);
        System.out.println("Integer Priority Queue:");
        while (!intQueue.isEmpty()) {
            System.out.println(intQueue.poll());
        }

        // Test GenericPriorityQueue with Double
        GenericPriorityQueue<Double> doubleQueue = new GenericPriorityQueue<>();
        doubleQueue.offer(5.5);
        doubleQueue.offer(2.2);
        doubleQueue.offer(8.8);
        doubleQueue.offer(1.1);
        System.out.println("\nDouble Priority Queue:");
        while (!doubleQueue.isEmpty()) {
            System.out.println(doubleQueue.poll());
        }

        // Test GenericPriorityQueue with String
        GenericPriorityQueue<String> stringQueue = new GenericPriorityQueue<>();
        stringQueue.offer("apple");
        stringQueue.offer("banana");
        stringQueue.offer("cherry");
        stringQueue.offer("date");
        System.out.println("\nString Priority Queue:");
        while (!stringQueue.isEmpty()) {
            System.out.println(stringQueue.poll());
        }
    }
}
