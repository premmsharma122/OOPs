import java.util.ArrayList;

interface WeatherObserver {
    void update(int temp);
}

class MobileApp implements WeatherObserver {

    @Override
    public void update(int temp) {
        System.out.println("Mobile App Updated");
        System.out.println("Temperature = " + temp + "°C");
    }
}

class TVDisplay implements WeatherObserver {

    @Override
    public void update(int temp) {
        System.out.println("TV Display Updated");
        System.out.println("Temperature = " + temp + "°C");
    }
}

class LEDBoard implements WeatherObserver {

    @Override
    public void update(int temp) {
        System.out.println("LED Board Updated");
        System.out.println("Temperature = " + temp + "°C");
    }
}

interface WeatherSubject {

    void subscribe(WeatherObserver observer);

    void unsubscribe(WeatherObserver observer);

    void notifyObservers();
}

class WeatherStation implements WeatherSubject {

    private int temperature;

    private ArrayList<WeatherObserver> observers;

    WeatherStation() {
        observers = new ArrayList<>();
    }

    @Override
    public void subscribe(WeatherObserver observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(WeatherObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {

        for (WeatherObserver observer : observers) {
            observer.update(temperature);
        }
    }

    void setTemperature(int temperature) {

        this.temperature = temperature;

        notifyObservers();
    }
}

public class day25 {

    public static void main(String[] args) {

        WeatherStation station = new WeatherStation();

        WeatherObserver mobile = new MobileApp();
        WeatherObserver tv = new TVDisplay();
        WeatherObserver led = new LEDBoard();

        station.subscribe(mobile);
        station.subscribe(tv);
        station.subscribe(led);

        station.setTemperature(35);

        System.out.println();

        station.setTemperature(42);

        System.out.println();

        station.unsubscribe(tv);

        station.setTemperature(28);
    }
}