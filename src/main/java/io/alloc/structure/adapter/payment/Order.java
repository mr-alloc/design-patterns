package io.alloc.structure.adapter.payment;

public class Order {
    private double total;

    public Order(double total) {
        this.total = total;
    }

    public double getTotal() {
        return total;
    }
}
