package DesignPatterns.creational.factoryMethod.solution;

public class VehicleFactory {
      public static Vehicle createVehicle(String type) {
        if (type == null) {
            return null;
        }

        switch (type.toLowerCase()) {
            case "car":
                return new Car();
            case "bike":
                return new Bike();
            case "truck":
                return new Truck();
            default:
                throw new IllegalArgumentException("Unknown vehicle type: " + type);
        }
    }
}
