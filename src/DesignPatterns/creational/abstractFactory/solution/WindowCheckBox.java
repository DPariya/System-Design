package DesignPatterns.creational.abstractFactory.solution;

public class WindowCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("You have created a Window CheckBox.");
    }

}
