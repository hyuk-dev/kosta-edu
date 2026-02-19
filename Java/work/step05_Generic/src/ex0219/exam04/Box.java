package ex0219.exam04;

// 제너릭 없이
//public class Box {
//	private Object content;
//	
//	public void setContent(Object content) {
//		this.content = content;
//	}
//	
//	public Object getContent() {
//		return content;
//	}
//}

public class Box<T> {
	private T content;
	
	public void setContent(T content) {
		this.content = content;
	}
	
	public T getContent() {
		
		return content;
	}
	
	// 제너릭 메소드
	public <A, B> T test(A a, B b) {
		return null;
	}
}

