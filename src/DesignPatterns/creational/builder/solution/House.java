package DesignPatterns.creational.builder.solution;

public class House {
    private int windows;
    private int doors;
    private boolean hasGarage;
    private boolean hasSwimmingPool;
    private String roofType;

    private House(HouseBuilder builder) {
        this.windows = builder.windows;
        this.doors = builder.doors;
        this.hasGarage = builder.hasGarage;
        this.hasSwimmingPool = builder.hasSwimmingPool;
        this.roofType = builder.roofType;
    }

    @Override
    public String toString() {
        return "House [windows=" + windows + ", doors=" + doors + ", hasGarage=" + hasGarage +
                ", hasSwimmingPool=" + hasSwimmingPool + ", roofType=" + roofType + "]";
    }

    public static class HouseBuilder {
        private int windows;
        private int doors;
        private boolean hasGarage = false; // default
        private boolean hasSwimmingPool = false; // default
        private String roofType = "Flat"; // default

        public HouseBuilder(int windows, int doors) {
            this.windows = windows;
            this.doors = doors;
        }

        public HouseBuilder setGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public HouseBuilder setSwimmingPool(boolean hasSwimmingPool) {
            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }

        public HouseBuilder setRoofType(String roofType) {
            this.roofType = roofType;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}
