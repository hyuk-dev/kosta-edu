package assignment0210;

import java.util.Scanner;

public class BankApplication {
    
	public static void main(String[] args) {

        BankAccount[] baArr = new BankAccount[100];
        Scanner sc = new Scanner(System.in);
        int count = 0;
        BankService bs = new BankService();
        bs.menuView(sc,count,baArr);
        
    }
    

}
