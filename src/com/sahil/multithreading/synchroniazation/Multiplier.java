package com.sahil.multithreading.synchroniazation;

import java.math.BigInteger;
public class Multiplier {
    private BigInteger i = new BigInteger("1");

    public void multiply(BigInteger multiplicand){
        i = i.multiply(multiplicand);
    }

    public BigInteger getI() {
        return i;
    }
}
