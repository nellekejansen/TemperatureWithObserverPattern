package controller;

import model.CoatAdvisor;
import model.TemperatureStatus;
import model.Thermometer;
import model.WeatherStation;

import java.util.Scanner;

/**
 * Terminal program to update temperature and show it
 * @author Nelleke Jansen
 * @author Josse Muller
 */
public class TemperatureController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        WeatherStation weatherStation = new WeatherStation(); //                            <---- Create Observable

        TemperatureStatus temperatureStatus = new TemperatureStatus();
        Thermometer thermometer = new Thermometer(); //                                     <---- Create Observers
        CoatAdvisor coatAdvisor = new CoatAdvisor();

        weatherStation.subscribe(temperatureStatus);
        weatherStation.subscribe(thermometer); //                              <---- Subscribe Observers to Observable
        weatherStation.subscribe(coatAdvisor);

        while (true) {
            System.out.print("Wat is de nieuwe temperatuur? ");
            double temperature = scanner.nextDouble();
            System.out.println("---- [Weerstation krijgt de nieuwe temperatuur] ----");
            weatherStation.publishTemperature(temperature); //                              <---- Publish new value
            System.out.println("---- [Update is klaar] ----");
            System.out.println();
        }
    }
}
