package io.alloc.structure.bridge.messageing.implementor.concrete;

import io.alloc.structure.bridge.messageing.implementor.MessageSenderImplementor;

import java.util.Map;

public class SMSPlatform implements MessageSenderImplementor {

    @Override
    public void sendMessage(String message, String recipient) {
        if (validateRecipient(recipient)) {
            System.out.println("Sending SMS to " + recipient);
            System.out.println("SMS content: " + message);
        }
    }

    @Override
    public boolean validateRecipient(String recipient) {
        return recipient.matches("^\\d{10}$");
    }

    @Override
    public void configureSettings(Map<String, String> settings) {
        System.out.println("Configuring SMS settings: " + settings);
    }
}
