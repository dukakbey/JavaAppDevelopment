package org.example.udemy.thread.producer_comsumer.warehouse.rawthread;

public class Order {
    private int id;
    private ShoeType shoeType;
    private int quantity;

    public Order(int id, ShoeType shoeType, int quantity) {
        this.id = id;
        this.shoeType = shoeType;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ShoeType getShoeType() {
        return shoeType;
    }

    public void setShoeType(ShoeType shoeType) {
        this.shoeType = shoeType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.format("""
                [id:%s  shoetype:%s  quantity:%s]
                """,id,shoeType,quantity);
    }
}
