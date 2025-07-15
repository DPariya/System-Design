package DesignPatterns.behavioral.command.solution;

import DesignPatterns.behavioral.command.solution.commands.*;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        Button copyButton = new Button("COPY", new CopyCommand(editor));
        Button pasteButton = new Button("PASTE", new PasteCommand(editor));
        Button undoButton = new Button("UNDO", new UndoCommand(editor));

        copyButton.click();
        pasteButton.click();
        undoButton.click();

    }
}
