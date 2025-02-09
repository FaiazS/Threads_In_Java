package com.scaler.JavaMultiThreadingAndConcurrency3;

import com.scaler.JavaMultiThreadingAndConcurrency1.Value;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {

    com.scaler.JavaMultiThreadingAndConcurrency1.Value value;


    public Adder(Value value, Lock lock) {

        this.value = value;


    }

    @Override
    public Void call() throws Exception {

        for(int i = 1; i <= 100; i++){

            value.addValue(i);
            System.out.println(value.getValue());

        }

        return null;

    }
}
