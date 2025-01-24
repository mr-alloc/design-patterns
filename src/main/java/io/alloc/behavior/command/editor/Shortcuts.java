package io.alloc.behavior.command.editor;

import java.util.HashMap;
import java.util.Map;

public class Shortcuts {

    private final Map<String, Runnable> events;

    public Shortcuts() {
        this.events = new HashMap<>();
    }

    public void onKeyPress(String key, Runnable event) {
        events.put(key, event);
    }
}
