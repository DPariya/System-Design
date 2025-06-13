package DesignPatterns.behavioral.strategy.problem;

public class Main {
    public static void main(String[] args) {
        NavigationApp walkRoute = new NavigationApp("WALK");
        walkRoute.navigate("Park", "Cafe");

        NavigationApp driveRoute = new NavigationApp("DRIVE");
        driveRoute.navigate("Office", "Home");

        NavigationApp publicRoute = new NavigationApp("PUBLIC_TRANSPORT");
        publicRoute.navigate("Home", "Store");

        // Hardcoded if-else or switch logic.

        // Adding new strategies requires editing existing code (violates Open-Closed
        // Principle).

        // Not flexible for runtime changes.
    }
}
