package io.alloc.behavior.command.editor.command;

import io.alloc.behavior.command.editor.invoker.Application;

public class UndoCommand extends Command {

    public UndoCommand(Application app) {
        super(app);
    }

    @Override
    public boolean execute() {
        app.undo();
        return false;
    }
}
