package com.scaler.Threads;

public class Client {

    public static void main(String[] args) {

        Runnable addAndPrintSum = new PrintSum();

        Thread thread = new Thread(addAndPrintSum);

        thread.start();

    }
}
