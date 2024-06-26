package org.example.udemy.thread.producer_comsumer.warehouse.rawthread;

import java.util.LinkedList;
import java.util.List;

public class ShoeWhareHouse
{
    public List<Order> orders = new LinkedList<>();
    private boolean status = true;
    public static List<Shoe> productList;
    final int orderCapacity = 10;
    public  void receiveOrder(Order order)
    {
        while(!status && orders.size()>orderCapacity)
        {

        }
        orders.add(order);
        status = false;

    }
    public Order fullfillOrder()
    {
        while(orders.isEmpty() && status)
        {

        }
        status = true;
        return orders.remove(0);
    }


}
