package assignment0205.array;

import java.util.Scanner;

class Calculator {
	public double getAverage(int sum, int size) {
		return (double)sum/size;
	}
	public int getSum(int[] score) {
		int sum = 0;
		for(int i:score) {
			sum+=i;
		}
		return sum;
	}
	public int getMax(int[] score) {
		int max = 0;
		for(int i:score) {
			if(max < i) max = i;
		}
		return max;
	}
}

public class ArrayQuestion9 {
	
	public boolean checkLen(int len) {
		if(len < 0) {
			return false;
		} return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = new int[0];
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("--------------------------------------");
			System.out.println("1. 학생 수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("--------------------------------------");
			System.out.print("선택>");
			int selected = sc.nextInt();
			int len = score.length;

			switch(selected) {
				case 1 -> {
					System.out.print("학생 수>");
					int size = sc.nextInt();
					score = new int[size];
				}
				case 2 -> {
					if(len == 0) {
						System.out.println("먼저 학생수를 입력해야합니다.");
					} else {
						for(int i=0; i<len; i++) {
							System.out.print("score["+i+"]>");
							int now_score = sc.nextInt();
							score[i] = now_score;
						}
					}
				}
				case 3 -> {
					if(len == 0) {
						System.out.println("먼저 학생수를 입력해야합니다.");
					}
					for(int i=0; i<len; i++) {
						System.out.println("score["+i+"]: " + score[i]);
					}
				}
				case 4 -> {
					if(len == 0) {
						System.out.println("먼저 학생수를 입력해야합니다.");
					} else {
						Calculator cal = new Calculator();
						int sum = cal.getSum(score);
						double avg = cal.getAverage(sum, len);
						int max = cal.getMax(score);
						System.out.println("최고 점수: " + max);
						System.out.println("평균 점수: " + avg);
					}
				}
				case 5 -> {
					System.out.println("프로그램 종료");
					System.exit(0);
				}
				default -> {
					System.out.println("1~5 사이의 정수를 입력하세요.");
				}
			}
		}
	}

}
