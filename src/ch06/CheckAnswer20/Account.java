package ch06.CheckAnswer20;

public class Account {
    private String accountNumber;
    private String accountHolder;
    private int balance;

    public void setBalance(int balance) {
        if (0 <= balance) {
            this.balance = balance;
        }
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
