package DesignPatterns.behavioral.memento.problem;

public class TextEditor {
    /*
     * apply the Memento Design Pattern to a Text Editor class where you want to be
     * able to restore previous configurations (like an Undo feature)
     */

    private String colorCode;
    private String background;

    @Override
    public String toString() {
        return "Settings{" +
                "colorCode='" + colorCode + '\'' +
                ", background='" + background + '\'' +
                '}';
    }

    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }

    public void setBackground(String background) {
        this.background = background;
    }
}
