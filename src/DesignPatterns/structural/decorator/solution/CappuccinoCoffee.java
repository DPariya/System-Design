package DesignPatterns.structural.decorator.solution;

public class CappuccinoCoffee extends Coffee {

    @Override
    public String getDescription() {
        return "Cappuccino Coffee";
    }

    @Override
    public int getCost() {
        return 60; // Cost of Cappuccino Coffee
    }

}
