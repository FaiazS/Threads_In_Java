package com.scaler.Threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NthFibonacciNumber implements Callable<Integer> {

    int n;
    ExecutorService executorService;

    public NthFibonacciNumber(int n, ExecutorService executorService) {

        this.n = n;
        this.executorService = executorService;

    }

    @Override

    public Integer call() throws Exception {

        if(n == 0 || n == 1){

            return n;
        }

        Future<Integer> firstNum = executorService.submit(new NthFibonacciNumber(n - 1, executorService));

        Future<Integer> secondNum = executorService.submit(new NthFibonacciNumber(n - 2, executorService));

        int num1 = firstNum.get();

        int num2 = secondNum.get();

        int nextFibonacciNumber = num1 + num2;

        return nextFibonacciNumber;
    }
}
