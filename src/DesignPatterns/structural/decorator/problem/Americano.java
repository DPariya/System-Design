package DesignPatterns.structural.decorator.problem;

public class Americano extends Coffee {
    @Override
    public String getDescription() {
        return "Americano";
    }

    @Override
    public int getCost() {
        return 50;
    }
}
