package ex0205.staticex;

class Test {
	int a; // 전역 변수 0 - 인스턴스 필드
	static int b; // static 전역 변수 0 - 공유 필드(변수)
	
	// non-static 메소드에서 static, non-static 접근 가능
	public void aa() {
		System.out.println(a);
		System.out.println(this.a);
		
		System.out.println(b);
		System.out.println(this.b);
		System.out.println(Test.b);
	}
	
	public void bb() {
		// 메소드 호출
		aa();
		this.aa();
		
		cc();
		this.cc();
	}
	
	//static 메소드에서는 static만 접근, this 사용불가능
	public static void cc() {
//		System.out.println(a);
//		System.out.println(this.a);
		
		System.out.println(b);
//		System.out.println(this.b);
		System.out.println(Test.b);
	}
	
	public static void dd() {
		// 메소드 호출
//		aa();
//		Test.aa();
//				
		cc();
		Test.cc();
	}
	
}

public class StaticVariableExam {
	static int i;
	static {
		System.out.println("난 메인보다 먼저 실행될 거야.");
	}

	public static void main(String[] args) {
		
		Test.dd();
		
		System.out.println("----- 메인 시작 -----" + i);
		// 객체 생성
		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = new Test();
		
		System.out.println("t1 = "+t1);
		System.out.println("t2 = "+t2);
		System.out.println("t3 = "+t3);
		
		System.out.println("---non-static 접근---");
		System.out.println("t1.a = " + t1.a);
		System.out.println("t2.a = " + t2.a);
		System.out.println("t3.a = " + t3.a);
		
		// a 값 변경
		t2.a = 100;
		System.out.println("-- 변경 후 접근 --");
		System.out.println("t1.a = " + t1.a);
		System.out.println("t2.a = " + t2.a);
		System.out.println("t3.a = " + t3.a);
		
		System.out.println("---static 접근---");
		System.out.println("t1.b = " + t1.b);
		System.out.println("t2.b = " + t2.b);
		System.out.println("t3.b = " + t3.b);
		
		// b 값 변경
		t2.b = 100;
		System.out.println("-- 변경 후 접근 --");
		System.out.println("t1.b = " + t1.b);
		System.out.println("t2.b = " + t2.b);
		System.out.println("t3.b = " + t3.b);
		
		
	}

}
