package DesignPatterns.structural.facade.solution;

public class Ledger {
    public void makeEntry(int accountId, String txnType, int amount) {
        System.out.println("Making entry in ledger for account ID: " + accountId + ", Transaction Type: " + txnType
                + ", Amount: " + amount);
    }
}
