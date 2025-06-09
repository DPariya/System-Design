package DesignPatterns.creational.singleton.solution;

public class DatabaseConnection {
    private static volatile DatabaseConnection instance;
    private String config;

    private DatabaseConnection() {
        this.config = "DefaultConfig";
        System.out.println("[LOG] New database connection created with config: " + config);
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            synchronized (DatabaseConnection.class) {
                if (instance == null) {
                    System.out.println("[LOG] Creating new singleton instance");
                    instance = new DatabaseConnection();
                } else {
                    System.out.println("[LOG] Reusing existing singleton instance (inside synchronized block)");
                }
            }
        } else {
            System.out.println("[LOG] Reusing existing singleton instance");
        }
        return instance;
    }

    public void connect() {
        System.out.println("[LOG] Connected to database with config: " + config);
    }

    public void executeQuery(String query) {
        System.out.println("[LOG] Executing query: " + query);
    }
}
