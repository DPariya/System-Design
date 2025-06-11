package DesignPatterns.structural.decorator.solution;

public class BlackCoffee extends Coffee {

    @Override
    public String getDescription() {
        return "Black Coffee";
    }

    @Override
    public int getCost() {
        return 120;
    }

}
