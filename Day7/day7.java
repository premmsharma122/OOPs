abstract class Notification {
    private String recipient;
    private String message;

    Notification(String recipinet, String message) {
        this.recipient = recipinet;
        this.message = message;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getMessage() {
        return message;
    }

    abstract void displayNotificationInfo();

    abstract void sendNotification();

}

interface Loggable {
    void logNotification();
}

class EmailNotification extends Notification implements Loggable {
    private String emailAddress;

    EmailNotification(String emailAddress, String recipient, String message) {
        super(recipient, message);
        this.emailAddress = emailAddress;
    }

    @Override
    public void logNotification() {
        System.out.println("Email Notification Logged");
    }

    @Override
    void sendNotification() {
        System.out.println("Send By EmailNotification");

    }

    @Override
    void displayNotificationInfo() {
        System.out.println("Email Address: " + emailAddress);
        System.out.println("Recipient : " + getRecipient());
        System.out.println("Message : " + getMessage());
        System.out.println("Email Address : " + emailAddress);
    }

}

class SMSNotification extends Notification implements Loggable {
    private long phoneNumber;

    SMSNotification(long phoneNumber, String recipient, String message) {
        super(recipient, message);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void logNotification() {
        System.out.println("Email Notification Logged");
    }

    @Override
    void sendNotification() {

        System.out.println("Send By SMSNotification");

    }

    @Override
    void displayNotificationInfo() {

        System.out.println("Phone Number : " + phoneNumber);
        System.out.println("Recipient : " + getRecipient());
        System.out.println("Message : " + getMessage());
        System.out.println("Phone Number : " + phoneNumber);
    }

}

public class day7 {
    public static void main(String[] args) {
        Notification n1 = new EmailNotification(
                "prem@gmail.com",
                "Prem",
                "Welcome Email");
        Notification n2 = new SMSNotification(
                929929299L,
                "Prem",
                "OTP Sent");
        n1.sendNotification();
        n1.displayNotificationInfo();

        System.out.println();

        n2.sendNotification();
        n2.displayNotificationInfo();

    }
}