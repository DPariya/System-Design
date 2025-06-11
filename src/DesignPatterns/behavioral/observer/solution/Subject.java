package DesignPatterns.behavioral.observer.solution;

public interface Subject {
    void addObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers(String userName);
}
