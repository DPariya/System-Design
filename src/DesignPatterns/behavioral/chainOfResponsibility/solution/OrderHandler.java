package DesignPatterns.behavioral.chainOfResponsibility.solution;

public class OrderHandler extends Handler {
    @Override
    public void handler(Request request) {
        System.out.println("=> Order placed successfully by: " + request.getUserName());
    }

}
