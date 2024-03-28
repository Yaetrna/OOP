package ClassVariable;

public class Account {
    private final int accountID;
    private String accountOwner;
    private double accountBalance;
    private static int nextAccountID = 1001;

    public Account(String accountOwner) {
        this.accountOwner = accountOwner;
        this.accountID = nextAccountID;
        nextAccountID++;
    }

    public int getAccountID() {
        return this.accountID;
    }

    public String getAccountOwner() {
        return this.accountOwner;
    }

    public double getAccountBalance() {
        return this.accountBalance;
    }

    public static int getNextAccountID() {
        return nextAccountID;
    }

    public void setAccountOwner(String accountOwner) {
        this.accountOwner = accountOwner;
    }

    public void deposit(double amount) {
        this.accountBalance += amount;
    }

    public void withdraw(double amount) {
        this.accountBalance -= amount;
    }
}
