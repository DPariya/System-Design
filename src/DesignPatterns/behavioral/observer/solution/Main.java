package DesignPatterns.behavioral.observer.solution;

public class Main {
    public static void main(String[] args) {
        UserService service = new UserService();

        service.addObserver(new EmailSender());
        service.addObserver(new SmsSender());
        service.addObserver(new PushNotification());

        service.registerUser("John Doe");
    }
}
