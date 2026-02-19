package ex0219.exam05;

/**
 * 신청 - 누가 신청을 하느냐
 */
public class Applicant<T> {
	private T kind; // 사람, 직장인, 학생, 고등학생, 중학생

	public Applicant(T kind) {
		this.kind = kind;
		System.out.println(this.toString());
	}
	
	public T getKind() {
		return kind;
	}

	public void setKind(T kind) {
		this.kind = kind;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Applicant [kind=");
		builder.append(kind.getClass().getSimpleName());
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
