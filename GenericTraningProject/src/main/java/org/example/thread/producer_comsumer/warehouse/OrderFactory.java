package org.example.thread.producer_comsumer.warehouse;

import org.example.thread.producer_comsumer.warehouse.Order;

import java.util.Random;

public class OrderFactory {
    private Order order;
    private static int id = 0;
    private static Random r = new Random();
    private static ShoeType getType()
    {
        int num = r.nextInt(1,4);

        switch (num)
        {
            case 1:
                return ShoeType.Jump;
            case 2:
                return ShoeType.Adidas;
            case 3:
                return ShoeType.Nike;
            default:
                return ShoeType.Puma;
        }
    }
    public static Order getOrder()
    {
        ++id;
        return new Order(id, getType(),r.nextInt(1,50));
    }

}
