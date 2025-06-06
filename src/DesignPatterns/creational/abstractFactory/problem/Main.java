package DesignPatterns.creational.abstractFactory.problem;

public class Main {
    public static void main(String[] args) {
        Button button;
        CheckBox checkbox;

        String os = "mac";
        if (os.equals("mac")) {
            button = new MacButton();
            checkbox = new MacCheckBox();
        } else if (os.equals("windows")) {
            button = new WindowButton();
            checkbox = new WindowCheckBox();
        } else {
            throw new IllegalArgumentException("Unknown OS: " + os);
        }
        button.paint();
        checkbox.paint();
        // Output:      
        // Painting a Mac Button
        // Painting a Mac CheckBox
        // or
        // Painting a Windows Button
        // Painting a Window CheckBox

        // This code is not scalable. If we add a new OS, we need to modify the main method.
        // This violates the Open/Closed Principle, as we have to modify existing code to add new functionality.
        // A better approach would be to use an abstract factory pattern, which allows us to create families of related objects
        // without specifying their concrete classes.


    }
}
