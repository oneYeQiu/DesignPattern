package com.itjj.SimpleFactory;

public class Test {
    public static void main(String[] args) {
        MessageFactory smsMessageFactory = new SmsMessageFactory();
        Message smsMessage = smsMessageFactory.createMessage();
        smsMessage.send();

        MessageFactory emailMessageFactory = new EmailMessageFactory();
        Message emailMessage = emailMessageFactory.createMessage();
        emailMessage.send();
    }
}
