package org.sceylan.udemy.thread.producer_comsumer.warehouse;

import java.util.Random;

public class Producer implements Runnable{
    private ShoeWhareHouse warehouse;
    public int receiveOrderCount = 10;
    private final Random r  = new Random();

    public Producer(ShoeWhareHouse shoeWhareHouse) {
        this.warehouse = shoeWhareHouse;
    }

    @Override
    public void run()
    {
        for (int i = 0; i < receiveOrderCount; i++) {
            Order o = OrderFactory.getOrder();
            warehouse.receiveOrder(o);
            System.out.printf(Thread.currentThread().getName()+" incoming order: %s",o);
        }
    }
}
