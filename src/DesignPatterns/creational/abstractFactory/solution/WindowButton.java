package DesignPatterns.creational.abstractFactory.solution;

public class WindowButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering a button in a Windows style.");
    }

}
