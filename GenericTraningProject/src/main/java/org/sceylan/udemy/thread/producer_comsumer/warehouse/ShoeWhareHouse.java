package org.sceylan.udemy.thread.producer_comsumer.warehouse;

import java.util.LinkedList;
import java.util.List;

public class ShoeWhareHouse
{
    public List<Order> orders = new LinkedList<>();
    public static List<Shoe> productList;
    final int orderCapacity = 10;
    public synchronized void receiveOrder(Order order)
    {
        while(orders.size()>orderCapacity)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        orders.add(order);
        notifyAll();

    }
    public synchronized Order fullfillOrder()
    {
        while(orders.isEmpty())
        {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        Order order = orders.remove(0);
        notifyAll();
        return order;
    }


}
