package model;

/**
 * @author Nelleke Jansen
 * Show the temperature on a bar thermometer
 */
public class Thermometer implements Observer{
    private static final int DEGREES_PER_TICK = 5;
    private static final int SCALE_MAXIMUM = 40;
    private static final int SCALE_MINIMUM = -20;
    private double temperature;
    @Override
    public void update(double temperature) {
        this.temperature = temperature;
        display();
    }
    private void display() {
        System.out.println("Thermometer: ");
        // Scale
        for (int tick = SCALE_MINIMUM; tick <= SCALE_MAXIMUM; tick += DEGREES_PER_TICK) {
            System.out.printf("|%-4d", tick);
        }
        System.out.println();

        // Thermometer
        for (int bar = SCALE_MINIMUM; bar <= SCALE_MAXIMUM; bar++){
            if (bar < temperature) {
                System.out.print("=");
            } else if (bar == (int) temperature) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
        System.out.println();
    }
}
