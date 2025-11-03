package controller;

import model.CoatAdvisor;
import model.TemperatureStatus;
import model.WeatherStation;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Terminal program to update temperature and show it
 * @author Nelleke Jansen
 * @author Josse Muller
 */
public class TemperatureController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        WeatherStation weatherStation = new WeatherStation();

        TemperatureStatus temperatureStatus = new TemperatureStatus();
        weatherStation.addObserver(temperatureStatus);

        CoatAdvisor coatAdvisor = new CoatAdvisor();
        weatherStation.addObserver(coatAdvisor);

        while (true) {
            System.out.print("Wat is de nieuwe temperatuur? ");
            double temperature = scanner.nextDouble();
            System.out.println("---- [Updating weather status temperature] ----");
            weatherStation.setTemperature(temperature);
        }
    }
}
