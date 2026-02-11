package personal.ex0211;

public class inheritanceEx {
	public static void main(String[] args) {
		Parents p = new Child();
		Child ch = new Child();
		
		System.out.println("p.a : " + p.a);
		System.out.println("ch.a : " + ch.a);
		ch.printSuperA();
		p.test();
		String s = "테스트";
		System.out.println(p.toString());
	}
}

class Child extends Parents {
	int a = 100;
	int c = 200;
	
	void printSuperA() {
		System.out.println(super.a);
		
	}
	
	@Override
	void test() {
		System.out.println("재정의 된 자식의 메서드");
	}
}

class Parents {
	int a = 5;
	
	void test() {
		System.out.println("부모의 메서드");
	}
}
