package io.alloc.behavior.command.order.receiver;

import io.alloc.behavior.command.order.OrderStatus;
import io.alloc.behavior.command.order.Product;

import java.util.List;
import java.util.UUID;

public class Order {

    private final String orderId;
    private final List<Product> products;
    private OrderStatus status;
    private final double totalAmount;

    public Order(List<Product> products) {
        this.orderId = UUID.randomUUID().toString();
        this.products = products;
        this.status = OrderStatus.CREATED;
        this.totalAmount = calculateTotalAmount();
    }

    private double calculateTotalAmount() {
        return products.stream()
                .mapToDouble(Product::getPrice)
                .sum();
    }

    public String getOrderId() {
        return orderId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
