package ex0212.superkeyword;

class Parent {

	Parent(int i) {
		System.out.println(2);
	}
	
	Parent(String s) {
		System.out.println(3);
	}
}

class Child extends Parent { // Child는 Parent라고 할 수 있고 Object 라고 할 수 있다.
	Child() {
		// super(); 생략
		this(100);
		System.out.println(4);
	}
	Child(int i) {
		this(true); 
		// super(); 생략
		System.out.println(5);
	}
	Child(boolean b) {
		// super(); 생략
		super(100);
		System.out.println(6);
	}
}

public class SuperConstructorExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// new Child(); // 1 4
		// new Child(10); // 1 5
		// new Child(true); // 1 6
		/* 모든 자식생성자 구현부 첫번째 줄에 super()가 생략되어 있다.*/
		
		//만약, 부모의 생성자 하나도 없다면
		//		new Child(); // 4
		//		new Child(1); // 5
		//생성자를 하나도 작성하지 않으면 기본생성자 자동으로 삽입
		
		//만약, 부모의 기본생성자 없고, 다른 생성자 추가했다면 부모에 기본 생성자가 추가되지 않는다.
		new Child();
	}
}
