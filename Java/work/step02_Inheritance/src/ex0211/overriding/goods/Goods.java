package ex0211.overriding.goods;
/**
  상품으로 속성을 관리하는 개체
*/
public class Goods{
	private String code; //상품코드 null
	private String name;//상품이름  null
	private int price;//가격 0 
	private String explain;//설명 null
	
	@Override // jvm이 먼저 찾을 수 있도록 돕는 역할.
	public String toString() {
		return code + " | " + name + " | " + price + " | " + explain;
	}
	
	public String getCode() {
		return this.code;
	}
	
	
	public String getName() {
		return this.name;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public String getExplain() {
		return this.explain;
	}
	
	public Goods () { // 기본 생성자가 없으면 다른 클래스의 부모가 되기 어려움
		
	}
	
	public Goods (String code, String explain, String name, int price) {
		this(code, explain, price);
		this.name = name;
	}
	
	public Goods (String code, String explain, int price) {
		this.code = code;
		this.explain = explain;
		this.price = price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setExplain(String explain){
		this.explain = explain;
	}
	
}