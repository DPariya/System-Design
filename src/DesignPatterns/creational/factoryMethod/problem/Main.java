package DesignPatterns.creational.factoryMethod.problem;

public class Main {
     public static void main(String[] args) {
        String vehicleType = "Car";

        Vehicle vehicle = null;

        if (vehicleType.equalsIgnoreCase("Car")) {
            vehicle = new Car();
        } else if (vehicleType.equalsIgnoreCase("Bike")) {
            vehicle = new Bike();
        } else if (vehicleType.equalsIgnoreCase("Truck")) {
            vehicle = new Truck();
        } else {
            System.out.println("Unknown vehicle type");
            return;
        }

        vehicle.drive();
    }
}
