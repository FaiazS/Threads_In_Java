package com.scaler.JavaMultiThreadingAndConcurrency3;

import com.scaler.JavaMultiThreadingAndConcurrency1.Value;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {

    com.scaler.JavaMultiThreadingAndConcurrency1.Value value;


    public Subtractor(Value value) {

        this.value = value;

    }

    @Override
    public Void call() throws Exception {

        for(int i = 1; i <= 100; i++){

            value.subtractValue(i);
            System.out.println("Subtractor: " + i);

        }

        return null;
    }
}
