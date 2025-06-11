package DesignPatterns.behavioral.observer.solution;

public class EmailSender implements Observer {
    @Override
    public void update(String userName) {
        System.out.println("Email send to " + userName);
    }

}
