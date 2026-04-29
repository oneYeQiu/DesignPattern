package com.itjj.SimpleFactory;

public class NotificationService {
    private MessageFactory messageFactory;

    public NotificationService(MessageFactory messageFactory) {
        this.messageFactory = messageFactory;
    }

    public void notifyUser() {
        Message message = messageFactory.createMessage();
        message.send();
    }
}
