interface notificationSender {
    public void send(String recipient, String message);
}

class EmailSender implements notificationSender {
    EmailSender() {
    };

    public void send(String recipient, String message) {
        System.out.println(recipient);
        System.out.println("Send by email: " + message);
    }
}

class SMSSender implements notificationSender{

    SMSSender(){};

    public void send(String recipient, String message) {
        System.out.println(recipient);
        System.out.println("Send by sms :" + message);
    }
}

class WhatsAppSender implements notificationSender{

    WhatsAppSender(){};

    public void send(String recipient, String message) {
        System.out.println(recipient);
        System.out.println("Send By WhatsApp: " + message);
    }
}

class NotificationService {
    notificationSender sender;

    void setSender(notificationSender sender) {
        this.sender = sender;
    };

    void notifyUser(String recipient , String message) {
        System.out.println(recipient);
        System.out.println(message);
    }

}

class day9 {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();
        service.setSender(new EmailSender());
        service.notifyUser("Prem", "Welcome");
        service.setSender(
                new SMSSender());

        service.notifyUser(
                "9876543210",
                "OTP: 1234");

    }
}