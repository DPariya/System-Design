package DesignPatterns.structural.decorator.solution;

public class Beans extends ExtraToppings {

    Coffee coffee;

    public Beans(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Beans";
    }

    @Override
    public int getCost() {
        return coffee.getCost() + 20; // Cost of Beans topping
    }

}
