package DesignPatterns.behavioral.chainOfResponsibility.problem;

// We’ll do the same checks (authentication → role check → order) in one big method.
public class Request {
    String userName;
    String password;
    String role;

    public Request(String userName, String password, String role) {
        this.userName = userName;
        this.password = password;
        this.role = role;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

}
