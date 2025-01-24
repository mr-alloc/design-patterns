package io.alloc.behavior.command.editor.command;

import io.alloc.behavior.command.editor.invoker.Application;

public class PasteCommand extends Command {

        public PasteCommand(Application app) {
            super(app);
        }

        @Override
        public boolean execute() {
            saveBackup();
            editor.replaceSelection(app.getClipboard());
            return true;
        }
}
