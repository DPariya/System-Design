package DesignPatterns.creational.builder.solution;

public class Main {
 public static void main(String[] args) {
        House house1 = new House.HouseBuilder(4, 2)
                .setGarage(true)
                .setRoofType("Gable")
                .build();

        House house2 = new House.HouseBuilder(6, 3)
                .setSwimmingPool(true)
                .build();

        System.out.println(house1);
        System.out.println(house2);
    }
}
