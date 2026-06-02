package Day4;
class Engine{
    private int engineNumber;
    private int horsePower;

    Engine(int engineNumber, int horsePower){
        this.engineNumber=engineNumber;
        this.horsePower=horsePower;
    }
    void startEngine(){
        System.out.println("Engine Start");
    }
    void displayEngineInfo(){
        System.out.println("EngineNumber :"+engineNumber);
        System.out.println("HorsePower :"+horsePower);
    }
}
class Car{
    private String carName;
    private int carNumber;

    // Has A- Relationship;
    private Engine engine;
    Car(String carName, int carNumber, int engineNumber, int horsePower){
        this.carName=carName;
        this.carNumber=carNumber;

        //Composition
        this.engine = new Engine(engineNumber, horsePower);
        
    }
    void startCar(){
        System.out.println("Car Start");
        engine.startEngine();
    }
    void displayCarInfo(){
        System.out.println("CarName: "+carName);
        System.out.println("CarNumber: "+carNumber);
        System.out.println();
        engine.displayEngineInfo();
    }

}
public class day4 {
    public static void main(String args[]){
        Car c1 = new Car("BMW", 111,012,50000);
        c1.startCar();
        System.out.println();
        c1.displayCarInfo();
    }
}
