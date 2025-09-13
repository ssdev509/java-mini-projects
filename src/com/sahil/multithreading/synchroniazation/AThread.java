package com.sahil.multithreading.synchroniazation;

import java.math.BigInteger;

public class AThread extends Thread{
    Multiplier multiplier;

    public AThread(Multiplier multiplier){
        this.multiplier = multiplier;
    }
    @Override
    public void run() {
        for(int i = 0; i < 5; ++i){
            System.out.println(Thread.currentThread().getName() + " - " + multiplier.getI());
            multiplier.multiply(new BigInteger("2"));
            System.out.println(Thread.currentThread().getName() + " - " + multiplier.getI() + " after");
        }
    }
}
