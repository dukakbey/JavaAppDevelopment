package org.example.thread.producer_comsumer.warehouse;



public class App {
    public static void run()
    {
        ShoeWhareHouse whareHouse = new ShoeWhareHouse();
        Consumer c1 = new Consumer(whareHouse);
        Consumer c2 = new Consumer(whareHouse);
        Consumer c3 = new Consumer(whareHouse);

        OrderGenerator p1 = new OrderGenerator(whareHouse);

        Thread producer = new Thread(p1);
        Thread t2 = new Thread(c1);
        Thread t3 = new Thread(c2);
        Thread t4 = new Thread(c3);

        producer.start();
        t2.start();t3.start();t4.start();
    }
}
