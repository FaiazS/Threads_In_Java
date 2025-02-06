package com.scaler.Threads;

public class Client {

    public static void main(String[] args) {

        Runnable addAndPrintSum = new PrintSum();

        Thread thread = new Thread(addAndPrintSum);

        thread.start();

        Runnable addAndPrintNSum = new NSum(252);

        Thread thread1 = new Thread(addAndPrintNSum);

        thread1.start();

    }
}
