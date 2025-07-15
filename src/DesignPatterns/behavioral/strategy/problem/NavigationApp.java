package DesignPatterns.behavioral.strategy.problem;

public class NavigationApp {
    private String mode;

    public NavigationApp(String mode) {
        this.mode = mode;
    }

    public void navigate(String source, String destination) {
        if (mode.equals("WALK")) {
            System.out.println("Walking route from " + source + " to " + destination);
        } else if (mode.equals("DRIVE")) {
            System.out.println("Driving route from " + source + " to " + destination);
        } else if (mode.equals("PUBLIC_TRANSPORT")) {
            System.out.println("Public Transport route from " + source + " to " + destination);
        } else {
            System.out.println("Unknown route");
        }
    }
}
