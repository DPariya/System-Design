package DesignPatterns.structural.decorator.solution;

public class Latte extends ExtraToppings {
    Coffee coffee; // latte has-a coffee

    public Latte(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Lattee";
    }

    @Override
    public int getCost() {
        return coffee.getCost() + 30; // Assuming Lattee adds 30 to the cost
    }
}
