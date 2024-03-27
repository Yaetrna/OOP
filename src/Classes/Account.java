package Classes;

public class Account {
    int accountID;
    double accountBalance;
    String accountOwner;

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
