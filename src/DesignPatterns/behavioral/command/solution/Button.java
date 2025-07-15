package DesignPatterns.behavioral.command.solution;

import DesignPatterns.behavioral.command.solution.commands.Command;

public class Button {
    private String label;
    private Command command;

    public Button(String label, Command command) {
        this.label = label;
        this.command = command;
    }

    public void click() {
        System.out.print(label + " -> ");
        command.execute();
    }

}
