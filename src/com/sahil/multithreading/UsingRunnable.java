package com.sahil.multithreading;

public class UsingRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; ; ++i){
            System.out.println("Runnable Saini - " + Thread.currentThread().getName() + " "+ System.currentTimeMillis());
        }
    }
}
