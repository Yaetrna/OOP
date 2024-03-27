package AccountFour;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account(1007, "Emil Braun", 560.5);
        printAccountInformation(account);

        Account account1 = new Account(1009, "Helga Schmitt", 1340.0);
        printAccountInformation(account1);

        Account account2 = new Account(1011, "Stefan Müller", 300.0);
        printAccountInformation(account2);
    }

    private static void printAccountInformation(Account account) {
        System.out.println(account.getAccountID());
        System.out.println(account.getAccountOwner());
        System.out.println(account.getAccountBalance());
    }
}
