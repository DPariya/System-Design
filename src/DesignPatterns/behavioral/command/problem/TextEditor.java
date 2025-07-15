package DesignPatterns.behavioral.command.problem;

public class TextEditor {
    public void copy() {
        System.out.println("Copied Text");
    }

    public void paste() {
        System.out.println("Pasted Text");
    }

    public void undo() {
        System.out.println("Undid last Action");
    }
}
