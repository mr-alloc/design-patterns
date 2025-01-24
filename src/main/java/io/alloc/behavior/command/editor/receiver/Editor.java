package io.alloc.behavior.command.editor.receiver;

public class Editor {
    private String text;

    public String getText() {
        return text;
    }

    public String getSelection() {
        return text;
    }

    public void deleteSelection() {
        text = "";
    }

    public void replaceSelection(String replacement) {
        text = replacement;
    }
}
