package com.itjj.SimpleFactory;

public class Test1 {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService(new SmsMessageFactory());
        notificationService.notifyUser();

        notificationService = new NotificationService(new EmailMessageFactory());
        notificationService.notifyUser();

        notificationService = new NotificationService(new EmailMessageFactory());
        notificationService.notifyUser();
    }
}
