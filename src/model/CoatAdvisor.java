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
        System.out.print("Jassenadvies: ");
        if (this.temperature < 5) {
            System.out.println("Trek een warme jas aan, het is heel koud!");
        } else if (this.temperature < 15) {
            System.out.println("Trek een jas aan.");
        } else if (this.temperature < 20) {
            System.out.println("Trek een zomerjas aan.");
        } else {
            System.out.println("Je hebt geen jas nodig, het is warm buiten!");
        }
        System.out.println();
    }
}
