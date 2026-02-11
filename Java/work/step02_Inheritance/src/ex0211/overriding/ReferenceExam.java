package ex0211.overriding;
class ObjectExam{
	String str;
	
	public ObjectExam(){   }
	public ObjectExam(String str){  
		this.str = str;
	}
	
	@Override
	public String toString() {
		return this.str + "= " + super.toString();
	}
}
class ReferenceExam{
	public static void main(String[] args){
			char c='a';
			String s01="장희정"; 
			String s02="Java";
			String s03=new String("월요일");
			ObjectExam oe1=new ObjectExam("아 집에가고싶다");
			ObjectExam oe2=new ObjectExam("안녕");
			
			/**
			 * print(Object obj) or println(Object obj) 메소드는
			 * 인수로 전달된 객체.toString()을 호출한다.
			 * toString()이 리턴하는 값을 출력하게 된다.
			 * 
			 * Object에 정의된 toString은 객체의 주소 (class이름@hashcode)를 문자열로 리턴
			 * Object상속받은 String은 toString을 재정의 -> 자신의 문자열 리턴
			 */
			System.out.println(c);//
			System.out.println(s01);//
			System.out.println(s02);//
			System.out.println(s03);//
			System.out.println(oe1.toString());//
			System.out.println(oe2);//
			
	}
}