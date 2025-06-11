package DesignPatterns.structural.bridge.solution;

public class Main {
    public static void main(String[] args) {
        Shape circle1 = new Circle(10, 20, 5, new VectorRenderer());
        Shape circle2 = new Circle(15, 25, 10, new RasterRenderer());

        circle1.draw();
        circle2.draw();
    }
}
