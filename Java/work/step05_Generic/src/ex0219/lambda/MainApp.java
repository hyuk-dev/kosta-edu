package ex0219.lambda;

public class MainApp {

	public static void main(String[] args) {
		// 1. 기존 방식
//		AInterface ai = new Test(); // Polymorphism
//		ai.aa();

		// 2. AnnonymousInnerType으로 작성 ( 익명 타입 선언 ) 
//		Ainterface ai = new Xxx() { // 1회성
//			재정의
//		}; // body 포함이니 구현
//		AInterface ai = new AInterface() {
//			@Override
//			public void aa() {
//				System.out.println("AnonymousInner aa 호출됨!!");
//			}
//		};
//		ai.aa();
		
		// 3. 람다식
		AInterface ai = () -> System.out.println("잠온다");
		ai.aa();
		
		// 인수가 있는 람다식
		BInterface bi = (i) -> System.out.println(i);
		bi.bb(500);
		
		// 인수 with 리턴 람다식
		CInterface ci = (i, j) -> i + j;
		int result = ci.cc(5, 12);
		
		System.out.println(result);
		
	}
}
/////////////////////////////

class Test implements AInterface{
	@Override
	public void aa() {
		System.out.println("Test의 aa 구현 메소드");
	}
}
