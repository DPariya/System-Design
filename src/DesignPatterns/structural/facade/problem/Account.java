package DesignPatterns.structural.facade.problem;

public class Account {
    int accountNumber;
    String accountHolderName;

    public Account(int accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    public boolean checkAccount() {
        Account account1 = new Account(123456, "John Doe");
        return account1.equals(this);

    }
}
