package DesignPatterns.creational.factoryMethod.problem;

/*
Scenario: Suppose you have different types of vehicles (Car, Bike, Truck). 
You want to create these objects based on some input, but without a factory, 
your code might be messy and tightly coupled to the concrete classes. */
public interface Vehicle {
    void drive();
}

class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a Car");
    }
}

class Bike implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Riding a Bike");
    }
}

class Truck implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a Truck");
    }
}
