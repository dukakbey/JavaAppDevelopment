package org.sceylan.udemy.thread.producer_comsumer.warehouse;


public class App {
    public static void run()
    {
        int consumerCount = 2;
        ShoeWhareHouse whareHouse = new ShoeWhareHouse();

        Producer p1 = new Producer(whareHouse);
        Thread producer = new Thread(p1);
        producer.start();

        for (int i = 0; i < consumerCount; i++) {
            Thread consumer = new Thread(new Consumer(whareHouse));
            consumer.start();
        }
    }

}
