interface Screen{
    void displayScreen();
}
interface Battery{
    void powerOn();
}
interface Camera{
    void capturePhoto();
}
interface MobileFactory{
    Screen createScreen();
    Battery createBattery();
    Camera createCamera();

}
class AppleScreen implements Screen{
    @Override
    public void displayScreen(){
        System.out.println("Apple Screen");
    }
}
class AppleBattery implements Battery{
    @Override
    public void powerOn(){
        System.out.println("Apple Power-ON");
    }
}
class AppleCamera implements Camera{
    @Override
    public void capturePhoto(){
        System.out.println("Capture by Apple-Camera");
    }
}

class SamsungScreen implements Screen{
    @Override
    public void displayScreen(){
        System.out.println("Samsung Screen");
    }

}
class SamsungBattery implements Battery{
    @Override
    public void powerOn(){
        System.out.println("Samsung-Power-On");
    }
}
class SamsungCamera implements Camera{
    @Override
    public void capturePhoto(){
        System.out.println("Capture by Samsung-Camera");
    }
}
class AppleFactory implements MobileFactory{
    @Override
    public Screen createScreen(){
        return new AppleScreen();
    }
    @Override
    public Battery createBattery(){
        return new AppleBattery();
    }
    @Override 
    public Camera createCamera(){
        return new AppleCamera();
    }
}
class SamsungFactory implements MobileFactory{
    @Override
    public Screen createScreen(){
        return new SamsungScreen();
    }
    @Override
    public Battery createBattery(){
        return new SamsungBattery();
    }
    @Override 
    public Camera createCamera(){
        return new SamsungCamera();
    }
}
public class day23 {
    public static void main(String[] args) {
        MobileFactory factory;
        factory  = new SamsungFactory();
        Screen s1 = factory.createScreen();
        Battery b1 = factory.createBattery();
        Camera c1 = factory.createCamera();

        s1.displayScreen();
        b1.powerOn();
        c1.capturePhoto();
        factory = new AppleFactory();
        Screen s2 = factory.createScreen();
        Battery b2 = factory.createBattery();
        Camera c2 = factory.createCamera();
        s2.displayScreen();
        b2.powerOn();
        c2.capturePhoto();
    }
}
