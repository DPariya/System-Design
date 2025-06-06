package DesignPatterns.creational.prototype.problem;

import java.util.ArrayList;
import java.util.List;

public class Enemy {
    private String type;
    private int health;
    private List<Weapon> weapons;

    public Enemy(String type, int health) {
        this.type = type;
        this.health = health;
        this.weapons = new ArrayList<>();
    }

    public void addWeapon(Weapon weapon) {
        weapons.add(weapon);
    }

    public void display() {
        System.out.print("Enemy type: " + type + ", health: " + health + ", weapons: ");
        System.out.println(weapons);
    }
}
