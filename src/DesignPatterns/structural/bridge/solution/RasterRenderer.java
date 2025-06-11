package DesignPatterns.structural.bridge.solution;

public class RasterRenderer implements DrawingAPI {
    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("Drawing Circle using Raster API at (" + x + "," + y + ") with radius " + radius);
    }
}
