package org.example.thread.producer_comsumer.warehouse;

public class Consumer implements Runnable{
    ShoeWhareHouse shoeWhareHouse ;

    public Consumer(ShoeWhareHouse shoeWhareHouse) {
        this.shoeWhareHouse = shoeWhareHouse;
    }

    @Override
    public void run() {
        Order o = shoeWhareHouse.fullfillOrder();
        System.out.println(o);
    }
}
