package ex0220.set;

import java.util.HashSet;
import java.util.Set;

public class MemberSetExam {
	Set<Member> set = new HashSet<Member>();
	public MemberSetExam() {
		// 회원 추가
		set.add(new Member(20, "동혁", "부산"));
		set.add(new Member(30, "가혁", "마산"));
		set.add(new Member(20, "동혁", "부산"));
	
		System.out.println("저장된 개수 = " + set.size());
		
	}
	public static void main(String[] args) {
		new MemberSetExam();
	}
	

}
