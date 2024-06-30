package org.sceylan.udemy.thread.executer.warehouse;


import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {
    public static void run()
    {
        int consumerCount = 2;
        ShoeWhareHouse whareHouse = new ShoeWhareHouse();

        Producer p1 = new Producer(whareHouse);
        Thread producer = new Thread(p1);
        producer.start();

        ExecutorService executorService = Executors.newFixedThreadPool(consumerCount);

        for (int i = 0; i < consumerCount; i++) {
            executorService.execute(new Consumer(whareHouse));
        }
        executorService.shutdown();
    }

}
