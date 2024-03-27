package AccountThree;

public class Account {
    private int accountID;
    private String accountOwner;
    private double accountBalance;

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
