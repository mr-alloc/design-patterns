package io.alloc.behavior.command.editor;

import io.alloc.behavior.command.editor.invoker.Application;
import io.alloc.behavior.command.editor.receiver.Editor;

import java.util.Stack;

public class EditorUseCase {

    public static void run() {

        Application app = new Application();
        app.createUI();
    }

}
