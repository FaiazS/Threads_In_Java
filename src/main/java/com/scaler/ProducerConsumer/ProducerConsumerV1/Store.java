package com.scaler.ProducerConsumer.ProducerConsumerV1;

import java.util.concurrent.ConcurrentLinkedDeque;

public class Store {

    private ConcurrentLinkedDeque<Object> items = new ConcurrentLinkedDeque<>();
    private final int maxSize = 10;


    public synchronized void consume(Object item) {

        System.out.println("Consuming " + item + " from list" + Thread.currentThread().getName());
        items.remove(item);
    }

    public synchronized void produce(Object item) {

        System.out.println("Producing " + item + " to list" + Thread.currentThread().getName());
        items.add(item);
    }

    public int getMaxSize(){

        return maxSize;
    }

    public ConcurrentLinkedDeque<Object> getItems(){

        return items;
    }
}
