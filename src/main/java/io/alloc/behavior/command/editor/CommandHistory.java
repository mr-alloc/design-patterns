package io.alloc.behavior.command.editor;

import io.alloc.behavior.command.editor.command.Command;

import java.util.Stack;

public class CommandHistory {
    private final Stack<Command> histories;

    public CommandHistory(Stack<Command> histories) {
        this.histories = histories;
    }

    public void push(Command command) {
        histories.push(command);
    }

    public Command pop() {
        return histories.pop();
    }
}
