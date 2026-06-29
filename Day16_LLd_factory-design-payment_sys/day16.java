interface Payment{
    void pay(double  amt);
}
class UPI implements Payment{
    UPI(){};
    @Override
    public  void pay(double amt){
        System.out.println("Payment "+amt+"done by UPI");
    }
}
class CreditCard implements Payment{
    CreditCard(){};
    @Override
    public void pay(double amt){
        System.out.println("Payment "+amt+"done by Creditcard");
    }
}
class NetBanking implements Payment{
    NetBanking(){};
    @Override
    public void pay(double amt){
        System.out.println("Payment "+amt+"done by NetBanking");
    }
}
class PaymentFactory{
    PaymentFactory(){};

    static Payment getPayment(String type){
        if(type.equals("UPI")){
            return new UPI();
        }
        else if(type.equals("Credit")){
            return new CreditCard();
        }else if(type.equals("Net")){
            return new NetBanking();
        }else return null;
    }
}
public class day16 {
   public static void main(String[] args) {
     Payment p1 = PaymentFactory.getPayment("UPI");
    p1.pay(1000222.000);
   }
}
