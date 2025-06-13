package DesignPatterns.behavioral.strategy.solution;

public class PublicTransportStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String source, String destination) {
        System.out.println("Public Transport route from " + source + " to " + destination);
    }
}
