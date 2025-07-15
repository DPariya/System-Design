package DesignPatterns.behavioral.command.problem;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Button copyButton = new Button("COPY", editor);
        Button pasteButton = new Button("PASTE", editor);
        Button undoButton = new Button("UNDO", editor);

        copyButton.click();
        pasteButton.click();
        undoButton.click();

    }
}
