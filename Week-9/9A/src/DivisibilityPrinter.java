import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DivisibilityPrinter {

    private static final int MAX_NUMBER = 15;
    private static Lock lock = new ReentrantLock();
    private static int currentNumber = 1;

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(5);


        executor.submit(DivisibilityPrinter::printTwo);
        executor.submit(DivisibilityPrinter::printThree);
        executor.submit(DivisibilityPrinter::printFour);
        executor.submit(DivisibilityPrinter::printFive);
        executor.submit(DivisibilityPrinter::printNumber);

    
        executor.shutdown();
    }

    public static void printTwo() {
        while (true) {
            lock.lock();
            try {
                if (currentNumber > MAX_NUMBER) break;

                if (currentNumber % 2 == 0 && currentNumber % 3 != 0 && currentNumber % 4 != 0 && currentNumber % 5 != 0) {
                    System.out.println("Divisible by 2: " + currentNumber);
                }
                currentNumber++;
            } finally {
                lock.unlock();
            }
        }
    }

    public static void printThree() {
        while (true) {
            lock.lock();
            try {
                if (currentNumber > MAX_NUMBER) break;

                if (currentNumber % 3 == 0 && currentNumber % 4 != 0 && currentNumber % 5 != 0) {
                    System.out.println("Divisible by 3: " + currentNumber);
                }
                currentNumber++;
            } finally {
                lock.unlock();
            }
        }
    }

    public static void printFour() {
        while (true) {
            lock.lock();
            try {
                if (currentNumber > MAX_NUMBER) break;

                if (currentNumber % 4 == 0 && currentNumber % 5 != 0) {
                    System.out.println("Divisible by 4: " + currentNumber);
                }
                currentNumber++;
            } finally {
                lock.unlock();
            }
        }
    }

    public static void printFive() {
        while (true) {
            lock.lock();
            try {
                if (currentNumber > MAX_NUMBER) break;

                if (currentNumber % 5 == 0) {
                    System.out.println("Divisible by 5: " + currentNumber);
                }
                currentNumber++;
            } finally {
                lock.unlock();
            }
        }
    }

    public static void printNumber() {
        while (true) {
            lock.lock();
            try {
                if (currentNumber > MAX_NUMBER) break;

                if (currentNumber % 2 != 0 && currentNumber % 3 != 0 && currentNumber % 4 != 0 && currentNumber % 5 != 0) {
                    System.out.println("Number: " + currentNumber);
                }
                currentNumber++;
            } finally {
                lock.unlock();
            }
        }
    }
}
