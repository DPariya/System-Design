package DesignPatterns.structural.facade.problem;

public class SecurityCode {
    int code;

    public SecurityCode(int code) {
        this.code = code;
    }

    public boolean isValidCode() {
        // In a real application, this would involve more complex logic, possibly
        // checking against a database or an external service.
        return this.code == 1234; // Example security code validation
    }
}
