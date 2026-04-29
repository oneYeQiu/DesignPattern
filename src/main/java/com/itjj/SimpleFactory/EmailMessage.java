package com.itjj.SimpleFactory;

public class EmailMessage implements Message {
    @Override
    public void send() {
        System.out.println("发送邮件");
    }

}
