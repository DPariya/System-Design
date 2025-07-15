package DesignPatterns.behavioral.strategy.solution;

public class DrivingStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String source, String destination) {
        System.out.println("Driving route from " + source + " to " + destination);
    }
}
