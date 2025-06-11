package DesignPatterns.structural.facade.solution;

public class Wallet {
    int balance;

    public Wallet(int balance) {
        this.balance = balance;
    }

    public int creditBalance(int amount) {
        this.balance += amount;
        System.out.println("Credited " + amount + " to wallet. New balance: " + balance);
        return balance;
    }

    public int debitBalance(int amount) throws Exception {
        if (amount > this.balance) {
            throw new Exception("Insufficient balance to debit " + amount);
        }
        this.balance -= amount;
        return this.balance;

    }
}
