package com.scaler.ProducerConsumer.ProducerConsumerV1;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable {

    private Store store;
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;

    public Producer(Store store, Semaphore producerSemaphore,Semaphore consumerSemaphore) {

        this.store = store;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;

    }

    @Override
    public void run(){

        System.out.println("Producer is running");

        while(true){

         //   synchronized(store) {

        //        if (store.getMaxSize() > store.getItems().size()) {

              //      store.produce(store.getItems());
          //      }

           // }

            try{

                producerSemaphore.acquire();
            }
            catch(InterruptedException e){

                throw new RuntimeException(e);
            }

            store.produce(store.getItems());
            consumerSemaphore.release();
        }
    }
}
