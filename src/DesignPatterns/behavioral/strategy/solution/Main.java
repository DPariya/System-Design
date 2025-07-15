package DesignPatterns.behavioral.strategy.solution;

public class Main {
    public static void main(String[] args) {
        NavigationContext context = new NavigationContext();

        context.setStrategy(new DrivingStrategy());
        context.navigate("Home", "Office");

        context.setStrategy(new WalkingStrategy());
        context.navigate("Park", "cafe");

        context.setStrategy(new PublicTransportStrategy());
        context.navigate("Home", "Store");
    }
}
