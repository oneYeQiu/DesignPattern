package com.itjj.SimpleFactory;

public class SmsMessage implements Message {
    @Override
    public void send() {
        System.out.println("发送短信");
    }

}
