package DesignPatterns.structural.composite.problem;

import java.util.ArrayList;
import java.util.List;

public class Box {
    private List<Product> products = new ArrayList<>();
    private List<Box> innerBoxes = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addBox(Box box) {
        innerBoxes.add(box);
    }

    public double getTotalPrice() {
        double total = 0.0;
        for (Product p : products) {
            total += p.getPrice();
        }
        for (Box b : innerBoxes) {
            total += b.getTotalPrice();// recursive
        }
        return total;
    }
}
