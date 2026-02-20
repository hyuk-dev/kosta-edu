package ex0220.set;

public class Member {
	private int age;
	private String name;
	private String addr;
	
	public Member() {}
	
	public Member(int age, String name, String addr) {
		super();
		this.age = age;
		this.name = name;
		this.addr = addr;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddr() {
		return addr;
	}
	
	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Member [age=");
		builder.append(age);
		builder.append(", name=");
		builder.append(name);
		builder.append(", addr=");
		builder.append(addr);
		builder.append("]");
		return builder.toString();
	}
	

	// set에 add할 때 hashCode() 먼저 호출하고 return한 값이
	// set 기존에 들어있던 값중에 있으면 equals() 호출
	@Override
	public int hashCode() {
		System.out.println("1");
		return name.hashCode() + age;
	} 
	
	@Override
	public boolean equals(Object obj) {
		System.out.println(2);
		if(obj instanceof Member m) {
			if(name.equals(m.getName())) {
				return true; // true일 때 중복
			}
		}
		return false; // false일 때 중복아님
	}
	
	
}
