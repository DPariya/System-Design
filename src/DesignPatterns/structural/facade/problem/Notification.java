package DesignPatterns.structural.facade.problem;

public class Notification {
    public void sendWalletCreditNotification(int accountId, int amount) {
        System.out.println("Sending wallet credit notification for Account ID: " + accountId + ", Amount: " + amount);
    }

    public void sendWalletDebitNotification(int accountId, int amount) {
        System.out.println("Sending wallet debit notification for Account ID: " + accountId + ", Amount: " + amount);
    }
}
