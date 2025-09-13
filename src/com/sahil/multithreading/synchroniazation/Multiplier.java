package com.sahil.multithreading.synchroniazation;

import java.math.BigInteger;
public class Multiplier {
    private BigInteger i = new BigInteger("1");

//    public synchronized void multiply(BigInteger multiplicand){
//        i = i.multiply(multiplicand);
//    }

//    OR

    public  void multiply(BigInteger multiplicand){
        synchronized (this) {
            i = i.multiply(multiplicand);
        }
    }

    public BigInteger getI() {
        return i;
    }
}
