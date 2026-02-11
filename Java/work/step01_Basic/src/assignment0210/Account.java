package assignment0210;

public class Account {
    private int balance;
    public static final int MIN_BALANCE = 0;
    public static final int MAX_BALANCE = 1000000;
    public void setBalance(int i) {
        if(i<MIN_BALANCE || i>MAX_BALANCE) {
            System.out.println("0이상 1,000,000이하의 정수를 입력하세요.");
        } else {
            this.balance = i;
        }
    }

    public int getBalance() {
        return this.balance;
    }
}
