package io.alloc.structure.bridge.messageing.abstraction.refined;

import io.alloc.structure.bridge.messageing.abstraction.MessageSender;
import io.alloc.structure.bridge.messageing.implementor.MessageSenderImplementor;

public class UrgentMessageSender extends MessageSender {

    public UrgentMessageSender(MessageSenderImplementor implementor) {
        super(implementor);
    }

    @Override
    public void send(String message, String recipient) {
        message = "[URGENT] " + message;
        implementor.sendMessage(message, recipient);
    }
}
