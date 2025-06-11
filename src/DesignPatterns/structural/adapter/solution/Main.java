package DesignPatterns.structural.adapter.solution;

public class Main {
    public static void main(String[] args) {
        TemperatureSensor legacySensor = new TemperatureSensor();
        TemperatureReader adapter = new TemperatureAdapter(legacySensor);

        System.out.println("Temperature in Celsius: " + adapter.getTemperatureCelsius() + " °C");
    }
}
