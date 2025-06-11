package DesignPatterns.structural.adapter.problem;

public class Main {
    public static void main(String[] args) {
        TemperatureSensor sensor = new TemperatureSensor();
        System.out.println("Temperature: " + sensor.getTemperatureFahrenheit() + " °F");
        // But new system expects Celsius
        // Cannot directly use it without conversion logic everywhere!
    }
}
