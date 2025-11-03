package model;

/**
 * Display the temperature in a string with one decimal
 * @author Josse Muller
 */
public class TemperatureStatus implements Observer {
    private double temperature;

    @Override
    public void update(double temperature) {
        this.temperature = temperature;
        display();
    }

    public void display() {
        System.out.printf("De temperatuur is nu: %.1f\n", this.temperature);
    }
}
