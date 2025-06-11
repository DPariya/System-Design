package DesignPatterns.behavioral.chainOfResponsibility.solution;

public class Request {
    private String username;
    private String password;
    private String role;

    public Request(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getUserName() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }
}
