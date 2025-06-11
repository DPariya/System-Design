package DesignPatterns.behavioral.chainOfResponsibility.problem;

public class Main {
    public static void main(String[] args) {
        OrderService order = new OrderService();
        System.out.println("---Test case 1 : Valid user---");
        Request request1 = new Request("user123", "pass123", "admin");
        order.processOrder(request1);

        System.out.println();
        System.out.println("---Test case 2 : Invalid user---");
        Request request2 = new Request("user123", "wrongpass", "admin");
        order.processOrder(request2);

        System.out.println();
        System.out.println("---Test case 3 : Invalid Role ---");
        Request request3 = new Request("user123", "pass123", "admin111");
        order.processOrder(request3);

        // No Reusability
        // Open/Closed Violation : Adding new checks (e.g., logging, geo-restriction)
        // means modifying
        // Difficult to Scale : Long chains of nested conditions grow as the business
        // rules expand

    }
}
