package day07;

public class BankAccount {
	 // private fields
    private String accountHolder;
    private double balance;

    // constructor
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // deposit method
    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println(amount + " deposited.");
    }

    // withdraw method
    public void withdraw(double amount) {

        if (amount <= balance) {
            balance = balance - amount;
            System.out.println(amount + " withdrawn.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // getter
    public double getBalance() {
        return balance;
    }

    // getter
    public String getAccountHolder() {
        return accountHolder;
    }
}
