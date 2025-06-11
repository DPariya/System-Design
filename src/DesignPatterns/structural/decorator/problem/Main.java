package DesignPatterns.structural.decorator.problem;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new CapacchinoCoffee();
        System.out.println(coffee.getDescription() + "  " + coffee.getCost());

        Coffee coffee1 = new CapacchinoWithCoffeeBeans(coffee);
        System.out.println(coffee1.getDescription() + "  " + coffee1.getCost());

        Coffee coffee2 = new Americano();
        System.out.println(coffee2.getDescription() + "  " + coffee2.getCost());
    }
}
