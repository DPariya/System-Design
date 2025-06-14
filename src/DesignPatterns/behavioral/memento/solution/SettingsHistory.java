package DesignPatterns.behavioral.memento.solution;

import java.util.Stack;

// Caretaker - manages the memento. keeps track
public class SettingsHistory {
    private final Stack<SettingsMemento> history = new Stack<>();

    public void save(SettingsMemento memento) {
        history.push(memento);
    }

    public SettingsMemento undo() {
        if (!history.isEmpty()) {
            return history.pop();
        }
        return null;
    }

}
