package DesignPatterns.behavioral.chainOfResponsibility.solution;

public class Main {
    public static void main(String[] args) {
        // Build chain: Auth → RoleCheck → Order
        Handler auth = new AuthHandler();
        Handler roleCheck = new RoleCheckHandler();
        Handler order = new OrderHandler();

        auth.setNext(roleCheck).setNext(order);

        // Test with valid credentials
        Request validRequest = new Request("admin", "admin123", "admin");
        System.out.println("Processing valid request:");
        auth.handler(validRequest);

        // Test 2: Invalid credentials
        Request invalidAuth = new Request("user123", "wrongpass", "user");
        System.out.println("\n---- Test 2: Invalid Credentials ----");
        auth.handler(invalidAuth);

        // Test 3: Unauthorized role
        Request invalidRole = new Request("user123", "pass123", "guest");
        System.out.println("\n---- Test 3: Unauthorized Role ----");
        auth.handler(invalidRole);

    }
}
