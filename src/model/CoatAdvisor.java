package model;

/**
 * @author Nelleke Jansen
 * Gives advice about whether you need a coat, based on the temperature.
 */
public class CoatAdvisor implements Observer {
    private double temperature;

    @Override
    public void update(double temperature) {
        this.temperature = temperature;
        display();
    }

    private void display() {
        if (this.temperature < 5) {
            System.out.println("Wear a warm coat, it's super cold!");
        } else if (this.temperature < 15) {
            System.out.println("Wear a coat.");
        } else if (this.temperature < 20) {
            System.out.println("Wear a light jacket");
        } else {
            System.out.println("No coat necessary, it's warm outside!");
        }
    }
}
