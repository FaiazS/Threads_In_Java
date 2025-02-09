package com.scaler.JavaMultiThreadingAndConcurrency2;

public class Value {

    private int value = 0;

    public Value(int value) {

        this.value = value;
    }

    public void setValue(int value){

        this.value = value;

    }
    public int getValue(){

        return value;
    }
}
