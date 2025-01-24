package io.alloc.behavior.command.editor.command;

import io.alloc.behavior.command.editor.invoker.Application;

public class CutCommand extends Command {

    public CutCommand(Application app) {
        super(app);
    }

    @Override
    public boolean execute() {
        saveBackup();
        app.setClipboard(editor.getSelection());
        editor.deleteSelection();
        return true;
    }
}
