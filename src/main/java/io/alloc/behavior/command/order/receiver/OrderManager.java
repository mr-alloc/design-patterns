package io.alloc.behavior.command.order.receiver;

import io.alloc.behavior.command.order.OrderStatus;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {
    private List<Order> orders = new ArrayList<>();

    public void createOrder(Order order) {
        orders.add(order);
        System.out.println("Order created: " + order.getOrderId());
    }

    public void cancelOrder(Order order) {
        orders.remove(order);
        System.out.println("Order cancelled: " + order.getOrderId());
    }

    public void updateOrderStatus(Order order, OrderStatus status) {
        order.setStatus(status);
        System.out.println("Order " + order.getOrderId() + " status updated to: " + status);
    }

    public List<Order> getOrders() {
        return orders;
    }
}
