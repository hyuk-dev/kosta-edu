package ex0203.scanner;

import java.util.Scanner;

public class ScannerPractice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. 이름 입력    2. 종료");
			int selectedMenu = sc.nextInt();
			switch(selectedMenu) {
				case 1: 
					System.out.println("당신의 이름은");
					sc.nextLine();
					String name = sc.nextLine();
					System.out.println("당신의 이름은 " + name + "입니다.");
					break;
				case 2 :
					System.out.println("종료합니다.");
					System.exit(0);
				default:
					System.out.println("올바른 메뉴의 숫자만 입력하세요.");
			}
		}
		
	}
}
