package com.scaler.ProducerConsumer.ProducerConsumerV1;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {

    private Store store;
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;

    public Consumer(Store store, Semaphore producerSemaphore, Semaphore consumerSemaphore){

        this.store = store;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }

    @Override
    public void run() {

        System.out.println("Consumer is running");

        while(true){

            //synchronized(store) {

               // if (!store.getItems().isEmpty()) {

                 // store.consume(store.getItems());
             //  }

            //}

            try{

                consumerSemaphore.acquire();
            }
            catch(InterruptedException e){

                throw new RuntimeException(e);
            }

            store.consume(store.getItems());
            producerSemaphore.release();
        }
    }
}
