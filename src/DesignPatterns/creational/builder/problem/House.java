package DesignPatterns.creational.builder.problem;


public class House {
    private int windows;
    private int doors;
    private boolean hasGarage;
    private boolean hasSwimmingPool;
    private String roofType;

    // Constructor with many parameters
    public House(int windows, int doors, boolean hasGarage, boolean hasSwimmingPool, String roofType) {
        this.windows = windows;
        this.doors = doors;
        this.hasGarage = hasGarage;
        this.hasSwimmingPool = hasSwimmingPool;
        this.roofType = roofType;
    }

    @Override
    public String toString() {
        return "House [windows=" + windows + ", doors=" + doors + ", hasGarage=" + hasGarage +
                ", hasSwimmingPool=" + hasSwimmingPool + ", roofType=" + roofType + "]";
    }
}
