package org.sceylan.udemy.thread.producer_comsumer.warehouse_orig;

import java.util.Random;

record Order(long orderId, String item, int qty) {
};

public class App {

    private static final Random random = new Random();

    public static void run() {

        ShoeWarehouse warehouse = new ShoeWarehouse();
        Thread producerThread = new Thread(() -> {
            for (int j = 0; j < 10; j++) {
                warehouse.receiveOrder(new Order(
                        random.nextLong(1000000, 9999999),
                        ShoeWarehouse.PRODUCT_LIST[random.nextInt(0, 5)],
                        random.nextInt(1, 4)));
            }
        });
        producerThread.start();

        for (int i = 0; i < 2; i++) {
            Thread consumerThread = new Thread(() -> {
                for (int j = 0; j < 5; j++) {
                    Order item = warehouse.fulfillOrder();
                }
            });
            consumerThread.start();
        }
    }
}
