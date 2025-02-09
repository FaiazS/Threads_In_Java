package com.scaler.JavaMultiThreadingAndConcurrency1;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {

    Value value;
    Lock lock;

    public Subtractor(Value value) {

        this.value = value;
        this.lock = lock;

    }

    @Override
    public Void call() throws Exception {

        for(int i = 1; i <= 100; i++){

            System.out.println("Subtractor: " + i);

            lock.lock();

            value.setValue(value.getValue() - i);

            lock.unlock();
        }

        return null;
    }
}
