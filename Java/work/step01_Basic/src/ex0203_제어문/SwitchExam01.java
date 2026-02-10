package ex0203_제어문;

public class SwitchExam01 {
	public static void main(String[] args) {
		// 1 ~ 12 난수 발생
		int month = (int)(Math.random() * 12) + 1;
		System.out.println("난수 = " + month);
		// 난수를 월로 생각하고 월에 해당하는 마지막 일수 출력.
		int lastDay;
//		if(month == 2) {
//			lastDay = 28;
//		} else if(month == 4 || month == 6 || month == 9 || month == 11) {
//			lastDay = 30;
//		} else {
//			lastDay = 31;
//		}
		
//		switch(month) {
//			case 2:
//				lastDay = 28;
//				break;
//			case 4,6,9,11:
//				lastDay = 30;
//				break;
//			default:
//				lastDay = 31;
//		}
		
		lastDay = switch(month) {
			case 2 -> 28;
			case 4,6,9,11 -> {
				System.out.println("안녕");
				yield 30;
			}
			default -> 31;
		};
		System.out.println(month + "월은" + lastDay + "일까지 있습니다.");
		
	}
}
