package org.example.udemy.thread.producer_comsumer.warehouse.withexecuterservice;

public class Consumer implements Runnable{
    ShoeWhareHouse shoeWhareHouse ;

    public Consumer(ShoeWhareHouse shoeWhareHouse) {
        this.shoeWhareHouse = shoeWhareHouse;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        while(!shoeWhareHouse.orders.isEmpty())
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Order o = shoeWhareHouse.fullfillOrder();
            System.out.printf("outcoming item: %s",o);
        }
    }
}
