package DesignPatterns.behavioral.memento.solution;

// originator
public class TextEditorOriginator {
    private String colorCode;
    private String background;

    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public SettingsMemento save() {
        return new SettingsMemento(colorCode, background);
    }

    public void restore(SettingsMemento memento) {
        this.colorCode = memento.getColorCode();
        this.background = memento.getBackground();
    }

    @Override
    public String toString() {
        return "Settings {" +
                "colorCode='" + colorCode + '\'' +
                ", background='" + background + '\'' +
                '}';

    }

}
