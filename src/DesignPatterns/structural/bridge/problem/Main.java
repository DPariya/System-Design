package DesignPatterns.structural.bridge.problem;

public class Main {
    public static void main(String[] args) {
        Circle vectorCircle = new VectorCircle(10, 20, 5);
        Circle rasterCircle = new RasterCircle(15, 25, 10);

        vectorCircle.draw();
        rasterCircle.draw();
    }
    // Every time you add a new Shape or a new Renderer, you need to create a new
    // combination class (e.g., VectorSquare, RasterSquare), which quickly becomes
    // unmaintainable.
}
