package com.scaler.Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {

    public static void main(String[] args) {

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
    }
}
