package com.sahil.multithreading;

public class Test {
    public static void main(String[] args) {
        ExtendsThread newThread = new ExtendsThread();
//        newThread.start();
        UsingRunnable usingRunnable = new UsingRunnable();
        Thread thread = new Thread(usingRunnable);
        thread.start();
        for(int i = 0; ; ++i){
            System.out.println("Sahil - " + Thread.currentThread().getName() + " "+ System.currentTimeMillis());
        }
//        Proof of concurrent execution:
//        Saini - Thread-0 1757744530033
//        Sahil - main 1757744530033
//        Sahil - main 1757745149122
//        Runnable Saini - Thread-1 1757745149122
    }
}
