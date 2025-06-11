package DesignPatterns.structural.composite.solution;

public class Main {
    public static void main(String[] args) {
        Component pen = new Product("Pen", 1.50);
        Component noteBook = new Product("Notebook", 3.00);

        Box b1 = new Box();
        b1.add(pen);
        b1.add(noteBook);

        Box b2 = new Box();
        b2.add(new Product("Pencil", 0.75));

        Box mainBox = new Box();
        mainBox.add(b1);
        mainBox.add(b2);

        mainBox.add(new Product("Eraser", 0.50));
        System.out.println("Total price: " + mainBox.getPrice());

        // Output: Total price: 6.75
        // Explanation:
        // This demonstrates the Composite Design Pattern, where both individual
        // products and boxes
        // containing other components can be treated uniformly.

        // Treats both Product and Box uniformly via Component interface.

        // Recursive price calculation becomes cleaner and more extensible.

        // Allows adding new types (e.g., bundles, discount wrappers) with minimal
        // change
    }
}
