package DesignPatterns.structural.decorator.problem;

public class CapacchinoCoffee extends Coffee {
    @Override
    public String getDescription() {
        return "Capacchino Coffee";
    }

    @Override
    public int getCost() {
        return 60; // Cost of Capacchino Coffee
    }

}
