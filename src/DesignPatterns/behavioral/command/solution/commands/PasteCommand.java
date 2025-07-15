package DesignPatterns.behavioral.command.solution.commands;

import DesignPatterns.behavioral.command.solution.TextEditor;

public class PasteCommand implements Command {
    private TextEditor editor;

    public PasteCommand(TextEditor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.paste();
    }
}
