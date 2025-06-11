
package DesignPatterns.structural.adapter.solution;

// Adapter that adapts Fahrenheit to Celsius
public class TemperatureAdapter implements TemperatureReader {
    private TemperatureSensor sensor;

    public TemperatureAdapter(TemperatureSensor sensor) {
        this.sensor = sensor;
    }

    @Override
    public double getTemperatureCelsius() {
        double fahrenheit = sensor.getTemperatureFahrenheit();
        return (fahrenheit - 32) * 5 / 9;
    }
}
