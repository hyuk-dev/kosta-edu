package ex0219.lambda;

@FunctionalInterface // 메소드가 단 한개
public interface AInterface {
	void aa();
	default void bb() { // default나 static은 추상 메소드가 아니라 괜찮음
		
	}
}
