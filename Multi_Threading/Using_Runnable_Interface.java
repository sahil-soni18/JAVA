package Multi_Threading;

// Example of using Runnable interface
class MyThread implements Runnable {
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

public class Using_Runnable_Interface {
    public static void main(String[] args) {
        // MyThread myThread = new MyThread();
        // Thread thread = new Thread(myThread);
        // OR
        Thread thread = new Thread(new MyThread());
        thread.start();
    }
}

// NOTE: This approach is preferred when the class already extends another class since Java doesn’t support multiple inheritance.
