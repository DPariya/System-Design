package DesignPatterns.creational.singleton.problem;

import java.time.LocalDateTime;

public class DatabaseConnection {
    private final String config;

    public DatabaseConnection() {
        System.out.println("[LOG] New database connection created at " + LocalDateTime.now());
        this.config = "DefaultConfig";
    }

    public void connect() {
        System.out.println("[LOG] Connected to database with config: " + config);
    }

    public void executeQuery(String query) {
        System.out.println("[LOG] Executing query: " + query);
    }
}
