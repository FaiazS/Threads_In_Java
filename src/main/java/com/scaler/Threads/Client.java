package com.scaler.Threads;

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
    }
}
