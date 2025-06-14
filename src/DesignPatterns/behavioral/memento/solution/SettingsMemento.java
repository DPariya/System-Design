package DesignPatterns.behavioral.memento.solution;

/**
 * Memento :This refers to current moment of an originator - editor
 */
public class SettingsMemento {
    private final String colorCode;
    private final String background;

    public SettingsMemento(String colorCode, String background) {
        this.colorCode = colorCode;
        this.background = background;
    }

    public String getColorCode() {
        return colorCode;
    }

    public String getBackground() {
        return background;
    }

}
