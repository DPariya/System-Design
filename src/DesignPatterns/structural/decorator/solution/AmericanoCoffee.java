package DesignPatterns.structural.decorator.solution;

public class AmericanoCoffee extends Coffee {

    @Override
    public String getDescription() {
        return "Americano Coffee ";
    }

    @Override
    public int getCost() {
        return 10;
    }

}
