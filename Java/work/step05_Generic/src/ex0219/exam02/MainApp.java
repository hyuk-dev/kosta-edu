package ex0219.exam02;

public class MainApp {

	public static void main(String[] args) {
		Product<Tv, String> p1 = new Product<>();
		p1.setKind(new Tv());
		p1.setModel("삼성 tv");
		
		Tv tv = p1.getKind();
		
		//////////////////////////////
		
		// 기본형은 제너릭 타입으로 쓸 수 없다.
		Product<Video, Integer> p2 = new Product<>();
		p2.setKind(new Video());
		p2.setModel(5); // 오토 박싱
		
		Video v = p2.getKind();
//		Integer it = p2.getModel(); // 언박싱
		int it = p2.getModel();
	}

}
