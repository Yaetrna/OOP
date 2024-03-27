package Constructors;

public class Account {
    private int accountID;
    private String accountOwner;
    private double accountBalance;

    public Account(int accountID) {
        this.accountID = accountID;
    }
    public Account(int accountID, String accountOwner) {
        this.accountID = accountID;
        this.accountOwner = accountOwner;
    }
    public Account(int accountID, double accountBalance) {
        this.accountID = accountID;
        this.accountBalance = accountBalance;
    }
    public Account(int accountID, String accountOwner, double accountBalance) {
        this.accountID = accountID;
        this.accountOwner = accountOwner;
        this.accountBalance = accountBalance;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public void setAccountOwner(String accountOwner) {
        this.accountOwner = accountOwner;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
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

    public void deposit(double amount) {
        this.accountBalance += amount;
    }

    public void withdraw(double amount) {
        this.accountBalance -= amount;
    }
}
