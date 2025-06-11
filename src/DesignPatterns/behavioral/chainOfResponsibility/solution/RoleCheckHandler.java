package DesignPatterns.behavioral.chainOfResponsibility.solution;

public class RoleCheckHandler extends Handler {
    @Override
    public void handler(Request request) {
        if (request.getRole().equals("admin") || request.getRole().equalsIgnoreCase("user")) {
            System.out.println("=> Role check passed for user: " + request.getUserName());
            if (next != null) {
                next.handler(request);
            }
        } else {
            System.out.println("=> Role check failed for user: " + request.getUserName());
        }
    }
}
