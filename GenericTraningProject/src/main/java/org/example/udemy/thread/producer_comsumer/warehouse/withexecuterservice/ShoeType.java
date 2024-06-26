package org.example.udemy.thread.producer_comsumer.warehouse.withexecuterservice;

public enum ShoeType {
    Adidas(0),
    Nike(1),
    Jump(2),
    Puma(3);

    int id;
    ShoeType(int id) {
        this.id = id;
    }
}
