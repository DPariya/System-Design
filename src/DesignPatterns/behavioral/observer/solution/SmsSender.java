package DesignPatterns.behavioral.observer.solution;

public class SmsSender implements Observer {
    @Override
    public void update(String userName) {
        System.out.println("Sms send to " + userName);
    }

}
