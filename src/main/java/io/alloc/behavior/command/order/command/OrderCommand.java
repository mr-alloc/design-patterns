package io.alloc.behavior.command.order.command;

public interface OrderCommand {

    void execute();

    void undo();
}
