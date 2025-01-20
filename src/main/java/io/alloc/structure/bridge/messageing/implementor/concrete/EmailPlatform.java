package io.alloc.structure.bridge.messageing.implementor.concrete;

import io.alloc.structure.bridge.messageing.implementor.MessageSenderImplementor;

import java.util.Map;

public class EmailPlatform implements MessageSenderImplementor {

    @Override
    public void sendMessage(String message, String recipient) {
        if (validateRecipient(recipient)) {
            System.out.println("Sending email to " + recipient);
            System.out.println("Email content: " + message);
        }
    }

    @Override
    public boolean validateRecipient(String recipient) {
        return recipient.matches("^[A-Za-z0-9+_.-]+@(.+)$");
    }

    @Override
    public void configureSettings(Map<String, String> settings) {
        System.out.println("Configuring email settings: " + settings);
    }
}
