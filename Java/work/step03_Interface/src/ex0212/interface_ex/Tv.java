package ex0212.interface_ex;

public class Tv extends Elec implements ElecFunction {
	private int chnnel;
	
	public Tv() {}
	
	public Tv(int chnnel) {
		this.chnnel = chnnel;
	}

	public Tv(String code, int cost, int chnnel) {
		super(code, cost);
		this.chnnel = chnnel;
	}
	
	@Override
	public void start() {
		System.out.println(getCode()+"제품 TV를 "+chnnel+"을 본다");
	}
	
	@Override
	public void stop() {
		System.out.println(getCode()+"제품 TV를 "+chnnel+"을 끈다");
	}
	
	@Override
	public void display() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("chnnel=");
		builder.append(chnnel);
		builder.append("]");
		return builder.toString();
	}
	
}
