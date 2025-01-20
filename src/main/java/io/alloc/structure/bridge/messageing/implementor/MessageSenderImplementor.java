package io.alloc.structure.bridge.messageing.implementor;

import java.util.Map;

public interface MessageSenderImplementor {

    void sendMessage(String message, String recipient);
    boolean validateRecipient(String recipient);
    void configureSettings(Map<String, String> settings);
}
