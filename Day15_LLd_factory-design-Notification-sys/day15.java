interface Notification{
    void send(String recipient, String message);
}
class EmailNotification implements Notification{
    EmailNotification(){};
    @Override
    public void send(String recipient, String message){
        System.out.println("Message :"+message);
        System.out.println("Send by :"+recipient);
    }
}
class SMSNotification implements Notification{
    SMSNotification(){};
    @Override
    public void send(String recipient, String message){
        System.out.println("Message :"+message);
        System.out.println("Send by :"+recipient);
    }
}
class WhatsAppNotification implements Notification{
    WhatsAppNotification(){};
    @Override
    public void send(String recipient, String message){
        System.out.println("Message :"+message);
        System.out.println("Send by :"+recipient);
    }
}
class NotificationFactory{

    NotificationFactory(){};

    static Notification getNotification(String type){
        if(type.equals("Email")){
            return new EmailNotification();
        }
        else if(type.equals("SMS")){
            return new SMSNotification();
        }
        else if(type.equals("WhatsApp")){
            return new WhatsAppNotification();
        }else return null;
    }
}
public class day15 {
    public static void main(String[] args) {
        Notification n1 =  NotificationFactory.getNotification("Email");
        n1.send("prem@gmail.com","Hello from Prem");
    }
}