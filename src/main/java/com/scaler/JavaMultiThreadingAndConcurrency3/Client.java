package com.scaler.JavaMultiThreadingAndConcurrency3;

import com.scaler.JavaMultiThreadingAndConcurrency1.Adder;
import com.scaler.JavaMultiThreadingAndConcurrency1.Subtractor;
import com.scaler.JavaMultiThreadingAndConcurrency1.Value;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {

    public static void main(String[] args) throws Exception {

        com.scaler.JavaMultiThreadingAndConcurrency1.Value value = new Value(100);

        Adder adder = new Adder(value);
        Subtractor subtractor = new Subtractor(value);

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future<Void> firstAdder = executorService.submit(adder);
        Future<Void> firstSubtractor = executorService.submit(subtractor);

        firstAdder.get();
        firstSubtractor.get();

        System.out.println("Output :" +  value.getValue());

    }
}
