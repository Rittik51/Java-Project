package bankmanagementsoftware;
import java.util.HashMap;
import java.util.Map;
public class Bank {
    private Map<String, Account> accounts;
    public Bank() {
        accounts = new HashMap<>();
    }
    public void addAccount(Account account) {
        accounts.put(account.getAccountNumber(), account);
    }
    public Account getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }
    public void depositToAccount(String accountNumber, double amount) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }
    public void withdrawFromAccount(String accountNumber, double amount) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }
    public void displayAccountDetails(String accountNumber) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            System.out.println(account);
        } else {
            System.out.println("Account not found.");
        }
    }
}


