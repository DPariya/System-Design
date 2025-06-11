package DesignPatterns.behavioral.observer.solution;

import java.util.ArrayList;
import java.util.List;

public class UserService implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String userName) {
        for (Observer o : observers) {
            System.out.println("\n" + o.getClass().getSimpleName() + " notified.");
            o.update(userName);
        }

    }

    public void registerUser(String username) {
        System.out.println("=> User " + username + " registered.");
        notifyObservers(username);
    }
}
