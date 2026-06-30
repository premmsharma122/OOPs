abstract class Pizza {

    private int size;
    private int price;

    Pizza(int size, int price) {
        this.size = size;
        this.price = price;
    }

    abstract void prepare();

    void displayPizza() {
        System.out.println("Size : " + size);
        System.out.println("Price : " + price);
    }
}

class VegPizza extends Pizza {

    VegPizza(int size, int price) {
        super(size, price);
    }

    @Override
    void prepare() {
        System.out.println("Preparing Veg Pizza...");
    }
}

class CheesePizza extends Pizza {

    CheesePizza(int size, int price) {
        super(size, price);
    }

    @Override
    void prepare() {
        System.out.println("Preparing Cheese Pizza...");
    }
}

class FarmhousePizza extends Pizza {

    FarmhousePizza(int size, int price) {
        super(size, price);
    }

    @Override
    void prepare() {
        System.out.println("Preparing Farmhouse Pizza...");
    }
}

class PizzaFactory {

    static Pizza getPizza(String type) {

        if (type.equalsIgnoreCase("Veg")) {
            return new VegPizza(10, 100);
        } else if (type.equalsIgnoreCase("Cheese")) {
            return new CheesePizza(12, 120);
        } else if (type.equalsIgnoreCase("Farm")) {
            return new FarmhousePizza(14, 150);
        }

        return null;
    }
}

public class day18 {

    public static void main(String[] args) {

        Pizza p1 = PizzaFactory.getPizza("Veg");
        p1.prepare();
        p1.displayPizza();

        System.out.println();

        Pizza p2 = PizzaFactory.getPizza("Cheese");
        p2.prepare();
        p2.displayPizza();

        System.out.println();

        Pizza p3 = PizzaFactory.getPizza("Farm");
        p3.prepare();
        p3.displayPizza();
    }
}