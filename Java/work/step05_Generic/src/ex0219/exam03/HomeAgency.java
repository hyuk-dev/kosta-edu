package ex0219.exam03;

// 인터페이스는 구현 객체가 만들어질 때 타입을 결정해야한다.
public class HomeAgency implements Rentable<Home> {

	@Override
	public Home rent() {
		return new Home();
	}
	
	
	
}
