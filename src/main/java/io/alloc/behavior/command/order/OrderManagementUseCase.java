package io.alloc.behavior.command.order;

import io.alloc.behavior.command.order.command.CreateOrderCommand;
import io.alloc.behavior.command.order.command.UpdateOrderCommand;
import io.alloc.behavior.command.order.invoker.OrderCommandInvoker;
import io.alloc.behavior.command.order.receiver.Order;
import io.alloc.behavior.command.order.receiver.OrderManager;

import java.util.List;

public class OrderManagementUseCase {

    public static void run() {
        OrderManager receiver = new OrderManager();
        OrderCommandInvoker invoker = new OrderCommandInvoker();

        //Create Command
        Product laptop = new Product("Laptop", 999.99);
        Product phone = new Product("Phone", 499.00);

        //CreateOrder
        Order order = new Order(List.of(laptop, phone));

        //Create Order Command
        CreateOrderCommand createCommand = new CreateOrderCommand(receiver, order);
        invoker.executeCommand(createCommand);

        //Update Order Command
        UpdateOrderCommand updateCommand = new UpdateOrderCommand(receiver, order, OrderStatus.SHIPPED);
        invoker.executeCommand(updateCommand);

        //undo last command
        invoker.undoLastCommand();
    }

}
