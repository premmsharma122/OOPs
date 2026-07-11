package Day08;
interface PaymentStrategy{
    void pay(double amount);
}
class CreditCardPayment implements PaymentStrategy{
    CreditCardPayment(){};

    @Override
    public void pay(double amount){
        System.out.println("Payment of "+amount+" done by credit-card.");
    }

}

class UPIPayment implements PaymentStrategy{
    UPIPayment(){};

    @Override
    public void pay(double amount){
        System.out.println("Payment of "+amount+" done by UPI.");
    }
    
}
class NetBankingPayment implements PaymentStrategy{
    NetBankingPayment(){};

    @Override
    public void pay(double amount){
        System.out.println("Payment of "+amount+" done by NETBanking.");
    }
}
class ShoppingCart{
    private PaymentStrategy paymentStrategy;
    void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy=paymentStrategy;
    }

    void checkout(double amount){
        if(paymentStrategy==null){
            System.out.println("Please  select a Payment method first.");
            return;
        }
        paymentStrategy.pay(amount);
    }
}
public class day8 {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.setPaymentStrategy(new UPIPayment());
        cart.checkout(1000);
        System.out.println();

        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(1000);
        System.out.println();

        cart.setPaymentStrategy(new NetBankingPayment());
        cart.checkout(1000);
    }
}
