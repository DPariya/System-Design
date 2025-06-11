package DesignPatterns.structural.decorator.problem;

public class CapacchinoWithCoffeeBeans extends Coffee {
    private Coffee coffee;

    public CapacchinoWithCoffeeBeans(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", with Coffee Beans";
    }

    @Override
    public int getCost() {
        return coffee.getCost() + 20; // Adding cost for Coffee Beans
    }

}
