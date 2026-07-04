interface Button{
    void click();
}
interface Checkbox{
    void check();
}

class WindowButton implements Button{
    @Override
    public void click(){
        System.out.println("Windows Button Clicked");
    }
}
class WindowCheckbox implements Checkbox{
    @Override
    public void check(){
        System.out.println("Windows Checkbox");
    }
}

class MacButton implements Button{
    @Override
    public void click(){
        System.out.println("MacButton Clicked");
    }
}
class MacCheckbox implements Checkbox{
    @Override
    public void check(){
        System.out.println("Mac CheckBox");
    }
}
// abstract factory
interface GUIFactory{
    Button createButton();
    Checkbox createCheckbox();
}
class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton(){
        return new WindowButton();
    }
    @Override
    public Checkbox createCheckbox(){
        return new WindowCheckbox();
    }
}
class MacFactory implements GUIFactory{
    @Override
    public Button createButton(){
        return new MacButton();
    }
    @Override
    public Checkbox createCheckbox(){
        return new MacCheckbox();
    }
}
public class day21 {
    public static void main(String[] args) {
        GUIFactory factory;
        factory = new WindowsFactory();
        Button b1 = factory.createButton();
        Checkbox c1 = factory.createCheckbox();

        b1.click();
        c1.check();

        System.out.println();
        factory = new MacFactory();
        Button b2 = factory.createButton();
        Checkbox c2  = factory.createCheckbox();
        b2.click();
        c2.check();
    }
}
