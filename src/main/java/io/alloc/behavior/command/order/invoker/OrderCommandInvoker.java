package io.alloc.behavior.command.order.invoker;

import io.alloc.behavior.command.order.command.OrderCommand;

import java.util.ArrayList;
import java.util.List;

public class OrderCommandInvoker {
    private final List<OrderCommand> commands = new ArrayList<>();

    public void executeCommand(OrderCommand command) {
        command.execute();
        commands.add(command);
    }

    public void undoLastCommand() {
        if (!commands.isEmpty()) {
            OrderCommand lastCommand = commands.remove(commands.size() - 1);
            lastCommand.undo();
        }
    }

}
