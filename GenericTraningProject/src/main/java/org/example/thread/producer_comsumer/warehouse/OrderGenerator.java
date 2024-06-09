package org.example.thread.producer_comsumer.warehouse;

public class OrderGenerator implements Runnable{
    private ShoeWhareHouse warehouse;

    public OrderGenerator(ShoeWhareHouse shoeWhareHouse) {
        this.warehouse = shoeWhareHouse;
    }

    @Override
    public void run()
    {
        warehouse.receiveOrder(OrderFactory.getOrder());
    }
}
