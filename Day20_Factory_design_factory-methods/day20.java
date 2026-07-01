interface Vehicle {
    void start();
}

class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car Started");
    }
}

class Bike implements Vehicle {

    @Override
    public void start() {
        System.out.println("Bike Started");
    }
}

class Truck implements Vehicle {

    @Override
    public void start() {
        System.out.println("Truck Started");
    }
}

// Abstract Factory
abstract class VehicleFactory {

    abstract Vehicle createVehicle();
}

// Concrete Factories
class CarFactory extends VehicleFactory {

    @Override
    Vehicle createVehicle() {
        return new Car();
    }
}

class BikeFactory extends VehicleFactory {

    @Override
    Vehicle createVehicle() {
        return new Bike();
    }
}

class TruckFactory extends VehicleFactory {

    @Override
    Vehicle createVehicle() {
        return new Truck();
    }
}

public class day20 {

    public static void main(String[] args) {

        VehicleFactory factory;

        factory = new CarFactory();
        Vehicle v1 = factory.createVehicle();
        v1.start();

        System.out.println();

        factory = new BikeFactory();
        Vehicle v2 = factory.createVehicle();
        v2.start();

        System.out.println();

        factory = new TruckFactory();
        Vehicle v3 = factory.createVehicle();
        v3.start();
    }
}