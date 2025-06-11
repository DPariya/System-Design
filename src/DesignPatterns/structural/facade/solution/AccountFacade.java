package DesignPatterns.structural.facade.solution;

public class AccountFacade {
    Account account;
    Wallet wallet;
    SecurityCode securityCode;
    Ledger ledger;
    Notification notification;

    public AccountFacade() {
        this.account = new Account(123456, "John Doe");
        this.wallet = new Wallet(1000);
        this.securityCode = new SecurityCode(1234);
        this.ledger = new Ledger();
        this.notification = new Notification();
    }

    public void addMoneyToWallet(int amount) {
        account.checkAccount();
        if (securityCode.isValidCode()) {
            int newBalance = wallet.creditBalance(amount);
            ledger.makeEntry(account.accountNumber, "CREDIT", amount);
            notification.sendWalletCreditNotification(account.accountNumber, amount);
            System.out.println("New wallet balance: " + newBalance);
            System.out.println("");
        } else {
            System.out.println("Invalid account or security code.");
        }
    }

    public void deductMoneyFromWallet(int amount) throws Exception {
        account.checkAccount();
        if (securityCode.isValidCode()) {
            int newBalance = wallet.debitBalance(amount);
            ledger.makeEntry(account.accountNumber, "DEBIT", amount);
            notification.sendWalletDebitNotification(account.accountNumber, amount);
            System.out.println("New wallet balance: " + newBalance);
            System.out.println("");
        }
    }

}
