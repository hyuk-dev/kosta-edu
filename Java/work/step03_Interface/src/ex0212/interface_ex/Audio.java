package ex0212.interface_ex;

public class Audio extends Elec implements ElecFunction {
	private int volumn;
	
	public Audio() {
		
	}
	
	public Audio(int volumn) {
		this.volumn = volumn;
	}
	
	public Audio(String code, int cost, int volumn) {
		super(code, cost);
		this.volumn = volumn;
	}
	
	@Override // @Override 어노테이션은 오버라이딩이라는 걸 jvm이 더 빨리 이해할 수 있도록 돕는다.
	public void start() {
		System.out.println(getCode()+"의 Audio를 "+volumn+"으로 듣는다.");
	}
	
	@Override
	public void stop() {
		System.out.println(getCode()+"의 Audio를 멈춘다.");
	}
	
	@Override
	public void display() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" volumn=");
		builder.append(volumn);
		builder.append("]");
		return builder.toString();
	}
	
	

}
