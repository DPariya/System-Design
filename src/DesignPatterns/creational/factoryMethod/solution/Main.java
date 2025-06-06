package DesignPatterns.creational.factoryMethod.solution;

public class Main {
  public static void main(String[] args) {
        Vehicle vehicle1 = VehicleFactory.createVehicle("Car");
        vehicle1.drive();

        Vehicle vehicle2 = VehicleFactory.createVehicle("Bike");
        vehicle2.drive();

        Vehicle vehicle3 = VehicleFactory.createVehicle("Truck");
        vehicle3.drive();

        // Uncomment to test unknown vehicle
        // Vehicle vehicle4 = VehicleFactory.createVehicle("Bus");
        // vehicle4.drive();
    }
}
