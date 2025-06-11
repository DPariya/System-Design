package DesignPatterns.behavioral.observer.problem;

public class UserService {
    public void registerUser(String userName) {
        System.out.println("User registered successfully: " + userName);
        // Notify observers about the new user registration
        EmailSender.send(userName);
        SmsSender.send(userName);
        PushNotification.send(userName)
    }

}
