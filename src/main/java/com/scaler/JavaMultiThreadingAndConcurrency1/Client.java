package com.scaler.JavaMultiThreadingAndConcurrency1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

    public static void main(String[] args) throws ExecutionException, InterruptedException{

        Runnable addAndPrintSum = new PrintSum();

        Thread thread = new Thread(addAndPrintSum);

        thread.start();

        Runnable addAndPrintNSum = new NSum(252);

        Thread thread1 = new Thread(addAndPrintNSum);

        thread1.start();

         int number = 252;

         for(int i = 1; i <= number; i++){

             Thread thread2 = new Thread(new NumberPrinter(i));
             thread2.start();
         }

         ExecutorService executorService = Executors.newFixedThreadPool(5);

         for(int i = 1; i <= number; i++){

             executorService.execute(new Thread(new NumberPrinter(i)));
         }

         ExecutorService fibonacciExecutorService = Executors.newCachedThreadPool();

         Future<Integer> finalFibonacciNum = fibonacciExecutorService.submit(new NthFibonacciNumber(25, fibonacciExecutorService));

         System.out.println("Fibonacci Output : " +  finalFibonacciNum.get());

    }
}
