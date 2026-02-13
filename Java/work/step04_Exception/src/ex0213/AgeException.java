package ex0213;
//Exception 이름을 NoKidsException 같은 명확한 이름 지정
public class AgeException extends Exception { // 체크 예외이므로 예외처리 필수
//	public class AgeException extends RuntimeException { // 비체크 예외이므로 예외처리 선택

	private static final long serialVersionUID = 1L;
	static int count = 0;
	public AgeException() {
		super("애들은 안됩니다.");
		count ++;
	}
	
	public AgeException(String message) {
		super(message);
		count ++;
	}
}
