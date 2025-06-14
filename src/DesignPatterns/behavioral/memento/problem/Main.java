package DesignPatterns.behavioral.memento.problem;

public class Main {
    public static void main(String[] args) {
        TextEditor settings = new TextEditor();
        settings.setBackground("Bg");
        settings.setColorCode("ffffff");
        System.out.println(settings.toString());
        settings.setBackground("Background");
        settings.setColorCode("f5f7ff");
        System.out.println(settings.toString());
        // ❌ Can't go back to previous state
    }
}
