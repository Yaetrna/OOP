package Klassenvariable;

public class AccountMain {
    public static void main(String[] args) {
        System.out.println("Nächste Kontonummer: " + Account.getNextAccountID());
        Account account = new Account("Emil Braun");
        account.deposit(560.6);

        Account account1 = new Account("Helga Schmitt");
        account1.deposit(1340.0);

        Account account2 = new Account("Stefan Müller");
        account2.deposit(300.0);

        printAccountInformation(account);
        printAccountInformation(account1);
        printAccountInformation(account2);
    }

    private static void printAccountInformation(Account account) {
        System.out.println(account.getAccountID());
        System.out.println(account.getAccountOwner());
        System.out.println(account.getAccountBalance());
    }
}
