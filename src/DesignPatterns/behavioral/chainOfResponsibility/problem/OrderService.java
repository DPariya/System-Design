package DesignPatterns.behavioral.chainOfResponsibility.problem;

public class OrderService {
    public void processOrder(Request request) {
        // step 1: Check authentication
        if (request.getUserName().equals("user123") && request.getPassword().equals("pass123")) {
            System.out.println("Authentication successful for user: " + request.getUserName());
            // step 2: Check role
            if (request.getRole().equals("admin") || request.getRole().equalsIgnoreCase("user")) {
                System.out.println("=> Role '" + request.getRole() + "' authorized.");
                // step 3: Process order
                System.out.println("=> Order placed successfully by: " + request.getUserName());
            } else {
                System.out.println("=> Role unauthorized. Access denied.");
            }
        } else {
            System.out.println("=> Authentication failed. Access denied.");
        }

    }

}
