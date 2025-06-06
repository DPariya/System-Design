package DesignPatterns.creational.prototype.solution;

public class Main {
    /**
     * @param args
     * @throws CloneNotSupportedException
     */
    public static void main(String[] args) throws CloneNotSupportedException{
        Enemy originalEnemy = new Enemy("Orc", 100);
        originalEnemy.addWeapon(new Weapon("Sword"));
        originalEnemy.addWeapon(new Weapon("Shield"));

        Enemy clonedEnemy = originalEnemy.clone();

        originalEnemy.display();
        clonedEnemy.display();

        clonedEnemy.addWeapon(new Weapon("Bow"));

        System.out.println("After adding Bow to cloned enemy:");
        originalEnemy.display();  // weapons: Sword, Shield
        clonedEnemy.display();    // weapons: Sword, Shield, Bow
    }
}
