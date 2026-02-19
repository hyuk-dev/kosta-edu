package ex0219.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListExam02 {
	List<Integer> list = new ArrayList<Integer>(5); // 반드시 인터페이스에 담기
//	List<Integer> list = new Vector<Integer>(5); // 반드시 인터페이스에 담기
//	List<Integer> list = new LinkedList<Integer>(); // 반드시 인터페이스에 담기
	
	public ListExam02() {
		
		// 추가
		list.add(10);
		list.add(5);
		list.add(15);
		list.add(7);
		list.add(5);
		list.add(5);
		
		// list에 저장된 객체의 개수 출력
		System.out.println("저장된 개수 = " + list.size());
		
		// 저장된 정보를 출력
		for(int i : list) {
			System.out.println("no = " + i);
		}
		
		// 제거
		boolean b = list.remove((Object)7);
		System.out.println("b = " + b);
		
		// 제거 후
		for(int i : list) {
			System.out.println("no = " + i);
		}
		
		System.out.println("==== 정렬하기 ====");
		System.out.println("정렬 전 : " + list); // this.toString()
		
		Collections.sort(list); // 기본 오름차순 정렬
		
		System.out.println("정렬 후 : " + list);
		
		// 내림차순 정렬
		
		Collections.sort(list, Collections.reverseOrder());
		
		System.out.println("정렬 후 : " + list);
	}
	public static void main(String[] args) {
		new ListExam02();
	}

}
