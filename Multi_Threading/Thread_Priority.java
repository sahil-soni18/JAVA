package Multi_Threading;


// Set thread priorities to control the order of execution.

public class Thread_Priority {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> System.out.println("Thread 1 executed"));
        Thread t2 = new Thread(() -> System.out.println("Thread 2 executed"));

        t1.setPriority(Thread.MIN_PRIORITY); // Set lowest priority
        t2.setPriority(Thread.MAX_PRIORITY); // Set highest priority

        t1.start();
        t2.start();
    }
}


/*
 * Thread Priority: Determines the order in which threads are scheduled.
Thread.MIN_PRIORITY = 1 (lowest priority).
Thread.MAX_PRIORITY = 10 (highest priority).
Default priority is 5.
Priority in Practice: While higher-priority threads are more likely to execute first, actual scheduling depends on the JVM and OS.
 */