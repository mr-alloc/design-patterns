package io.alloc.behavior.command.editor.command;

import io.alloc.behavior.command.editor.receiver.Editor;
import io.alloc.behavior.command.editor.invoker.Application;

public abstract class Command {

    protected final Application app;
    protected final Editor editor;
    protected String backup;

    public Command(Application app) {
        this.app = app;
        this.editor = app.getActiveEditor();
    }

    public void saveBackup() {
        backup = editor.getText();
    }

    public void undo() {
        editor.replaceSelection(backup);
    }

    public abstract boolean execute();
}
