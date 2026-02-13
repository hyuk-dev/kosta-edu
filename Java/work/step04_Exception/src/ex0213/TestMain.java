package ex0213;

import java.util.Random;

public class TestMain {
	public static void main(String[] args) {
		
		ShoppingMall sm = new ShoppingMall();
		
		Random r = new Random();
		
		for(int i=0; i<10; i++) {
			
//			int age = (int)(Math.random()*55) + 1;
			int age = r.nextInt(55) + 1;

			System.out.println(age + "세");
			try {
				sm.checkAdult(age);
			} catch (AgeException e) {
				
				System.out.println(e.getMessage());
			}
			System.out.println("----------------");
		}
		System.out.println("애들은 총" + AgeException.count + "명입니다.");
	}
}
