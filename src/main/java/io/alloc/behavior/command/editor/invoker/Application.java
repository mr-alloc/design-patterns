package io.alloc.behavior.command.editor.invoker;

import io.alloc.behavior.command.editor.Button;
import io.alloc.behavior.command.editor.Shortcuts;
import io.alloc.behavior.command.editor.command.Command;
import io.alloc.behavior.command.editor.CommandHistory;
import io.alloc.behavior.command.editor.command.CopyCommand;
import io.alloc.behavior.command.editor.command.CutCommand;
import io.alloc.behavior.command.editor.receiver.Editor;
import io.alloc.behavior.command.editor.command.PasteCommand;
import io.alloc.behavior.command.editor.command.UndoCommand;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Application {

    private String clipboard;
    private Editor activeEditor;
    private final List<Editor> editors;
    private final CommandHistory history;
    private final Button copyButton;
    private final Button cutButton;
    private final Button pasteButton;
    private final Button undoButton;
    private final Shortcuts shortcuts;

    public Application() {
        this.clipboard = "";
        this.editors = new ArrayList<>();
        this.history = new CommandHistory(new Stack<>());
        this.copyButton = new Button("copy", "Copy");
        this.cutButton = new Button("cut", "Cut");
        this.pasteButton = new Button("paste", "Paste");
        this.undoButton = new Button("undo", "Undo");
        this.shortcuts = new Shortcuts();
    }

    public void addEditor(Editor editor) {
        editors.add(editor);
        activeEditor = editor;
    }

    public void setClipboard(String clipboard) {
        this.clipboard = clipboard;
    }

    public String getClipboard() {
        return clipboard;
    }

    public Editor getActiveEditor() {
        return activeEditor;
    }

    public void undo() {
        Command pop = history.pop();
        if (pop != null) {
            pop.undo();
        }
    }

    public void executeCommand(Command command) {
        if (command.execute()) {
            history.push(command);
        }
    }

    public void createUI() {
        // Create UI

        Runnable copy = () -> executeCommand(new CopyCommand(this));
        shortcuts.onKeyPress("Ctrl+C", copy);
        copyButton.setCommand(copy);

        Runnable cut = () -> executeCommand(new CutCommand(this));
        shortcuts.onKeyPress("Ctrl+X", cut);
        cutButton.setCommand(cut);

        Runnable paste = () -> executeCommand(new PasteCommand(this));
        shortcuts.onKeyPress("Ctrl+V", paste);
        pasteButton.setCommand(paste);

        Runnable undo = () -> executeCommand(new UndoCommand(this));
        shortcuts.onKeyPress("Ctrl+Z", undo);
        undoButton.setCommand(undo);
    }
}
