package DesignPatterns.creational.singleton.problem;

public class Main {
    public static void main(String[] args) {
        Runnable task1 = () -> {
            DatabaseConnection conn = new DatabaseConnection();
            conn.connect();
            conn.executeQuery("SELECT * FROM users");
        };

        Runnable task2 = () -> {
            DatabaseConnection conn = new DatabaseConnection();
            conn.connect();
            conn.executeQuery("SELECT * FROM orders");
        };

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();
    }
}
