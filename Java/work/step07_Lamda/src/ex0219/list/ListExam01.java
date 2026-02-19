package ex0219.list;

import java.util.ArrayList;
import java.util.Collections;

public class ListExam01 extends ArrayList<Integer> {

	public ListExam01() {
		super(5); // int 형 받는 부모 생성자 함수 호출
		
		// 추가
		super.add(10);
		add(5);
		this.add(15);
		super.add(7);
		this.add(5);
		this.add(5);
		
		// list에 저장된 객체의 개수 출력
		System.out.println("저장된 개수 = " + super.size());
		
		// 저장된 정보를 출력
		for(int i : this) {
			System.out.println("no = " + i);
		}
		
		// 제거
		boolean b = this.remove((Object)7);
		System.out.println("b = " + b);
		
		// 제거 후
		for(int i : this) {
			System.out.println("no = " + i);
		}
		
		System.out.println("==== 정렬하기 ====");
		System.out.println("정렬 전 : " + this); // this.toString()
		
		Collections.sort(this); // 기본 오름차순 정렬
		
		System.out.println("정렬 후 : " + this);
		
		// 내림차순 정렬
		
		Collections.sort(this, Collections.reverseOrder());
		
		
		Collections.reverse(this);
		
		System.out.println("정렬 후 : " + this);
	}
	public static void main(String[] args) {
		new ListExam01();
	}

}
