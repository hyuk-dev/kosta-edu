package assignment0210;

public class BankAccount {
    String accountNumber;
    String owner;
    int balance;

    public BankAccount(String accountNumber, String owner, int balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public void getAccountInfo() {
        System.out.println(accountNumber + " " + owner + " " + balance);
    }

    public String getAccountNum() {
        return accountNumber;
    }

    public void addBalance(int amount) {
        this.balance += amount;
    }

    public boolean subtractBalance(int amount) {
        if(this.balance >= amount) {
            this.balance -= amount;
            return true;
        } else {
            return false;
        }

    }
}
