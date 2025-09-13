package com.sahil.multithreading;

public class ExtendsThread extends Thread{
    public void run() {
        for (int i = 0; ; ++i){
            System.out.println("Saini - " + this.getName() + " "+ System.currentTimeMillis());
        }
    }
}
