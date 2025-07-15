package DesignPatterns.behavioral.command.problem;

public class Button {
    private String label;
    private TextEditor editor;

    public Button(String label, TextEditor editor) {
        this.label = label;
        this.editor = editor;
    }

    public void click() {
        switch (label) {
            case "COPY" -> editor.copy();
            case "PASTE" -> editor.paste();
            case "UNDO" -> editor.undo();

            default -> System.out.println("Invalid Action");
        }
    }
}
