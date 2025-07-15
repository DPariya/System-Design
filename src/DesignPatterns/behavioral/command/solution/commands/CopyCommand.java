package DesignPatterns.behavioral.command.solution.commands;

import DesignPatterns.behavioral.command.solution.TextEditor;

public class CopyCommand implements Command {
    private TextEditor editor;

    public CopyCommand(TextEditor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.copy();
    }
}
