package com.scaler.JavaMultiThreadingAndConcurrency1;

public class PrintSum implements Runnable {

    public void printSum() {

        int sum = 0;

        for(int i = 1; i <= 100; i++) {

            System.out.println("Current Num being added :"  + i);

            sum += i;

            System.out.println("Final Sum : " + sum);

        }
    }

    @Override
    public void run() {

        printSum();

    }
}
