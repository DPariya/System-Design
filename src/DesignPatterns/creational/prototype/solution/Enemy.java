package DesignPatterns.creational.prototype.solution;

import java.util.ArrayList;
import java.util.List;

public class Enemy implements Cloneable {
    private String type;
    private int health;
    private List<Weapon> weapons;

    public Enemy(String type, int health) {
        this.type = type;
        this.health = health;
        this.weapons = new ArrayList<>();
    }


    public Enemy(int health, String type, List<Weapon> weapons) {
        this.health = health;
        this.type = type;
        this.weapons = weapons;
    }

    public void addWeapon(Weapon weapon) {
        weapons.add(weapon);
    }

    public void display() {
        System.out.print("Enemy type: " + type + ", health: " + health + ", weapons: ");
        System.out.println(weapons);
    }

    @Override
    protected Enemy clone() {
        try {
            Enemy cloned = (Enemy) super.clone();
            // Deep clone weapons list
            cloned.weapons = new ArrayList<>();
            for (Weapon w : this.weapons) {
                cloned.weapons.add(w.clone());
            }
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Enemy clone not supported", e);
        }
    }
}