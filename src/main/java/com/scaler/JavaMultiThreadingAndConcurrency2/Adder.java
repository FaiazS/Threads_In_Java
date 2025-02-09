package com.scaler.JavaMultiThreadingAndConcurrency2;

import com.scaler.JavaMultiThreadingAndConcurrency1.Value;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {

    Value value;


    public Adder(Value value) {

        this.value = value;


    }

    @Override
    public Void call() throws Exception {

        for(int i = 1; i <= 100; i++){

            System.out.println(i + ": " + value);
            synchronized (value) {

                 value.setValue(value.getValue() + i);

             }
        }

        return null;

    }
}
