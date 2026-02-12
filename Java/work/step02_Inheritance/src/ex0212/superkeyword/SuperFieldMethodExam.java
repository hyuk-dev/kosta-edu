package ex0212.superkeyword;

class Animal {
	int age = 5;
	String bodyColor;
	public void sound() {
		System.out.println("super의 sound call...");
	}
	public void eat() {
		System.out.println("super의 eat call...");
	}
}

class Cat extends Animal{ // Cat is A Animal 성립
	int age = 10;
	int weight;
	
	@Override
	public void sound() {
		System.out.println("cat의 sound call...");
	}
	
	public void run() {
		System.out.println("Cat의 run call");
	}
	
	public void test() {
		System.out.println("** 필드 test **");
		System.out.println(age);
		System.out.println(this.age);
		System.out.println(super.age);
		System.out.println("---------------------");
		System.out.println(bodyColor);
		System.out.println(this.bodyColor);
		System.out.println(super.bodyColor);
		System.out.println("---------------------");
		System.out.println(weight);
		System.out.println(this.weight);
//		System.out.println(super.weight); // super는 무조건 부모를 뜻하기 때문에 접근 불가
		System.out.println("---------------------");
		
		System.out.println(this);
//		System.out.println(super); //단독으로 쓸 수 없다.
		
		System.out.println("*** 메소드 ***");
		sound();
		this.sound();
		super.sound();
		System.out.println("---------------------");
		
		sound();
		this.sound();
		super.sound();
		System.out.println("---------------------");
		
		run();
		this.run();
//		super.run(); // 부모에는 run이 존재 x
		System.out.println("---------------------");
		
	}
}
public class SuperFieldMethodExam {
	public static void main(String[] args) {
//		new Cat().test(); // 1회성, 다신 사용할 수 없음
		
		System.out.println("--외부에서 객체 생성해서 접근--");
		Cat cat = new Cat();
		System.out.println(cat.age);
		System.out.println(cat.bodyColor);
		System.out.println(cat.weight);
		
		cat.sound();
		cat.eat();
		cat.run();
		
		System.out.println("==========================");
		Animal animal = new Cat(); // 다형성, 제약 Animal 부분만 접근 가능
		System.out.println(animal.age); // 부모의 age
		System.out.println(animal.bodyColor); // 부모의 bodyColor
//		System.out.println(animal.weight); // 부모 타입으로 자식부분 접근 불가
		animal.sound(); // ★★ 재정의된 메소드는 부모타입으로 접근해도 재정의된 메소드를 호출한다. ★★
		
		animal.eat();
//		animal.run(); // 부모 타입으로 자식부분 접근 불가
		
		System.out.println("animal = " + animal);
		
		/**
		 * animal으로 접근할 수 없는 자식 부분을 접근하기 위해서
		 * ObjectDownCasting이 필요하다.
		 */
		if(animal instanceof Cat) {
			Cat c = (Cat)animal; // 부모 > 자식 x
			System.out.println(c);
			System.out.println(c.weight);
			c.run();	
		}
		
		Animal a = new Animal();
		if(a instanceof Cat) {
			Cat cc = (Cat)a; // 컴파일 단계에서는 문제가 없는데 실행 단계에서 a가 Cat타입이 아니라서 에러가 발생한다. ClassCastException 발생
		}
		System.out.println("** End **");
	}
}
