package DesignPatterns.structural.facade.problem;

public class Main {
    public static void main(String[] args) {
        // Check account
        // Check security PIN
        // Credit/debit balance
        // Make ledger entry
        // Send notification

        Account account = new Account(123456, "John Doe");
        Wallet wallet = new Wallet(100);
        SecurityCode securityCode = new SecurityCode(1234);
        Ledger ledger = new Ledger();
        Notification notification = new Notification();

        creditBalance(account, wallet, securityCode, ledger, notification, 50);
        debitBalance(account, wallet, securityCode, ledger, notification, 30);

        // Note: In a real-world application, you would likely have more complex logic
        // for account validation,
        // security code validation, and error handling.
        // This is a simplified example to demonstrate the facade pattern.

    }

    public static void creditBalance(Account account, Wallet wallet, SecurityCode securityCode, Ledger ledger,
            Notification notification, int amount) {
        if (securityCode.isValidCode()) {
            int newBalance = wallet.creditBalance(amount);
            ledger.makeEntry(account.accountNumber, "CREDIT", amount);
            notification.sendWalletCreditNotification(account.accountNumber, amount);
            System.out.println("New wallet balance: " + newBalance);
        } else {
            System.out.println("Invalid account or security code.");
        }
    }

    public static void debitBalance(Account account, Wallet wallet, SecurityCode securityCode, Ledger ledger,
            Notification notification, int amount) {
        if (securityCode.isValidCode()) {
            try {
                int newBalance = wallet.debitBalance(amount);
                ledger.makeEntry(account.accountNumber, "DEBIT", amount);
                notification.sendWalletDebitNotification(account.accountNumber, amount);
                System.out.println("New wallet balance: " + newBalance);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Invalid account or security code.");
        }
    }
}
