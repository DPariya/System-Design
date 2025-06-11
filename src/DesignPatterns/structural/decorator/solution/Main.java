package DesignPatterns.structural.decorator.solution;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Milk(new CappuccinoCoffee()); // Milk IS-A Coffee
        System.out.println(coffee.getDescription() + " costs: " +
                coffee.getCost());

        Coffee coffee1 = new Latte(new Milk(new Beans(new CappuccinoCoffee())));
        System.out.println(coffee1.getDescription() + " costs: " +
                coffee1.getCost());

        Coffee coffee2 = new Beans(new Latte(new Milk(new CappuccinoCoffee())));
        System.out.println(coffee2.getDescription() + " costs: " +
                coffee2.getCost());

        Coffee coffee3 = new Beans(new Latte(new AmericanoCoffee()));
        System.out.println(coffee3.getDescription() + " costs: " +
                coffee3.getCost());

    }
}
