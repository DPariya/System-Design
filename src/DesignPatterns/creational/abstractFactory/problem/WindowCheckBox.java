package DesignPatterns.creational.abstractFactory.problem;

public class WindowCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Painting a Window CheckBox");
    }

}
