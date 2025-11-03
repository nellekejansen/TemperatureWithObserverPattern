package model;

import java.util.ArrayList;

/**
 * @author Nelleke Jansen
 * A place where the temperature is measured.
 */
public class WeatherStation implements Observable {
    public static final double DEFAULT_TEMPERATURE = 0.0;
    private ArrayList<Observer> observers;
    private double temperature;

    public WeatherStation() {
        this.observers = new ArrayList<>();
        this.temperature = DEFAULT_TEMPERATURE;
    }

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }

    public void publishTemperature(double temperature) {
        this.temperature = temperature;
        notifyObservers();
    }
}
