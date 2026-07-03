/**
 * Question Two - Part (c)
 * Simple payment/account system demonstrating the checked exception.
 */
public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    // Declares "throws" because InsufficientFundsException is checked
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException(
                "Cannot withdraw " + amount + ": balance is only " + balance);
        }
        balance -= amount;
    }

    public static void main(String[] args) {
        Account acc = new Account(100.0);

        try {
            System.out.println("Withdrawing 40...");
            acc.withdraw(40.0);
            System.out.println("New balance: " + acc.getBalance());

            System.out.println("Withdrawing 200...");
            acc.withdraw(200.0); // this will throw
            System.out.println("New balance: " + acc.getBalance()); // never reached
        } catch (InsufficientFundsException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
    }
}
