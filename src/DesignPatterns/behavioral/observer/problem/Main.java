package DesignPatterns.behavioral.observer.problem;

public class Main {
    public static void main(String[] args) {
        UserService service = new UserService();
        service.registerUser("John Doe");
        // Violates Open/Closed: Must edit UserService to add/remove channels
        // Not reusable or testable in isolation.
        // Can't change logic order or notify conditionally.
    }
}
