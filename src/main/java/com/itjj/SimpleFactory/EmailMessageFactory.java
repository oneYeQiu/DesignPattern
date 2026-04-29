package com.itjj.SimpleFactory;

public class EmailMessageFactory implements MessageFactory {
    @Override
    public Message createMessage() {
        return new EmailMessage();
    }
}
