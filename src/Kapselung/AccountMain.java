package Kapselung;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();
        account.setAccountID(1007);
        account.setAccountOwner("Emil Braun");
        account.setAccountBalance(560.60);

        printAccountInformation(account);

        account.deposit(200.0);
        account.withdraw(400.0);

        System.out.println("Aktueller Kontostand: " + account.getAccountBalance());

        Account account1 = new Account();
        account1.setAccountID(1009);
        account1.setAccountOwner("Helga Schmitt");
        account1.setAccountBalance(1340.00);

        printAccountInformation(account1);
    }

    private static void printAccountInformation(Account account) {
        System.out.println("Kunde: " + account.getAccountOwner());
        System.out.println("Ihre Kontonummer lautet: " + account.getAccountID());
        System.out.println("Aktueller Kontostand: " + account.getAccountBalance());
    }
}
