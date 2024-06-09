package org.example.thread.producer_comsumer.warehouse;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ShoeWhareHouse
{
    private Queue<Order> orders = new LinkedList<>();
    public static List<Shoe> productList;
    final int orderCapacity = 10;
    public void receiveOrder(Order order)
    {
        while(orders.size()>orderCapacity)
        {

        }
        orders.add(order);
    }
    public Order fullfillOrder()
    {
        while(orders.isEmpty())
        {

        }
        return orders.poll();
    }


}
