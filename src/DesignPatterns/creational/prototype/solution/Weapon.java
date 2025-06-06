package DesignPatterns.creational.prototype.solution;

public class Weapon implements Cloneable{
    private final String name;

    public Weapon(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    protected Weapon clone() {
        try {
            return (Weapon) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Weapon clone not supported", e);
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
