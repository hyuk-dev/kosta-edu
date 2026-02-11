package assignment0210;

import java.util.Scanner;

public class BankService {
	/**
	 * 메뉴 뷰를 제공하고, 입력을 받아 해당하는 로직을 실행하는 메소드입니다.
	 * @param sc
	 * @param count
	 * @param baArr
	 */
	public void menuView(Scanner sc, int count, BankAccount[] baArr) {
		while(true) {
            System.out.println("----------------------");
            System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
            System.out.println("----------------------");
            System.out.print("선택>");
            int num = Integer.parseInt(sc.nextLine());
            switch(num) {
                case 1 -> {
                    System.out.println("---------");
                    System.out.println("계좌생성");
                    System.out.println("---------");
                    System.out.print("계좌번호: ");
                    String accountNumber = sc.nextLine();
                    System.out.print("계좌주: ");
                    String owner = sc.nextLine();
                    System.out.print("초기입금액: ");
                    int balance = Integer.parseInt(sc.nextLine());
                    if(count < 100) {

                        baArr[count++] = new BankAccount(accountNumber, owner, balance);
                        System.out.println("결과: 계좌가 생성되었습니다.");

                    } else {

                        System.out.println("결과: 계좌가 생성되지 않았습니다.");
                    }
                }
                case 2 -> {
                    System.out.println("----------------");
                    System.out.println("계좌목록");
                    System.out.println("----------------");
                    
                }
                case 3 -> {
                    System.out.println("-----------");
                    System.out.println("예금");
                    System.out.println("-----------");
                    System.out.print("계좌번호: ");
                    String accountNumber = sc.nextLine();
                    System.out.print("예금액: ");
                    int amount = Integer.parseInt(sc.nextLine());
                    for(int i=0; i<count; i++) {
                        if(baArr[i].getAccountNum().equals(accountNumber)){
                            baArr[i].addBalance(amount);
                        }
                    }
                }
                case 4 -> {
                    System.out.println("-----------");
                    System.out.println("출금");
                    System.out.println("-----------");
                    System.out.print("계좌번호: ");
                    String accountNumber = sc.nextLine();
                    System.out.print("출금액: ");
                    int amount = Integer.parseInt(sc.nextLine());
                    for(int i=0; i<count; i++) {
                        if(baArr[i].getAccountNum().equals(accountNumber)){
                            if(baArr[i].subtractBalance(amount)){
                                System.out.println("결과: 출금이 성공되었습니다.");
                            } else {
                                System.out.println("결과: 출금이 실패했습니다.");
                            }
                        }
                    }
                }
                case 5 -> {
                    System.exit(0);
                }
            }
        }
	}
    
    // 찾기 메소드
	public int findOne(String accountNumber, int count, BankAccount[] baArr) {
		for(int i=0; i<count; i++) {
			if(baArr[i].getAccountNum().equals(accountNumber)) {
				return i; // 찾았을 때 index 반환
			}
		}
		return -1;
	}    
	
    // 계좌 목록 조회 메소드
	public void findAll(int count, BankAccount [] baArr) {
		for(int i=0; i<count; i++){
            baArr[i].getAccountInfo();
        }
	}
}
