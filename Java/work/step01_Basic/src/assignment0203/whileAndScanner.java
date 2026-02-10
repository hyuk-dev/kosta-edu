package assignment0203;

import java.util.Scanner;

public class whileAndScanner {
	public static void main(String[] args) {
		int money = 0;
		boolean isRun = true;
		while(isRun) {
			System.out.println("---------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("---------------------------------------");
			Scanner sc = new Scanner(System.in);
			System.out.print("선택>");
//			int menu = Integer.parseInt(sc.next());
			String menu = sc.nextLine();
			switch(menu) {
				case "1":
					System.out.print("예금액>");
					int deposit = Integer.parseInt(sc.next());
					money += deposit;
					break;
				case "2":
					System.out.print("출금액>");
					int withDrawal = Integer.parseInt(sc.next());
					money -= withDrawal;
					break;
				case "3":
					System.out.println("잔고: " + money);
					break;
				case "4":
					System.out.println("\n프로그램 종료");
					isRun = false;
					break;
				default:
					System.out.println("1~4 사이의 정수를 입력하세요.");
					break;
			}
		}
	}
}
