package io.alloc.structure.bridge.messageing.abstraction.refined;

import io.alloc.structure.bridge.messageing.abstraction.MessageSender;
import io.alloc.structure.bridge.messageing.implementor.MessageSenderImplementor;

public class RegularMessageSender extends MessageSender {

    public RegularMessageSender(MessageSenderImplementor implementor) {
        super(implementor);
    }

    @Override
    public void send(String message, String recipient) {
        implementor.sendMessage(message, recipient);
    }
}
