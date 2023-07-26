package ch06;

public class Account {
    private int balance;
    final static int MIN_BALANCE = 0;
    final static int MAX_BALANCE = 1000000;

    public void setBalance(int balance) {
        if (MIN_BALANCE <= balance && balance <= MAX_BALANCE) {
            this.balance = balance;
        }
    }

    public int getBalance() {
        return balance;
    }
}
