package DesignPatterns.creational.abstractFactory.problem;

public class WindowButton implements Button {
    @Override
    public void paint() {
        System.out.println("Painting a Windows Button");
    }

}
