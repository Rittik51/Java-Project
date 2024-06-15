package bankmanagementsoftware;
public class Account {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    public Account(String accountNumber, String accountHolderName, 
            double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid amount or insufficient balance.");
        }
    }
    @Override
    public String toString() {
        return "Account Number: " + accountNumber + "\nAccount Holder: " 
                + accountHolderName + "\nBalance: " + balance;
    }
}
