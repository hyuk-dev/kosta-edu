package assignment0210;

public class Account {
    private int balance;

    public void setBalance(int i) {
        if(i<0 || i>1000000) {
            System.out.println("0이상 1,000,000이하의 정수를 입력하세요.");
        } else {
            this.balance = i;
        }
    }

    public int getBalance() {
        return this.balance;
    }
}
