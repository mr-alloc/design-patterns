package io.alloc.behavior.command.editor.command;

import io.alloc.behavior.command.editor.invoker.Application;

public class CopyCommand extends Command {

    public CopyCommand(Application app) {
        super(app);
    }

    @Override
    public boolean execute() {
        saveBackup();
        app.setClipboard(editor.getSelection());
        return true;
    }
}
