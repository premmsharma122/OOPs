interface Pizza {
    void prepare();

    void displayPizza();
}

class VegPizza implements Pizza {
    private int size;
    private int price;

    VegPizza(int size, int price) {
        this.size = size;
        this.price = price;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Veg Pizza...");
    }

    @Override
    public void displayPizza() {
        System.out.println("Pizza : Veg Pizza");
        System.out.println("Size : " + size);
        System.out.println("Price : " + price);
    }
}

class CheesePizza implements Pizza {
    private int size;
    private int price;

    CheesePizza(int size, int price) {
        this.size = size;
        this.price = price;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Cheese Pizza...");
    }

    @Override
    public void displayPizza() {
        System.out.println("Pizza : Cheese Pizza");
        System.out.println("Size : " + size);
        System.out.println("Price : " + price);
    }
}

class FarmhousePizza implements Pizza {
    private int size;
    private int price;

    FarmhousePizza(int size, int price) {
        this.size = size;
        this.price = price;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Farmhouse Pizza...");
    }

    @Override
    public void displayPizza() {
        System.out.println("Pizza : Farmhouse Pizza");
        System.out.println("Size : " + size);
        System.out.println("Price : " + price);
    }
}

class PizzaFactory {

    static Pizza getPizza(String type) {

        if (type.equalsIgnoreCase("Veg")) {
            return new VegPizza(12, 120);
        } else if (type.equalsIgnoreCase("Cheese")) {
            return new CheesePizza(14, 150);
        } else if (type.equalsIgnoreCase("Farm")) {
            return new FarmhousePizza(18, 200);
        }

        return null;
    }
}

public class day17 {
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