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
	
	@Override
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
