package ex0220.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetExam {
//	Set<String> set = new HashSet<String>();
//	Set<String> set = new TreeSet<String>(); // 정렬이 이미 됨 (TreeSet)
	Set<String> set = new TreeSet<String>(Collections.reverseOrder()); // 정렬 (내림차순)
	
	public SetExam(String[] args) {
		//추가
		for(String s : args) {
			boolean re = set.add(s); // 중복 안됨
			System.out.println(s + " 추가 결과 = " + re);
		}
		
		System.out.println("저장된 개수 = " + set.size());
		
		// 저장된 정보를 조회 (출력)
		System.out.println("--- 정보 출력 ---");
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String s = it.next(); 
			System.out.println(s); // 순서 보장하지 않지만 여러번 시도해도 결과 값은 동일함 (내부 로직)
		}
		
		System.out.println("\n -- 요소 제거 --");
		boolean re = set.remove("김혁");
		System.out.println("제거 결과 = " + re);
		System.out.println("제거 후 : " + set);
		
		System.out.println("\n --- 존재 여부 ---");
		re = set.contains("동혁");
		System.out.println("결과 : " + re);
		
	}
	
	public static void main(String[] args) {
		new SetExam(args);
	}
}
