package DesignPatterns.creational.prototype.problem;

public class Main {
        public static void main(String[] args) {
        Enemy enemy1 = new Enemy("Orc", 100);
        enemy1.addWeapon(new Weapon("Sword"));
        enemy1.addWeapon(new Weapon("Shield"));

        enemy1.display();

        Enemy enemy2 = new Enemy("Orc", 100); // violate: DRY  
        enemy2.addWeapon(new Weapon("Sword"));
        enemy2.addWeapon(new Weapon("Shield"));

        enemy2.display();
        // Problem: If we want to change enemy1's weapons, we have to manually copy them to enemy2
        // This is error-prone and violates the DRY principle.
        // enemy2.setWeapons(enemy1.getWeapons()); // ❌
       //enemy1.getWeapons().add(new Weapon("Bow")); // enemy2 also affected 
    }
}
