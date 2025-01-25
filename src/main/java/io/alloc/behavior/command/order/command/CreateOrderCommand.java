package io.alloc.behavior.command.order.command;

import io.alloc.behavior.command.order.receiver.Order;
import io.alloc.behavior.command.order.receiver.OrderManager;

public class CreateOrderCommand implements OrderCommand {

    private final OrderManager receiver;
    private final Order order;

    public CreateOrderCommand(OrderManager receiver, Order order) {
        this.receiver = receiver;
        this.order = order;
    }

    @Override
    public void execute() {
        this.receiver.createOrder(order);
    }

    @Override
    public void undo() {
        this.receiver.cancelOrder(order);
    }
}
