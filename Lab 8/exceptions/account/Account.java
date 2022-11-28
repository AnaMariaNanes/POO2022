package exceptions.account;

public class Account {
    private double balance;
    private int number;

    public Account(int number) {
        this.number = number;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    //throw an exception
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= balance) {
            balance -= amount;
        } else {
            double needs = amount - balance;
            throw new InsufficientFundsException(needs);
        }
    }
}
