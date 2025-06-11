package DesignPatterns.behavioral.chainOfResponsibility.solution;

public class AuthHandler extends Handler {
    @Override
    public void handler(Request request) {
        if (request.getUserName().equals("admin") && request.getPassword().equals("admin123")) {
            System.out.println("=> Authentication successful for user: " + request.getUserName());
            if (next != null) {
                next.handler(request);
            }
        } else {
            System.out.println("=> Authentication failed for user: " + request.getUserName());
        }
    }
}
