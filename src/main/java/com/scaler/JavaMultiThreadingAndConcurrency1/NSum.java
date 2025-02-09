package com.scaler.JavaMultiThreadingAndConcurrency1;

public class NSum implements Runnable {

    int num;

    public NSum(int num) {

        this.num = num;
    }

    public void addAndPrintNSum(int num){

        int sum = 0;

        for(int i = 1; i <= num; i++){

            sum += i;
        }

        System.out.println("Final N Sum : " + sum);
    }

    @Override
    public void run() {

        addAndPrintNSum(num);
    }
}
