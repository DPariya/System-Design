package DesignPatterns.structural.composite.solution;

import java.util.ArrayList;
import java.util.List;

public class Box implements Component {
    private List<Component> items = new ArrayList<>();

    public void add(Component item) {
        items.add(item);
    }

    @Override
    public double getPrice() {
        double total = 0;

        for (Component c : items) {
            total += c.getPrice();
        }
        return total;
    }

}
