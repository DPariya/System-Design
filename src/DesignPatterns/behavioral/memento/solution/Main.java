package DesignPatterns.behavioral.memento.solution;

/**
 * The Memento Method Design Pattern is a behavioral design pattern that allows
 * an object to capture
 * and store its internal state without exposing its implementation details.
 * This pattern enables
 * the restoration of an object to a previous state, facilitating the
 * implementation of features
 * such as undo/redo functionality. The Memento pattern decouples the object’s
 * state from its
 * behavior, allowing the object to maintain its state history while preventing
 * direct access to its
 * internal state.
 *
 * 1. Originator : Represents an object, for which state need to be saved and
 * restored. - TextEditor
 * 2. Memento : holds the state of the Memento. - Memento - hold the states of
 * my editor.
 * 3. Caretaker: managers the states. - Manages the states in a Memento.
 */
public class Main {
    public static void main(String[] args) {
        TextEditorOriginator settings = new TextEditorOriginator();
        SettingsHistory history = new SettingsHistory();

        settings.setBackground("Bg");
        settings.setColorCode("ffffff");

        history.save(settings.save());
        System.out.println("Initial : " + settings);

        settings.setBackground("Background");
        settings.setColorCode("f5f7ff");
        history.save(settings.save());
        System.out.println("Modified: " + settings);

        // Undo to previous state
        settings.restore(history.undo());
        System.out.println("Undo 1: " + settings);

        settings.restore(history.undo());
        System.out.println("Undo 2: " + settings);

    }
}
