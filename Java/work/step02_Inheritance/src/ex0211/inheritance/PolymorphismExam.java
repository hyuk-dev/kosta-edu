package ex0211.inheritance;
class CarCenter{
	public void engineer(Car cd){ // 매개변수를 사용한 다형성 -> 접근범위 제약
		System.out.print(cd.carname+" 수리완료!\t");
		System.out.println("청구비용"+cd.cost+" 원");
		System.out.println("cd 주소: " + cd);
//		System.out.println("cd.i : " + cd.i);  // 부모 타입으로는 자식부분 접근 불가.
		
		
		if(cd instanceof EfSonata) {
			//접근이 가능하도록 부모타입을 자식타입으로 변환
			EfSonata efs = (EfSonata)cd; // 부모가 더 크다고 본다. 그래서 자식 타입에 부모를 담을 수 없다. -> 형변환 필요
			System.out.println("efs주소 : " + efs);
			System.out.println("efs.i : " + efs.i);
		}
	}
}

public class PolymorphismExam{
	public static void main(String[] args) {
		
		CarCenter cc=new CarCenter();
		EfSonata ef=new EfSonata();
		Carnival ca=new Carnival();
//		Car ca = new Carnival(); // 자식은 부모에 담을 수 있지만
//		Carnival cv = new Car(); // 부모는 자식에 담을 수 없다.
		Excel ex=new Excel();
		
		Car c= new Car();
		
//		cc.engineer(c);// c의 주솟값 전달
		cc.engineer(ef);// polymorphism(다형성)에 의해 ef가 Car 타입으로도 될 수 있다.
		System.out.println("ef주소 : " + ef);
		System.out.println("ef.i = " + ef.i);
		cc.engineer(ca);//
		cc.engineer(ex);//
		
		
	
	}
}
