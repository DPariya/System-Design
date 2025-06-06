package DesignPatterns.creational.builder.problem;

public class Main {
    public static void main(String[] args) {
        // This is hard to read — what does each parameter mean?
        House house = new House(4, 2, true, false, "Gable");

        System.out.println(house);
    }
}
