import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private List<String>transactionHistory;
    private boolean isActive;

    public BankAccount(String accountNumber){
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.transactionHistory = new ArrayList<>();
        this.isActive = true;
    }

    public void withdraw(double amount){
        if (balance == 0) {
            System.out.println("Insufficient funds");
        } else {
            balance -= amount;
            transactionHistory.add("Withdrawal: -" + amount);
        }
    }

    public void deposit(double amount){
        balance += amount*1.01;
        transactionHistory.add("Deposit: +" + amount);
    }
}
