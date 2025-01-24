package io.alloc.behavior.command.editor;

import io.alloc.behavior.command.editor.command.Command;

public class Button {

    private final String icon;
    private final String name;
    private Runnable command;

    public Button(String icon, String name) {
        this.icon = icon;
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public String getName() {
        return name;
    }

    public void setCommand(Runnable command) {
        this.command = command;
    }
}
