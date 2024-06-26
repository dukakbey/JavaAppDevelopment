package org.example.udemy.thread.producer_comsumer.warehouse.rawthread;

import java.util.Random;

public class Producer implements Runnable{
    private ShoeWhareHouse warehouse;
    private final Random r  = new Random();

    public Producer(ShoeWhareHouse shoeWhareHouse) {
        this.warehouse = shoeWhareHouse;
    }

    @Override
    public void run()
    {
        for (int i = 0; i < r.nextInt(10); i++) {
            Order o = OrderFactory.getOrder();
            warehouse.receiveOrder(o);
            System.out.printf("incoming item: %s",o);
        }
    }
}
