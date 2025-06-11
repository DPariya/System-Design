package DesignPatterns.structural.decorator.problem;

public class MilkCoffee extends Coffee {
    @Override
    public String getDescription() {
        return "Milk Coffee";
    }

    @Override
    public int getCost() {
        return 50; // Cost of Milk Coffee
    }

}
