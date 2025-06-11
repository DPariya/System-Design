package DesignPatterns.structural.facade.solution;

public class Main {
    public static void main(String[] args) throws Exception {
        // Check account
        // Check security PIN
        // Credit/debit balance
        // Make ledger entry
        // Send notification

        // Dependency Injection
        // Account account = new Account(123456, "John Doe");
        // Wallet wallet = new Wallet(100);
        // SecurityCode code = new SecurityCode(1234);
        // Ledger ledger = new Ledger();
        // Notification notification = new Notification();

        AccountFacade facade = new AccountFacade();
        facade.addMoneyToWallet(100);
        facade.addMoneyToWallet(200);
        facade.deductMoneyFromWallet(100);

    }
}
