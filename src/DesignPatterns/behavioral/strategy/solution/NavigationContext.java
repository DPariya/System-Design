package DesignPatterns.behavioral.strategy.solution;

public class NavigationContext {
    private RouteStrategy strategy;

    public void setStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public void navigate(String source, String destination) {
        if (strategy == null) {
            throw new IllegalStateException("Route Strategy is not set");
        }
        strategy.buildRoute(source, destination);
    }
}
