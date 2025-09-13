package com.sahil.multithreading;
public class UnderstandingInterrupt {
    public static void main(String[] args) throws InterruptedException {
        // Thread 1: sleeping thread
        Thread sleeper = new Thread(() -> {
            try {
                System.out.println("Sleeper: going to sleep for 5 sec...");
                Thread.sleep(5000);
                System.out.println("Sleeper: woke up naturally");
            } catch (InterruptedException e) {
                System.out.println("Sleeper: interrupted while sleeping!");
            }
        });

        // Thread 2: worker thread (loops until interrupted)
        Thread worker = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                // Simulate some work
            }
            System.out.println("Worker: noticed interrupt and stopped");
        });

        sleeper.start();
        worker.start();

        // Give them some time
        Thread.sleep(1000);

        System.out.println("Main: interrupting sleeper...");
        sleeper.interrupt(); // will throw InterruptedException inside sleeper

        System.out.println("Main: interrupting worker...");
        worker.interrupt(); // worker loop will notice and exit

        // Wait for both threads to finish
        sleeper.join();
        worker.join();

        System.out.println("Main: all threads finished");
    }
}

