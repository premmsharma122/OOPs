interface Vehicle{
    void start();
}
class Car implements Vehicle{
    Car(){}
    @Override
    public void start(){
        System.out.println("Car Started");
    }
}
class Bike implements Vehicle{
    Bike(){};
    @Override
    public void start(){
        System.out.println("Bike Start");
    }
}
class Truck implements Vehicle{
    Truck(){};
    @Override
    public void start(){
        System.out.println("Truck Start");
    }
}
class VehicleFactory{
    VehicleFactory(){};
    static Vehicle getVehicle(String type){
        if(type.equals("Car")){
            return new Car();
        }else if(type.equals("Bike")){
            return new Bike();
        }else if(type.equals("Truck")){
            return new Truck();
        }else return null;
    }
}
public class day14 {
    public static void main(String[] args) {
        
        Vehicle v1 = VehicleFactory.getVehicle("Car");
        v1.start();
    }
}
