package DesignPatterns.structural.composite.problem;

public class Main {
    public static void main(String[] args) {
        Product pen = new Product("Pen", 10.5);
        Product noteBook = new Product("Notebook", 20.0);

        Box b1 = new Box();
        b1.addProduct(pen);
        b1.addProduct(noteBook);

        Box b2 = new Box();
        b2.addProduct(new Product("Pencil", 5.0));

        Box mainBox = new Box();
        mainBox.addBox(b1);
        mainBox.addBox(b2);

        System.out.println("Total price of all products in the main box: " + mainBox.getTotalPrice());

        // Tight coupling, and violates Open-Closed Principle.
        // Output: Total price of all products in the main box: 35.5
        // This code demonstrates the problem with the composite pattern
        // where the total price calculation is not straightforward
        // and requires knowledge of both products and boxes.
        // This can lead to issues if the structure becomes more complex
        // or if additional operations are needed on the composite structure.
        // The composite pattern is not being used effectively here
        // because it mixes different types of objects (Products and Boxes)
        // and requires special handling for each type.
        // This can lead to code that is harder to maintain and extend.
        // A better approach would be to use a more consistent structure
        // where all objects can be treated uniformly, such as using an interface
        // or an abstract class that defines a common method for calculating the total
        // price.

    }
}
