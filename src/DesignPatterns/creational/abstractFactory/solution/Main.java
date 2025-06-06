package DesignPatterns.creational.abstractFactory.solution;

public class Main {
    public static void main(String[] args) {
        String os = "mac";

        GuiFactory factory = getFactory(os);
        Button button = factory.createButton();
        CheckBox checkBox = factory.createCheckBox();
        button.paint();
        checkBox.paint();
        System.out.println("Factory: " + factory.getClass().getSimpleName());
        System.out.println("Button: " + button.getClass().getSimpleName());
        System.out.println("CheckBox: " + checkBox.getClass().getSimpleName());
    
    }

    public static GuiFactory getFactory(String os) {
        if (os.equalsIgnoreCase("mac")) {
            return new MacGuiFactory();
        } else {
            return new WindowGuiFactory();
        }
    }
}
