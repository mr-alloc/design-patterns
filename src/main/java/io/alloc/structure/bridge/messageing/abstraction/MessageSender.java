package io.alloc.structure.bridge.messageing.abstraction;

import io.alloc.structure.bridge.messageing.implementor.MessageSenderImplementor;

public abstract class MessageSender {
    protected MessageSenderImplementor implementor;

    protected MessageSender(MessageSenderImplementor implementor) {
        this.implementor = implementor;
    }

    protected void changeImplementor(MessageSenderImplementor implementor) {
        this.implementor = implementor;
    }

    public abstract void send(String message, String recipient);
}
