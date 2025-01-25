package io.alloc.behavior.command.order.command;

import io.alloc.behavior.command.order.OrderStatus;
import io.alloc.behavior.command.order.receiver.Order;
import io.alloc.behavior.command.order.receiver.OrderManager;

public class UpdateOrderCommand implements OrderCommand {

    private OrderManager receiver;
    private Order order;
    private OrderStatus previousOrder;
    private OrderStatus newStatus;

    public UpdateOrderCommand(OrderManager receiver, Order order, OrderStatus newStatus) {
        this.receiver = receiver;
        this.order = order;
        this.newStatus = newStatus;
        this.previousOrder = order.getStatus();
    }

    @Override
    public void execute() {
        receiver.updateOrderStatus(order, newStatus);
    }

    @Override
    public void undo() {
        receiver.updateOrderStatus(order, previousOrder);
    }
}
