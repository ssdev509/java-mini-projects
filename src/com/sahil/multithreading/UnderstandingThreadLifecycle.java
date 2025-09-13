package com.sahil.multithreading;

import java.util.concurrent.locks.LockSupport;

public class UnderstandingThreadLifecycle extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Running");
    }

    public static void main(String[] args) throws InterruptedException {
        UnderstandingThreadLifecycle understandingThreadLifecycle = new UnderstandingThreadLifecycle();
        System.out.println(understandingThreadLifecycle.getState());// NEW
        understandingThreadLifecycle.start();
        System.out.println(understandingThreadLifecycle.getState()); //RUNNABLE
        while (!understandingThreadLifecycle.getState().equals(State.TERMINATED)) {
            System.out.println(understandingThreadLifecycle.getState()); // CPU spinning happening here
        }
        System.out.println(understandingThreadLifecycle.getState());


    }
    /*
    public enum State {
        RUNNABLE,
        BLOCKED,
        WAITING,
        TIMED_WAITING,
        TERMINATED;
    }
    */
}
