package ex0213;

public class ShoppingMall  {
	public void checkAdult(int age) throws AgeException { // throws는 메소드에 붙이기
		if(age < 18) {
			//발생할 객체 생성
//			AgeException e = new AgeException();
//			throw e;
			// 결과적으로 보면 위와 아래의 로직은 같다.
			throw new AgeException(age + "살인 애들은 가라"); // 체크 예외
		} else {
			System.out.println(age + "살이시네요. 어서 들어오세요.");
		}
	}
}
