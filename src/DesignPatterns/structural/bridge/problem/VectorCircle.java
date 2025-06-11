package DesignPatterns.structural.bridge.problem;

public class VectorCircle extends Circle {
    private int x, y, radius;

    public VectorCircle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle using Vector API at (" + x + "," + y + ") with radius " + radius);
    }
}
