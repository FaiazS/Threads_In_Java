package com.scaler.JavaMultiThreadingAndConcurrency3;

public class Value {

    private int value = 0;

    public Value(int value) {

        this.value = value;
    }

    public synchronized void addValue(int value){

        this.value += value;


    }
    public synchronized void subtractValue(int value){

        this.value -= value;

    }
}
