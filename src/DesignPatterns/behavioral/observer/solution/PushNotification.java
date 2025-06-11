package DesignPatterns.behavioral.observer.solution;

public class PushNotification implements Observer {
    @Override
    public void update(String userName) {
        System.out.println("Push Notification send to " + userName);
    }

}
