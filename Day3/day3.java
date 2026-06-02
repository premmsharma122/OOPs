abstract class Payment {
    private double amt;
    private String transactionId;

    Payment(double amt, String transactionId) {
        this.amt = amt;
        this.transactionId = transactionId;
    }

    public double getAmount() {
        return amt;
    }

    public String getTransactionId() {
        return transactionId;
    }

    abstract void pay();

    void displayTransaction() {
        System.out.println("Transaction ID : " + transactionId);
        System.out.println("Amount : " + amt);
    }
}

interface ReceiptGenerator {
    void generateReceipt();
}

class CreditCardPayment extends Payment implements ReceiptGenerator {

    private String cardNumber;

    CreditCardPayment(String cardNumber, double amt, String transactionId) {
        super(amt, transactionId);
        this.cardNumber = cardNumber;
    }

    @Override
    void pay() {
        System.out.println("Payment Done Using Credit Card");
    }

    @Override
    void displayTransaction() {
        super.displayTransaction();
        System.out.println("Card Number : " + cardNumber);
    }

    @Override
    public void generateReceipt() {
        System.out.println("Credit Card Receipt Generated!");
    }
}

class UPIPayment extends Payment implements ReceiptGenerator {

    private String upiId;

    UPIPayment(String upiId, double amt, String transactionId) {
        super(amt, transactionId);
        this.upiId = upiId;
    }

    @Override
    void pay() {
        System.out.println("Payment Done Using UPI");
    }

    @Override
    void displayTransaction() {
        super.displayTransaction();
        System.out.println("UPI ID : " + upiId);
    }

    @Override
    public void generateReceipt() {
        System.out.println("UPI Receipt Generated!");
    }
}

public class day3 {

    public static void main(String[] args) {

        Payment p1 = new CreditCardPayment(
                "1234-5678-9012",
                5000,
                "TXN101");

        Payment p2 = new UPIPayment(
                "prem@upi",
                2500,
                "TXN102");

        p1.pay();
        p1.displayTransaction();

        System.out.println();

        p2.pay();
        p2.displayTransaction();

        System.out.println();

        ReceiptGenerator r1 =
                new CreditCardPayment(
                        "1111-2222-3333",
                        7000,
                        "TXN103");

        ReceiptGenerator r2 =
                new UPIPayment(
                        "dev@upi",
                        3000,
                        "TXN104");

        r1.generateReceipt();
        r2.generateReceipt();
    }
}