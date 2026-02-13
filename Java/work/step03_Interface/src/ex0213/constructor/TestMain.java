package ex0213.constructor;

class B {
	public B() {
		System.out.print("1 ");
	}
	public B(int i) {
		this("2");
		System.out.print("2 ");
	}
	public B(String s) {

		System.out.print("3 ");
	}
}

class A extends B{
	public A() {
		this(1);
		System.out.print("4 ");
	}
	public A(int i) {
		super(1);
		System.out.print("5 ");
	}
	public A(boolean b) {
		System.out.print("6 ");
	}
}

public class TestMain{
	public static void main(String[] args) {
		new A();
	}
}
