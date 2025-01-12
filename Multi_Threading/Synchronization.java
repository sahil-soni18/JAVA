package Multi_Threading;

// Why Synchronization?
// To prevent race conditions, where multiple threads access and modify shared data simultaneously.

class Counter {
    private int count = 0; // Shared resource

    public synchronized void increment() { // Synchronized to prevent race conditions
        count++; // Increment count
    }

    public int getCount() { // Read-only, no need for synchronization
        return count;
    }
}


public class Synchronization {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread t1 = new Thread(() -> { // Lambda for thread logic
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join(); // Ensure t1 finishes before proceeding
            t2.join(); // Ensure t2 finishes before proceeding
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }

        System.out.println("Final Count: " + counter.getCount());
    }
}


