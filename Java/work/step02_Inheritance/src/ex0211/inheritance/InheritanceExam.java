package ex0211.inheritance;

class Car{
		public String carname;
		public int cost;
		
		protected void printAttributes(){
			System.out.println("carname="+carname+"\tcost="+cost);
		}
}

//Car를 상속받는 EfSonata, Excel, Carnival 3개 클래스 작성	
//각 클래스에 인수를 받지않는 생성자 작성
//각 클래스의 생성자의 구현부에서 carname과 cost에 적당한 값 할당

class EfSonata extends Car { // EfSonata는 Car를 상속받는다.
	int i = 100;
	public EfSonata() {
		this.carname = "소나타";
		super.cost = 19000000;
	}
	
}

class Excel extends Car {
	public Excel () {
		this.carname = "엑셀";
		super.cost = 25000000;
	}
}

class Carnival extends Car {
	public Carnival () {
		this.carname = "카니발";
		super.cost = 45000000;
	}
}
	
	

public class InheritanceExam{
	//메인메소드에서 
	
		//Car, EfSonata, Excel, Carnival 네개의 객체를 생성
		// 각 클래스에서 Car class에 있는 printAttributes()메소드를 호출할수있다.
		public static void main(String[] args) {
			Car c = new Car();
			EfSonata es = new EfSonata();
			Excel e = new Excel();
			Carnival ca = new Carnival();
			
			c.printAttributes();
			es.printAttributes();
			e.printAttributes();
			ca.printAttributes();
		}
}

