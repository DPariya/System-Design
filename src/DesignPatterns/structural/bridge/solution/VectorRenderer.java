package DesignPatterns.structural.bridge.solution;

public class VectorRenderer implements DrawingAPI {
    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("Drawing Circle using Vector API at (" + x + "," + y + ") with radius " + radius);
    }
}
