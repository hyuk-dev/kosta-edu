package ex0203;

public class Graduate {
	public static void main(String[] args) {
		String name = new String();
		name = "이동혁";
		int korean = 95, english = 100, math = 85;
		int total = korean + english + math;
		double average = (korean + english + math)/3.0;
		char grade = average > 90 ? 'A' : 'F';
		System.out.println("국어: " + korean);
		System.out.println("영어: " + english);
		System.out.println("수학: " + math);
		System.out.println("총점: " + total);
		System.out.println("평균: " + average);
		System.out.println("학점: " + grade);
		
	}
}
