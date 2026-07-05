interface Button {
    void click();
}

interface TextField {
    void type();
}

interface Menu {
    void showMenu();
}

// ----------------------
// Light Theme Products
// ----------------------

class LightButton implements Button {

    @Override
    public void click() {
        System.out.println("Light Button Clicked");
    }
}

class LightTextField implements TextField {

    @Override
    public void type() {
        System.out.println("Typing in Light TextField");
    }
}

class LightMenu implements Menu {

    @Override
    public void showMenu() {
        System.out.println("Showing Light Menu");
    }
}

// ----------------------
// Dark Theme Products
// ----------------------

class DarkButton implements Button {

    @Override
    public void click() {
        System.out.println("Dark Button Clicked");
    }
}

class DarkTextField implements TextField {

    @Override
    public void type() {
        System.out.println("Typing in Dark TextField");
    }
}

class DarkMenu implements Menu {

    @Override
    public void showMenu() {
        System.out.println("Showing Dark Menu");
    }
}

// ----------------------
// Abstract Factory
// ----------------------

interface ThemeFactory {

    Button createButton();

    TextField createTextField();

    Menu createMenu();
}

// ----------------------
// Concrete Factories
// ----------------------

class LightThemeFactory implements ThemeFactory {

    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public TextField createTextField() {
        return new LightTextField();
    }

    @Override
    public Menu createMenu() {
        return new LightMenu();
    }
}

class DarkThemeFactory implements ThemeFactory {

    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public TextField createTextField() {
        return new DarkTextField();
    }

    @Override
    public Menu createMenu() {
        return new DarkMenu();
    }
}

public class day22 {

    public static void main(String[] args) {

        ThemeFactory factory;

        // Light Theme
        factory = new LightThemeFactory();

        Button b1 = factory.createButton();
        TextField t1 = factory.createTextField();
        Menu m1 = factory.createMenu();

        b1.click();
        t1.type();
        m1.showMenu();

        System.out.println();

        // Dark Theme
        factory = new DarkThemeFactory();

        Button b2 = factory.createButton();
        TextField t2 = factory.createTextField();
        Menu m2 = factory.createMenu();

        b2.click();
        t2.type();
        m2.showMenu();
    }
}