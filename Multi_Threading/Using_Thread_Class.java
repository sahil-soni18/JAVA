package Multi_Threading;


/*
 * What is Multithreading?
Thread: A lightweight sub-process. Multiple threads run independently but share the same memory space.
Multithreading: Enables a program to perform multiple tasks concurrently, improving efficiency.
Key Concepts
Creating Threads:

By extending the Thread class.
By implementing the Runnable interface.
Thread Lifecycle:

New → Runnable → Running → Terminated.
A thread can also move to Blocked/Waiting state.
Synchronization:

Ensures that shared resources are accessed by one thread at a time to avoid inconsistency.
 */


 class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + i);
            try {
                Thread.sleep(1000); // Sleep for 500ms
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
 }

public class Using_Thread_Class {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
