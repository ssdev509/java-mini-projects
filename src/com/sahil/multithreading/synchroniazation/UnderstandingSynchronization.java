package com.sahil.multithreading.synchroniazation;

public class UnderstandingSynchronization {
    public static void main(String[] args) {
        Multiplier multiplier = new Multiplier();
        AThread t1 = new AThread(multiplier);
        AThread t2 = new AThread(multiplier);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        }catch (Exception e){

        }
        System.out.println(multiplier.getI());
        // Inconsistency...
//        Thread-1 - 1
//        Thread-0 - 1
//        Thread-0 - 2 after
//        Thread-0 - 2
//        Thread-0 - 4 after
//        Thread-0 - 4
//        Thread-0 - 8 after
//        Thread-1 - 2 after
//        Thread-1 - 8
//        Thread-0 - 8
//        Thread-1 - 16 after
//        Thread-1 - 32
//        Thread-1 - 64 after
//        Thread-0 - 32 after
//        Thread-1 - 64
//        Thread-1 - 128 after
//        Thread-1 - 128
//        Thread-0 - 128
//        Thread-1 - 256 after
//        Thread-0 - 512 after
//        512
    }
}
