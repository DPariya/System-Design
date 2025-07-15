package DesignPatterns.behavioral.strategy.solution;

public class WalkingStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String source, String destination) {
        System.out.println("Walking route from " + source + " to " + destination);
    }
}
