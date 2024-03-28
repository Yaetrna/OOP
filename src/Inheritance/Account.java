package Inheritance;

public class Account {
    protected int accountID;
    protected String accountOwner;
    protected double accountBalance;

    public void deposit(double amount) {
        this.accountBalance += amount;
    }

    public void withdraw(double amount) {
        this.accountBalance -= amount;
    }

    public double getAccountBalance() {
        return this.accountBalance;
    }
}
