package DesignPatterns.structural.decorator.solution;

public class Milk extends ExtraToppings {

    Coffee coffee;

    public Milk(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Milk";
    }

    @Override
    public int getCost() {
        return coffee.getCost() + 10; // Cost of Milk topping
    }

}
