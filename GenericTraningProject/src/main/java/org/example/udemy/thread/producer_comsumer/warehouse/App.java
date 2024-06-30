package org.example.udemy.thread.producer_comsumer.warehouse;


public class App {
    public static void run()
    {
        ShoeWhareHouse whareHouse = new ShoeWhareHouse();
        Consumer c1 = new Consumer(whareHouse);


        Producer p1 = new Producer(whareHouse);

        Thread producer = new Thread(p1);
        Thread t2 = new Thread(c1);

        producer.start();
        t2.start();//t3.start();t4.start();
    }
}
