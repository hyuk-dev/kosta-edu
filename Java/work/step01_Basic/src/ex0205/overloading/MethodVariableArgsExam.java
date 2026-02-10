package ex0205.overloading;

class Test {
	public void aa(int ... i) { // 매개 값을 0개이상 허용
		System.out.println("aa call....");
		System.out.println("i = " + i);
		
		for(int a:i) {
			System.out.println(a + " ");
		}
		
		System.out.println("\n----------------------");
	}
	
	public void bb(String s, int ... i) { // variable arguments는 하나의 파라미터에 한번만 쓸 수 있다.
		
	}
}

public class MethodVariableArgsExam {
	public static void main(String[] args) {
		// 메소드 호출
		Test t = new Test();
		t.aa(2);
		t.aa(2,4);
		t.aa(2,4,6);
		
		t.bb("aaa", 4, 5);
		
		
	}
}
