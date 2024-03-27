package AccountOne;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();
        account.accountID = 1007;
        account.accountOwner = "Emil Braun";
        account.accountBalance = 560.60;

        printAccountInformation(account);

        account.deposit(200.0);
        account.withdraw(400.0);

        System.out.println("Aktueller Kontostand: " + account.getAccountBalance());

        Account account1 = new Account();
        account1.accountID = 1009;
        account1.accountOwner = "Helga Schmitt";
        account1.accountBalance = 1340.00;

        printAccountInformation(account1);
    }

    private static void printAccountInformation(Account account) {
        System.out.println("Kunde: " + account.accountOwner);
        System.out.println("Ihre Kontonummer lautet: " + account.accountID);
        System.out.println("Aktueller Kontostand: " + account.accountBalance);
    }
}
