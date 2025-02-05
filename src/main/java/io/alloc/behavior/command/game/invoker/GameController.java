package io.alloc.behavior.command.game.invoker;

import io.alloc.behavior.command.game.command.Command;

import java.util.ArrayList;
import java.util.List;

public class GameController {
    private Command[] buttons = new Command[3];
    private List<Command> commandHistory = new ArrayList<>();

    public void setCommand(int slot, Command command) {
        buttons[slot] = command;
    }

    public void pressButton(int slot) {
        if (buttons[slot] != null) {
            buttons[slot].execute();
            commandHistory.add(buttons[slot]);
        }
    }

    public void undoLastCommand() {
        if (!commandHistory.isEmpty()) {
            Command lastCommand = commandHistory.remove(commandHistory.size() - 1);
            lastCommand.undo();
        }
    }
}
