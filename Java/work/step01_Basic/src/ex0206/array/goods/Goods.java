package ex0206.array.goods;
/**
  상품으로 속성을 관리하는 개체
*/
public class Goods{
	private String code; //상품코드 null
	private String name;//상품이름  null
	private int price;//가격 0 
	private String explain;//설명 null
	
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
	
	public Goods (String code, String explain, int price) {
		this.code = code;
		this.explain = explain;
		this.price = price;
	}
	
	public Goods (String code, String explain, String name, int price) {
		this.code = code;
		this.name = name;
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