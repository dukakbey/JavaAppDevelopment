package org.sceylan.udemy.thread.executer.warehouse;

public class Consumer implements Runnable{
    ShoeWhareHouse shoeWhareHouse ;
    private int fullfillCount = 5;

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

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < fullfillCount; i++) {
            Order o = shoeWhareHouse.fullfillOrder();
            System.out.printf(Thread.currentThread().getName() + " Fullfilled: %s",o);
        }
    }
}
