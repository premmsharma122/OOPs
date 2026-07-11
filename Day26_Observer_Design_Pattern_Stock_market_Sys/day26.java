import java.util.ArrayList;
// Observer
interface Investor {
    void update(String stockName, double price);
}

// Concrete Observer
class User implements Investor {

    private String name;

    User(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println(name + " notified:");
        System.out.println(stockName + " price = ₹" + price);
        System.out.println();
    }
}

// Subject
interface Stock {

    void subscribe(Investor investor);

    void unsubscribe(Investor investor);

    void notifyInvestors();
}

// Concrete Subject
class StockMarket implements Stock {

    private String stockName;
    private double price;

    private ArrayList<Investor> investors;

    StockMarket(String stockName) {
        this.stockName = stockName;
        investors = new ArrayList<>();
    }

    @Override
    public void subscribe(Investor investor) {
        investors.add(investor);
    }

    @Override
    public void unsubscribe(Investor investor) {
        investors.remove(investor);
    }

    @Override
    public void notifyInvestors() {

        for (Investor investor : investors) {
            investor.update(stockName, price);
        }
    }

    void changePrice(double price) {
        this.price = price;

        System.out.println("Stock Price Updated");
        System.out.println(stockName + " = ₹" + price);
        System.out.println();

        notifyInvestors();
    }
}

public class day26 {

    public static void main(String[] args) {

        StockMarket market = new StockMarket("TCS");

        Investor i1 = new User("Prem");
        Investor i2 = new User("Rahul");
        Investor i3 = new User("Aman");

        market.subscribe(i1);
        market.subscribe(i2);
        market.subscribe(i3);

        market.changePrice(3720);

        System.out.println("------------------------");

        market.changePrice(3815);

        System.out.println("------------------------");

        market.unsubscribe(i2);

        market.changePrice(3950);
    }
}